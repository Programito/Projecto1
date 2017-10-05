function changeGeometry(){
	var valor=document.getElementById("selecc").value;
	if(valor=="Esfera"){
		actPantalla(false,"Radio");
		document.getElementById("imagen").src="./esfera.png";
	}else if(valor=="Cubo"){
		actPantalla(false,"Lado");
		document.getElementById("imagen").src="./cube.png";
		}else if(valor=="Cono"){
			actPantalla(true,"Radio");
			document.getElementById("imagen").src="./cono.png";
		}
		else if(valor=="Cilindro"){
			actPantalla(true,"Radio");
			document.getElementById("imagen").src="./cilindro.png";
		}
}

function actPantalla(activar,name){
	modDiv(activar);
	modLabel(name);
}

function modDiv(activar){
	if(activar==true && document.getElementById("divCheckbox").style.display=="none"){
		document.getElementById("divCheckbox").style.display= "inline";
	}else if(activar==false && document.getElementById("divCheckbox").style.display=="inline"){
		document.getElementById("divCheckbox").style.display="none";
	}
}

function modLabel(name){
	if(document.getElementById("lNom").innerHTML!=name){
		document.getElementById("lNom").innerHTML=name;
	}
}