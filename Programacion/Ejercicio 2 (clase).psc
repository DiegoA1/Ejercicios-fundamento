Proceso sin_titulo
	Escribir "ingresar dinero";
	Leer dine;
	d1<-trunc(dine/20000);
	d2<-trunc((dine%20000)/10000);
	d3<-trunc((dine%10000)/5000);
	d4<-trunc((dine%5000)/2000);
	d5<-trunc((dine%2000)/1000);
	d6<-trunc((dine%1000)/500);
	d7<-trunc((dine%500)/100);
	d8<-trunc((dine%100)/50);
	d9<-trunc((dine%50)/10);
	d10<-trunc((dine%10)/5);
	d11<-trunc((dine%5)/1);
	Escribir "el total de billetes de 20.000 es ",d1;
	Escribir "el total de billetes de 10.000 es ",d2;
	Escribir "el total de billetes de 5.000 es ",d3;
	Escribir "el total de billetes de 2.000 es ",d4;
	Escribir "el total de billetes de 1.000 es ",d5;
	Escribir "el total de monedas de 500 es ",d6;
	Escribir "el total de monedas de 100 es ",d7;
	Escribir "el total de monedas de 50 es ",d8;
	Escribir "el total de monedas de 10 es ",d9;
	Escribir "el total de monedas de 5 es ",d10;
	Escribir "el total de monedas de 1 es ",d11;
FinProceso

