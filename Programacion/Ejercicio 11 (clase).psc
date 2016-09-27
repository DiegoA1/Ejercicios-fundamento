Proceso sin_titulo
	suma<-0;
	cont<-0;
	Escribir "ingresar cantidad de alumnos";
	Leer cant;
	Mientras (cont<=cant) Hacer
		Escribir "ingrese nota",cont+1;
		Leer nota;
		cont<-cont+1;
		suma<-suma+nota;
	FinMientras
	Escribir "el promedio es: ",suma/cant;
FinProceso
