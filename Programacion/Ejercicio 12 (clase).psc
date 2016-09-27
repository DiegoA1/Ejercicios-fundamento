Proceso a1
	cont<-0;
	max<-0;
	Escribir "cuantos numero se va a ingresar";
	Leer x;
	Repetir
		Escribir "ingresar numero",cont+1,": "Sin Saltar;
		Leer n;
		Si n>max Entonces
			max<-n;
		FinSi
		cont<-cont+1;
	Hasta Que cont=x;
	
FinProceso
