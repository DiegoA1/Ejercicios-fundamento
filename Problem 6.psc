Proceso sin_titulo
	acum1<-0;
	acum2<-0;
	A<-0;
	b<-0;
	Repetir
		A<-A+1;
		potencia<-A^2;
		Suma<-potencia+acum1;
		acum1<-Suma;		
	Hasta Que A=100
	Repetir
		B<-B+1;
		Suma1<-B+acum2;
		acum2<-Suma1;
		multi<-acum2^2;
	Hasta Que B=100
	resta<-multi-acum1;
	Escribir "la diferencia es: ",resta;
FinProceso
