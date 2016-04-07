Proceso sin_titulo
	cont<-0;
	suma<-0;
	Escribir "ingrese el numero de estudiantes";
	leer cant;
	Repetir
		Escribir "ingrese nota de alumno", cont+1;
		Leer nota;
		cont<-cont+1;
		suma<-nota+suma;
	Hasta Que (cont==cant) 
	Escribir "el promedio del curso es: ",suma/cant;
FinProceso
