/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrito.Controlador;

import Modelo.Detalles_Pedido;
import com.mycompany.carrito.Controlador.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author usuario
 */
public class Detalles_PedidoJpaController implements Serializable {

    public Detalles_PedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalles_Pedido detalles_Pedido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalles_Pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalles_Pedido detalles_Pedido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalles_Pedido = em.merge(detalles_Pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detalles_Pedido.getId_DP();
                if (findDetalles_Pedido(id) == null) {
                    throw new NonexistentEntityException("The detalles_Pedido with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalles_Pedido detalles_Pedido;
            try {
                detalles_Pedido = em.getReference(Detalles_Pedido.class, id);
                detalles_Pedido.getId_DP();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalles_Pedido with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalles_Pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalles_Pedido> findDetalles_PedidoEntities() {
        return findDetalles_PedidoEntities(true, -1, -1);
    }

    public List<Detalles_Pedido> findDetalles_PedidoEntities(int maxResults, int firstResult) {
        return findDetalles_PedidoEntities(false, maxResults, firstResult);
    }

    private List<Detalles_Pedido> findDetalles_PedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalles_Pedido.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Detalles_Pedido findDetalles_Pedido(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalles_Pedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalles_PedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalles_Pedido> rt = cq.from(Detalles_Pedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
