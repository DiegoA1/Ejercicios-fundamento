Proceso sin_titulo
	Escribir "Ingresar un numero";
	Leer X;
	K<-10;
	si x>0 Entonces
		F<-X-K/X;
	Sino
		Si X=0 Entonces
			F<-0;
		Sino
			Si X<0 Entonces
				F<-X+K/X;
			FinSi
		FinSi
	FinSi
	Escribir "El resultado es: ",F;
FinProceso
