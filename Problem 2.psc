Proceso sin_titulo
	A<-1;
	B<-2;
	Suma<-0;
	Mientras (B<=4000000) Hacer
		C<-A+B;
		A<-B;
		B<-C;
		Si A%2=0 Entonces
			Suma<-Suma+a;
		FinSi
	FinMientras
	Escribir Suma;
FinProceso
