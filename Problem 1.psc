Proceso sin_titulo
	cont<-0;
	acum<-0;
	Repetir
		cont<-cont+1;
		Si cont%3=0 o cont%5=0 Entonces
			acum<-acum+cont;
		FinSi
	Hasta Que cont=999
	Escribir "La suma de multiplos es: ",acum;
FinProceso
