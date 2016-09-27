Proceso Ejercicio3
	Escribir "ingresar segundos";
	Leer seg;
	H<-trunc(seg/3600);
	M<-trunc((seg%3600)/60);
	S<-trunc((seg%60)/1);
	Escribir H,":",M,":",S;
	
FinProceso
