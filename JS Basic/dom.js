// DOM Manipulation
// html se element select karna

// 1 getElementById

// let t1 = document.getElementById("t1");
// console.log(t1);  //refresh karne par tag dekhega isliye console.log ki jagah console.dir()use kar sakte he
// console.dir(t1)

// 2 getElementsByClassName()
// let t2 = document.getElementsByClassName("t2");
// console.log(t2);


// 3 querySelector()
// let h1 = document.querySelector("h1");
// console.dir(h1);

// 4 querySelectorAll()
// let h1 = document.querySelectorAll("h1");
// console.dir(h1);

// text badalna
// 1 using innerText
// let h1  = document.querySelector("h1");
// h1.innerText= "Hello World"
// console.dir(h1);

// 2 using textContent 
// let h1 = document.querySelector("h1");
// h1.textContent = "MERN Stack";
// console.dir(h1)

// html badalna
// 3 using innerHTMl
// let h1 = document.querySelector("h1");
// h1.innerHTML = "<i>hey</i>";
// // h1.hidden = true;
// console.dir(h1);

// attribute

// let a = document.querySelector("a");
// a.href = "https://www.google.com";

// 1 setAttribute()
// let a = document.querySelector("a");
// a.setAttribute("href","https://www.google.com")

// let img = document.querySelector("img");
// img.setAttribute("src","https://images.unsplash.com/photo-1762838896723-0d2fe5948fe0?q=80&w=388&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")

// 2 getAttribute
// let a =document.querySelector("a");
// console.log(a.getAttribute("href"));

// 3 removeAttribute
// let a= document.querySelector("a");
// a.removeAttribute("href");

// 4 hasAttribute()
// let a= document.querySelector("a");
// console.log(a.hasAttribute("href"));

// dynamic dom manipulation

// 1 createElement()
// let h1 = document.createElement("h1");
// h1.textContent = "Hello ji kaise ho!";
// document.body.append(h1);

// let h1 = document.createElement("h1");
// h1.textContent = "Namaste";
// document.querySelector("body").append(h1)

// let h1 =  document.querySelector("h1");
// h1.remove();

// let h1 = document.createElement("h1");
// h1.textContent = "Hello World!";
// document.querySelector("div").appendChild(h1);

// let h1 = document.createElement("h1");
// h1.textContent = "Hello World!";
// document.querySelector("div").append(h1);

// let h1 = document.createElement("h1");
// h1.textContent = "Hello World!";
// document.querySelector("div").prepend(h1);

// let h1 = document.createElement("h1");
// h1.textContent = "Hello World!";
// document.querySelector("div").prepend(h1);


//  js se css badalna
// let h1 = document.querySelector("h1");
// h1.style.color = "red";
// h1.style.backgroundColor = "black";
// h1.style.fontFamily = "Gilroy";
// h1.style.textTransform = "capitalize"
// console.dir(h1)

// let h1 = document.querySelector("h1");
// h1.classList.add("css");

// agar by default class lage he tu
// let h1 = document.querySelector("h1");
// h1.classList.remove("css")

// use toggle agar class lage hogi tu hata dega or class nhi hoti tu laga deta he
// let h1 = document.querySelector("h1");
// h1.classList.toggle("css")

// Select all <li> elements and print their text using a loop

// let lis = document.querySelectorAll("li");
// lis.forEach(function(val){
//     console.log(val.textContent);
    
// })

// let lis = document.querySelectorAll("li");
// for(i=0;i<lis.length;i++)
// {
//     console.log(lis[i].textContent);
    
// }

// select a paragraph and relpace its content with: <b>update</b> by javascript
// let p = document.querySelector("p");
// p.innerHTML = "<b>Update</b> by JavaScript";

// how do you get the src of an image using javascript
// let img = document.querySelector("img");
// console.log(img.src);

// let img = document.querySelector("img");
// console.log(img.getAttribute("src"));

// Add a little attribute to  div dynamically
// let div = document.querySelector("div");
// div.setAttribute("title","Some info");

// Remove the disabled attribute from a button.
// let btn = document.querySelector("button");
// btn.removeAttribute("disabled");

// create  new list item <li> New Task</li> and add it to the end of a <ul>
// let ul = document.querySelector("ul");
// let li = document.createElement("li");
// li.textContent = "New Task ";
// ul.appendChild(li);

// Create a new image element with a placeholder source and it at the top of a div

// add a highlight class to every even,item in a list.
let li = document.querySelectorAll("ul li:nth-child(2n)");
li.forEach(function(elem){
    elem.classList.add("highlight");
})

// event listener
