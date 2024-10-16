document.addEventListener("DOMContentLoaded",()=>{

    let adds= document.querySelectorAll("#add");
    let anu= document.getElementById("anuncio");
    let clsA= document.getElementById("clsA");
    
    adds.forEach(elemento => {
        elemento.addEventListener("click",()=>{
        anu.style.display="block";    
        });
    });

    clsA.addEventListener("click",()=>{
        anu.style.display="none";
    });

});

