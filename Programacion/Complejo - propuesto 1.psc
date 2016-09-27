Proceso ejercicio1
	Escribir "ingresar numero";
	Leer n;
	c1<-trunc(n/1000);
	c2<-trunc((n%1000)/100);
	c3<-trunc((n%100)/10);
	c4<-trunc((n%10)/1);
	suma<-c1+c2+c3+c4;
	Escribir "el resultado de la suma es: ",suma;
FinProceso
