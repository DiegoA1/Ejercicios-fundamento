Proceso Ejericio2
	Escribir "Ingrese la cantidad de dinero";
	Leer Dinero;
	c1<-trunc(dinero/20000);
	c2<-trunc((dinero%20000)/10000);
	c3<-trunc((dinero%10000)/5000);
	c4<-trunc((dinero%5000)/2000);
	c5<-trunc((dinero%2000)/1000);
	c6<-trunc((dinero%1000)/500);
	c7<-trunc((dinero%500)/100);
	c8<-trunc((dinero%100)/50);
	c9<-trunc((dinero%50)/10);
	c10<-trunc((dinero%10)/5);
	c11<-trunc((dinero%5)/1);
	Escribir "Billetes de $20.000: ",c1;
	Escribir "Billetes de $10.000: ",c2;
	Escribir "Billetes de $5.000: ",c3;
	Escribir "Billetes de $2.000: ",c4;
	Escribir "Billetes de $1.000: ",c5;
	Escribir "Monedas de $500: ",c6;
	Escribir "Monedas de $100: ",c7;
	Escribir "Monedas de $50: ",c8;
	Escribir "Monedas de $10: ",c9;
	Escribir "Monedas de $5: ",c10;
	Escribir "Monedas de $1: ",c11;
FinProceso
