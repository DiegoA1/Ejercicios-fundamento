Proceso sin_titulo
	total<-0;
	cant_mostrados <- 1;
	n<-3;
	Mientras n<2000000 Hacer
		es_primo <- Verdadero;
		Para i<-3 hasta rc(n) con paso 2 Hacer 
			Si n%i = 0 entonces
				es_primo <- Falso;
			FinSi
		FinPara
		Si es_primo Entonces
			cant_mostrados <- cant_mostrados + 1;
			Escribir n;
			total<-total+n;
		FinSi
		n <- n + 2;
	FinMientras
	Escribir total;
FinProceso
