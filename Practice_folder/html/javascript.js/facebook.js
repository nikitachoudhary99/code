function validation(){ 
let uname=document.login.uname.value;
let pws=document.login.pws.value;
if(uname_validation(uname)){
    if(pws_validation(pws,5,12)){

    }
    else{
        return true;
    }
}

function pasword_validation(){
    
}
}