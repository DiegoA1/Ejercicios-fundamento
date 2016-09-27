Proceso sin_titulo
	contador<-0;
	acumulador<-0;
	Repetir
		Escribir "ingrese numero, finaliza con cero";
		Leer num;
		contador<-contador+1;
		acumulador<-acumulador+num;
	Hasta Que (num=0)
	promedio<-acumulador/contador;
	Escribir "el promedio de los numeros es: ",promedio;
FinProceso
