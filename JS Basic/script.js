// console.log(5+6*4); // 20  11+20 = 29
// console.log(5+6-4*5); //   11-20 = -9
// console.log(5+6-4/2);  // 5+6-2 11-2 = 9
// console.log(5 + 6 - 4/2 *4); //5 + 6 - 2*2 //5+6-8 //11-8 = 3
// console.log(6-3+2); //3+2 = 5
// console.log(8-(5+6)); //8-11 = -3

// let firstname = 'Trapti'
// let lastname = 'chouhan'
// let age = 21;
// firstname = 'Tanu'
// let ishappy = true;
// let userintro = 'Hii, I am ' + firstname +' '+ lastname + '. I am ' + age + ' Year old.'
// let a = null

// higher order function
// function a(b)
// {
//   console.log(typeof b);
//   console.log(b);
//   b(); // b is not a function
  
// }
//  a('hii'); // is ka type string
// // a({username:"trapti",userage:21}) //ye object he tu iska bhi type object he
// // a([1,2,3,4]); // ye array he iska type object

// console.log(typeof a);


// function a(b){  // higher order function
//     console.dir(b);
//     b()
// }

// function sayHi(){
//     console.log("Hiii");
    
// }
// a(sayHi);
// sayHi ()

//call back function
// a(function() { //anonymous function
//     console.log("hello");
    
// })

//  setTimeout
// setTimeout('console.log("Hii"); console.log("I am Trapti")',4000)

// using template literal backticks
//setTimeout(`console.log('hii') 
  //  console.log("I am Trapti")`,2000)


  //SET TIME OUT
//const timer1 =  setTimeout('console.log("hii-1")',2000)
//const timer2 =  setTimeout('console.log("hii-2")')
//const timer3 = setTimeout(a,4000,'hii',56,89,{name:'trapti',rno:201}) //after set time value as a argument 

// SET INTERVAL
//const timer1 =  setInterval('console.log("hii-1")',1000)
//const timer2 =  setInterval('console.log("hii-2")',2000)
//const timer3 = setInterval(a,4000,'hii',56,89,{name:'trapti',rno:201})
  
//clearInterval(timer1)
//clearTimeout(timer3)

//function a(){ // normal ya named function
  //console.log("Hello");
//console.log(arguments[0]);
  
//}
//console.log("Namaste")

// setTimeout(function(){ // asynchronous code it is anonymous function
//   console.log("hii"); // secon print
  
// })
// console.log("hello"); //first print synchronous code

// console.log(firstname);

// var firstname = "Trapti";
// let lastname = "Chouhan";
// let age = 15

// dialog boxes
// alert("Your message goes here");
// const isconfirmed = confirm("hii")
// const userInput = prompt("Please enter your name")
// console.log(userInput)

// STRING METHOD AND PROPERTIES

// const message = "Hello World!"
//console.log(message);

// const capitalMessage = message.toUpperCase();

// const smallmessage = message.toLowerCase();

// const faltuMessage = "   hii I am Trapti"
// const finalMessage = faltuMessage.trim()

// const replaceMessage  = finalMessage.replace('hii','Hello')

// const lastFourDigits = '789236'
// const markedAccountNumber = lastFourDigits.padStart(14,'*');

// const concatString = `Last four digit of my account number is`.concat (' ' , lastFourDigits) 
// const templateString = `my account number is ${lastFourDigits.padStart(14,'*')}`
// console.log(templateString);

// const bankbalance = 98756;
// const templateString2  = `I Have ₹${bankbalance} in My account`


// const width = +prompt("Please Enter Rectangle Width");
// const height = +prompt("Please Enter Rectangle Height");

// console.log(width * height);

//  create object
// const user = {
//   firstname:'Trapti',
//   lastname:'chouhan',
//   age:21}

// const user = { //object in object
//   firstname: "Tanu",
//   lastname: "Chouhan",
//   address: {
// city:'Indore',
// pincode:7896,
// state:'MP',
// moreDetails:{
//   population:8900,
//   area:'bhawarkuwa',
// }
//   },
//   age:15,
//   isGraduate: true,
// }

// Object.seal(user)

//Object.freeze(user)

//console.log('isGraduate' in user); // usin is keyword:- if the key exists then true if not the false

// let username = "Tanu"
//user2.age = 26;
//user2["is-student"] = true;

// console.log(user2);
// console.log(user2.firstname); //acess value with the help of dot notation
// console.log(user2["lastname"]); 

//Array in js
// const username = "Trapti"
// const friutCollection = ['Apple',
//   'Mango',
//   'Grapesh',
//   'Banana']

// Array methods in js
//  const evenNumber = [0,2,4,6,8,10,12,14,16,18,20,22.24,26]
//  const oddNumber = [1,3,5,7]
// evenNumber.shift();
// evenNumber.unshift(0);

// const animals = ['Dog','Cat','Rat','Elephant','Rabbit','Lion','Tiger']
// evenNumber.concat(animals)
//  const addedArray1 = evenNumber.concat(animals,oddNumber);
//  const addedArray2 = animals.concat(evenNumber,oddNumber)

// const showIndex = evenNumber.indexOf(8)

// const isIncluded = animals.includes('Dog')

// const sortArray = animals.sort()
// const sortArray1 = evenNumber.sort();

// let fruits = ["banana","grapesh","Mango","Orange","Grapesh"]
// console.log(fruits.slice(1,3)); // ["grapesh","Mango"]
// console.log(fruits.slice(0,3)); // ["banana","grapesh","mango"]
// console.log(fruits.slice(-2)); //["Grapesh","Orange"]

// let str = "JavaScript";

// console.log(str.slice(0,4)); // java
// console.log(str.slice(4)); // Script
// console.log(str.slice(-6)); // Script 

// multidimensional array

// const nameAndNumberlist = [["Aman",75],["aayush",89],["Trapti",90]]
// const ticTactoe = [['X',null,null],[null,null,'0',],['0',null,'X']]


// right way of duplicating Array & object
// const fruits = ["Mango","Apple","Banana","Grapesh"]
// const myFruits = fruits

// const user1 = {
//   firstname:"tanu",
//   lastname:"chouhan"
// }

//const user2 = user1
// user2.lastname = 'sharma'

// let num = 5
// num += 5
// num += 5
// num += 5
// num *= 5
// num /= 5
// num -= 5
// num %= 5
// num += 20
// console.log(num);


// let i = 0;
// console.log("Program Stared");

// while(i<10)
// {
//   console.log("Hii");
  
// }
// console.log("Program Ended");

// Hosting in javascript

// debugger

// console.log(username);
//  var username = "Trapti"

//  hi()

//  function declaration
// function hi(){
//   console.log("Hello world!");
  
// }
// hi()

// sayHi()

// function expression
// const sayHi = function(){
//   console.log("namaste");
  
// }
// sayHi()

// Exercise 1.
//  const arr = [1,2,3];
//  const multiply = arr.map(num=>num*10);
//  console.log(multiply);

// Exercise 2.
// const checkEvenOdd = num =>num%2==0? "Even":"Odd";
// console.log(checkEvenOdd(6));
// console.log(checkEvenOdd(7));

// Exercise 1
// const number = [1,2,3,4];
// const square = number.map(n=>n*n);
// console.log(square);  //output = [1,4,9,16]

// Exercise 2.
// const greet = name =>"Hello," + name + "!";
// console.log(greet("Trapti"));
 
// Exercise 3.
// const number = [2,4,6,8];
// const divide = number.map(num=>num/2);
// console.log(divide); ouptput = [1,2,3,4]

// const arr = [9,8,7,6,5]
// const module = arr.map(num=>num%2);
// console.log(module); ouptput = [1,0,1,0,1];

// const array = [1,2,3,4,5];
// const three = array.map(num=>num*3);
// console.log(three);

// const number = [1,3,5,7,9];
// const double = number.map(num=>num*num);
// console.log(double); output = [1,9,25,49,81]

// Exercise 4.
// const user1 = {
//   name:"Trapti",
//   greet:function(){
//     console.log("Normal function " + this.name);
    
//   }
// };

// const user2 = {
//   name:"Nikita",
//   greet:()=>{
//     console.log("Arrow function " + this.name);
//   }
// };

// user1.greet();
// user2.greet();

// Exercise 5. Filter Even Number with Arrow Function
// const arr =[10,15,22,23,24];
// const evenNumber = arr.filter(num=>num%2==0)
// console.log(evenNumber);

// Excercise 6.square with Implicit Return
// write an arrow function named sqaure that takes a number and returns its square using implicit return.

// const square = num=>num*num;
// console.log(square(5));
// console.log(square(9));

// if use {}curly braces in arrow function you must use return
// const sqaure = num=>{return num*num};
// console.log(sqaure(4));
// console.log(sqaure(12));

// exercise 7.add Two Number
// Write an arrow function and that add two number

// const add = (a,b)=>a+b;
// console.log(add(1,2));
// console.log(add(10,23));

// const minus = (a,b)=>a-b;
// console.log(minus(15,5));
// console.log(minus(8,4));

// Exercise 8: Return Length of a string
// const getLength = str=>str.length;
// console.log(getLength("Trapti Chouhan"));

// const length = st=>st.length;
// console.log(length("Universal"));

// Exercise 9:Convert String to UpperCase
// const convertUpper = str=>str.toUpperCase();
// console.log(convertUpper("darshan singh"));

// Convert string to lowercase
// const convertLower = str=>str.toLowerCase();
// console.log(convertLower("KHANDWA"));

// Exercise 10:Return First Character of a string
// Write an arrow function named first char that returns only the first character of a given number

// const firstChar = str=>str.charAt(0);
// console.log(firstChar("Trapti"));

// const lastChar =str=>str.charAt(5);
// console.log(lastChar("Trapti"));

// const char=str=>str.charAt(2);
// console.log(char("Java"));

// Alternative using [] (array-style access);
// const firstChar = str=>str[0];
// console.log(firstChar("Universal")); //U 
// console.log(firstChar(" "));  //undefined

// Exercise 11: Multiply All Array Elements by 10
// const array =  [2,4,6];
// const multiply=array.map(num=>num*10);
// console.log(multiply);

// Exercise 12:Check if number is even or odd(Ternary inside arrow)
// const checkEvenOdd=num=>num%2==0?"even":"odd";
// console.log(checkEvenOdd(12));

// const checkEvenOdd = num=>num%2==0?"even":"odd";
// console.log(checkEvenOdd(1));

// Split Method:-the slpit() method is used to convert string into a array,by spliting it at a specific character calles as separater
// Example 1: Split by Space

// const sentence = "I Love JavaScript";
// const words = sentence.split(" ");
// console.log(words); output:- ['I', 'Love', 'JavaScript']

// split by Space
// const vari = "Universal Informatics";
// const word = vari.split(" ");
// console.log(word); //output:- ['Universal','Informatic']

// Example split by Each Character
// const spelling = "Web Developer";
// const words = spelling.split("");
// console.log(words); //output:- ['W', 'e', 'b', ' ', 'D', 'e', 'v', 'e', 'l', 'o', 'p', 'e', 'r']

// const name = "Trapti";
// const letters = name.split("");
// console.log(letters);   output:- ['T', 'r', 'a', 'p', 't', 'i']


// Example 3. Split by a specific Character
// const date = "2025-07-18";
// const parts = date.split("-");
// console.log(parts); //output:- ['2025','07','18']

// const date = "2003-02-27";
// const parts = date.split("-");
// console.log(parts); output:- ['2003','02','27']

// const date = "2006&07&22";
// const parts = date.split("&");
// console.log(parts); output:- ['2006','07','22']

// Example 4.Split with no match
// const str = "HelloWorld";
// const result = str.split(",");
// console.log(result);output:-["HelloWorld"]-->no comma,so no split

// Comman use with arrow function
// it used with.map() or .filter(),like:
// const str = "Trapti";
// const vowels = str.toLowerCase().split("").filter(ch=>'aeiou'.includes(ch));
// console.log(vowels);

// const name = "Universal";
// const result = name.toUpperCase().split("").filter(ch=>'AEIOU'.includes(ch));
// console.log(result);

// const str = "Indore";
// const result = str.toLowerCase().split("").filter(ch=>'ndr'.includes(ch));
// console.log(result);

// Includes() method:-
// Example 1. using includes() with a string
// const name = "Trapti";
// console.log(name.includes("T")); true
// console.log(name.includes("r")); true
// console.log(name.includes("R")); false
// console.log(name.includes("c")); false

// Example 2. Using Includes() with a array
// const fruits = ['Apple','Mango','Banana'];
// console.log(fruits.includes("Apple")); true
// console.log(fruits.includes("orange")); false




// const countVowels = str =>
//   str
//     .toLowerCase()
//     .split('')
//     .filter(char => 'aeiou'.includes(char)).length;

//     console.log(countVowels("Trapti")); 

// const countVowels = str=>str.toLowerCase().split('').filter(char=>'aeiou'.includes(char)).length;
// console.log(countVowels("JavaScript"));

// const countConsonants = str=>str.toLowerCase().split('').filter(char=>'bcdfghqwrtypsjklzxvnm'.includes(char)).length;
// console.log(countConsonants("Trapti"));
// console.log(countConsonants("JavaScript"));

// Check if a sentences includes a word
// const containWord = (sentence,word)=>sentence.toLowerCase().includes(word.toLowerCase());
// console.log(containWord("JavaScript is amazing","amazing"));
// console.log(containWord("Web Developer","java"));

// const containWord = (sentence,word)=>sentence.toLowerCase().includes(word.toLowerCase());
// console.log(containWord("wed developer job in indore","indore")); // true
// console.log(containWord("Mern Stack Web Developer","developer")); // true

// Join()
// const arr = ["Trapti","is","Learning"];
// const result = arr.join("-");
// console.log(result); //output:-[Trapti-is-Learning]


// ["React", "Node", "Mongo"].join(" ")
// → "React Node Mongo"

// const word = ["React","Node","Mongo"];
// const joinWord = word.join(" ");
// console.log(joinWord); output:- React Node Mongo

// const word = ["React","Node","Mongo"];
// const joinWord = word.join("-");
// console.log(joinWord); output:- React-Node-Mongo

// const word = ["React","Node","Mongo"];
// const joinWord = word.join(",");
// console.log(joinWord); output:- React,Node,Mongo

// const word = ["React","Node","Mongo"];
// const joinWord = word.join("");
// console.log(joinWord); output:- ReactNodeMongo



// const name = ["j","a","v","a"];
// const joinName = name.join("");
// console.log(joinName); output:- java

// const name = ["j","a","v","a"];
// const joinName = name.join("-");
// console.log(joinName); output:- j-a-v-a

// const formatString = str=>str.split(" ").join("-");
// console.log(formatString("Java is Fun"));

// let a;
// console.log(typeof a);
// console.log(typeof null);

// var x = 5;
// var y = "5";
// console.log(x == y);   // ?
// console.log(x === y);  // ?

// {
//   var a = 10;
//   let b = 20;
//   const c = 30;
//   var a = 40;
// }
// console.log(a);
// console.log(b);
// console.log(c);

// let colors = ["red", "green", "blue"];

// ✅ Use for...in → to print indexes
// ✅ Use for...of → to print values


// for(let indexe in colors)
// {
//   console.log(indexe);
  
// }

// for(let value of colors)
// {
//   console.log(value);
  
// }

// let nums =[12,11,10,15,48,17]
// for(let value of nums)
// {
//   if(value%2!=0)
//   {
//     console.log(value);
    
//   }
// }

// let book = {
//   title:"javascript",
//   author:"Trapti",
//   pages:358
// };

// let books = Object.entries(book);
// console.log(books);

// let word = "JavaScript";

// for (let char of word) {
//     console.log(char);
// }

// let person = { name: "Trapti", age: 22, city: "Indore" };

// for (let key in person) {
//     console.log("Key:", key);
//     console.log("Value:", person[key]);
// }

// const arr = [1,2,3,4,5];
// for(const iteration of object )

// for(const num of arr)
// {
//   // console.log(num);
  
// }

// const greetings = "Hello World!";
// for (const greet of greetings) {
//   // console.log(`Each Char ${greet}`);
  
// }

// const map = new Map()
// map.set('IN',"India");
// map.set('USA',"United State of America");
// map.set('fr',"France");
// map.set('IN',"India"); //map knows for unique value
// console.log(map);

// for(const [key,value] of map) //array ka destructure ho jata he
// {
//   console.log(key,":-",value); //for of loop object par work nhi karta
  
// }

// const myObject={
//   js:'javascript',
//   cpp:'C++',
//   ry:'Ruby',
// }

// for (const key in myObject) {
//   // console.log(`${key} shortcut is for ${myObject[key]}`);
  
// }

// const programming = ["js","ruby","C","C++"];
// for (const key in programming) {
//   console.log(key);
  
// }

const coding = ["js","ruby","java","python","cpp"];

// coding.forEach(function (val) {
//   console.log(val);
  
// })

// coding.forEach( (item)=>{
// console.log(item);

// })

// function printMe(item){
//   console.log(item);
  
// }
// coding.forEach(printMe)
// Sample Output:
// Before: number
// After: string

// function typeSwapChecker() {
//   let data = 100;
//   console.log("Before:", typeof data);
  
//   // Change the type
//   data = "One Hundred";
//   console.log("After:", typeof data);
// }

// typeSwapChecker();

// function add(a,b)
// {
//   return a+b;
// }
// console.log(add(5,3));

// const fruits  = ["Apple","Mango","Orange","cherry","Banana","grapesh","watermelon"];
// // console.log(fruits.slice(0,3)); // apple mango orange
// console.log(fruits.slice(-2)); //  cherry banana

// let items = [10, 20, 30, 40, 50];

// let exceptLast = items.slice(0, -1);
// console.log(exceptLast); // [10, 20, 30, 40]


// let name = "Trapti Chouhan";

// let lastName = name.slice(-7);
// console.log(lastName); // "Chouhan"

// let fruits = ["apple", "banana", "mango", "orange"];
// fruits.splice(1, 3); // start at index 1, remove 2 elements

// console.log(fruits); // ["apple", "orange"]
// let colors = ["red", "blue"];
// colors.splice(1, 0, "green");

// console.log(colors); // ["red", "green", "blue"]

// let fruits = ["Apple","Mango","Banana","Orange","Watermelon"];
// fruits.splice(1,2);
// console.log(fruits); //Apple Orange Watermelon

// let names = ["Trapti","Tanu"];
// names.forEach(function(name){
//   console.log(`hello ${name}`);
  
// })

// let names = ["Trapti","Tanu"]
// names.forEach(name => {
//   console.log(`Hello ${name}`);
  
// })

let numbers = [2, 4, 6];

// ✅ Use map to create new array with square of each number
// Output: [4, 16, 36]
 let square = numbers.map(num=>num**num)
{
//  console.log(square);

}

// let double = numbers.map(num=>num*2)
// {
//   console.log(double);
  
// }
// console.log(4 ** 4); // 16  (4 * 4)

let ages = [12, 18, 25, 8, 30];

// ✅ Filter out only those 18 or older
// Expected output: [18, 25, 30]
let value = ages.filter(age=>age>=18)
{
  // console.log(value);
  
}

let words = ["apple", "bat", "cat", "door", "egg"];

// ✅ Filter words with length greater than 3
// Output: ["apple", "door"]
let result = words.filter(word=> word.length>3)
// console.log(result); //output apple door

let students = [
  { name: "Trapti", marks: 85 },
  { name: "Ravi", marks: 40 },
  { name: "Asha", marks: 65 }
];

// ✅ Filter students with marks >= 50
// Output: Trapti and Asha
let results = students.filter(st=>st.marks>=50)
let maps = results.map(str=>str.name)
// console.log(maps);

let employees = [
  { name: "Aman", salary: 18000 },
  { name: "Neha", salary: 22000 },
  { name: "Ritesh", salary: 25000 }
];

// ✅ Get array of names of high earners
// Output: ["Neha", "Ritesh"]
let result1 = employees.filter(emp=>emp.salary>=20000);
let dev = result1.map(em=>em.name);
// console.log(result1);

let users = [
  { name: "Trapti", city: "Indore" },
  { name: "Ravi", city: "Delhi" },
  { name: "Asha", city: "Indore" }
];

// ✅ Get names of users from "Indore"
// Output: ["Trapti", "Asha"]
let user = users.filter(res=>res.city='indore')
let count = user.map(use=>use.name);
// console.log(count);

// console.log('A');
// setTimeout(()=> console.log('B'),0);
// Promise.resolve().then(() => console.log('C'));
// console.log('D');

// Arrow Function
// const add =(a,b)=> a+ b;
// console.log(add(3,4));

// callback
function runCallback(callback){
  console.log("Before callback");
  callback();
  console.log("after callback");
  
}

function greet()
{
  console.log("Hello JavaScript!");
  
}

// runCallback(greet);
// greet();


// const add =(a,b)=> a+b;
// const sub = (a,b)=>a-b;
// const multiply = (a,b)=>a*b;
// const divide = (a,b)=>a/b;

// function calculator(a,b,operation)
// {
//   return operation(a,b);
// }
// console.log(calculator(10,5,add));
// console.log(calculator(10,5,sub));
// console.log(calculator(10,5,multiply));
// console.log(calculator(10,5,divide));

// function gret()
// {
// console.log("Hello Trapti");

// }
// setTimeout(gret,4000)
// setTimeout(gret,1000)

// function done()
// {
//   console.log("Callback function executed after message.");
  
// };
// delaymessage("Welcome to day 31!",3000,done);



// function done() {
//   console.log("Callback function executed after message.");
// }

// delayedMessage("Welcome to Day 3!", 3000, done);

function delayedMessage(message, delay, callback) {
  setTimeout(() => {
    console.log(message);
    callback();
  }, delay);
}

function done() {
  console.log("Callback function executed after message.");
}

delayedMessage("Welcome to Day 3!", 3000, done);




