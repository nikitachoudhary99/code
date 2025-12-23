// event and event listener

// let h1 = document.querySelector("h1");
// h1.addEventListener("click",function(){
//     h1.style.color = "red";
// })

// let p = document.querySelector("p");
// p.addEventListener("click",function(){
//     p.style.color = "green";
// })

// doubleclick-->dblclick likhte he
// let p = document.querySelector("p");
// p.addEventListener("dblclick",function(){
//     p.style.color = "yellow"
// })

// REMOVELISTENER
// let p = document.querySelector("p");
// function dblclick(){
//     p.style.color = "yellow"
// }
// p.addEventListener("dblclick",dblclick);
// p.removeEventListener("dblclick",dblclick);


// 1 Click EventListener
// let button = document.getElementById("btn");
// button.addEventListener("click",function(){
//     console.log("Button Clicked !");
// })

// 2 Input EventListener
// let input = document.getElementById("nameInput");
// input.addEventListener("input",function(){
//     console.log("User Typed Something");
// })

// let input = document.getElementById("nameInput"); 
// input.addEventListener("input",function(dets){
//     console.log(dets.data); 
// })

// let input = document.getElementById("nameInput");
// input.addEventListener("input",function(dets){
//     if(dets.data !== null){
//         console.log(dets.data);
        
//     }
// });

// change event tab chalta hai jab aapko koi input select ya textarea main koi change ho jaaye
// 3 change EventListener
// let sel = document.querySelector("select");
// let device = document.querySelector("#device");
// sel.addEventListener("change",function(dets){
//     device.textContent = `${dets.target.value} Device Selected`;
    
// })
 
//  let h1 = document.querySelector("h1");
//  window.addEventListener("keydown",function(dets){
//     if(dets.key === " "){
//         h1.textContent = "SPC"
        
//     }else{
//         h1.textContent = dets.key
//     }
//  })   