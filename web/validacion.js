/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validateForm(){
    var numerov=document.forms["numeros"]["numero"].value;
    if(numerov==null || numerov=="" || numerov<0 || numerov>1){
        alert("el numero ingresado no es valido ");
        return false;
    }
}

