Proceso Ejercicio1
	Escribir "ingresar numero de telefono";
	Leer n;
	d1<-trunc(n/1000);
	d2<-trunc((n%1000)/100);
	d3<-trunc((n%100)/10);
	d4<-trunc((n%10)/1);
	c1<-(d1+7)%10;
	c2<-(d2+7)%10;
	c3<-(d3+7)%10;
	c4<-(d4+7)%10;
	Escribir "nuevo prmer digito: ",c1;
	Escribir "nuevo segundo digito: ",c2;
	Escribir "nuevo tercer digito: ",c3;
	Escribir "nuevo cuarto digito: ",c4;
	Escribir "nuevo numero telefonico cifrado: ", c3, c4, c1, c2;
FinProceso
