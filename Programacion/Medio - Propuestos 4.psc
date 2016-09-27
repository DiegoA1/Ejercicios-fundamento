Proceso Ejercicio4
	Escribir "ingresar ancho a";
	Leer A;
	Escribir "ingresar alto b";
	Leer B;
	area_rec<-A*B;
	area_cir<-3.14*B^2;
	resta<-area_rec-area_cir;
	Escribir "el resultado de la resta de las areas es: ",resta;
FinProceso
//Analisis: calcular la resta de 2 areas que son las areas del rectangulo (lados a y b) y un circulo (radio b)
//entradas: ancho a y alto b del rectangulo y radio b del circulo
//proceso: primero calcular el area del rectangulo 
//         segundo calcular el area del circulo
//         para finalizar restar las area
//salidas: resultado de la resta de las areas (rectangulo y circulo)