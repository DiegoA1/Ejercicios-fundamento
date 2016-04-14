Proceso sin_titulo
	num<-0;
	Repetir
		suma<-0;
		num<-num+1;
		escribir num;
		Para divisor<-1 Hasta 20 Con Paso 1 Hacer
			suma<-suma+(num%divisor);
		FinPara
	Hasta Que suma=0; 
	Escribir num;
FinProceso
