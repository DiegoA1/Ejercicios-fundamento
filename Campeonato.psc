Proceso sin_titulo
	partidos<-0;
	puntos<-0;
	partidos_g<-0;
	partidos_e<-0;
	partidos_p<-0;
	Goles_f<-0;
	Goles_c<-0;
	Repetir
		Escribir "ingresar goles a favor";
		Leer Goles_favor;
		Escribir "ingresar goles en contra";
		Leer Goles_contra;
		Goles_f<-Goles_f+Goles_favor;
		Goles_c<-Goles_c+Goles_contra;
		Si Goles_favor>Goles_contra Entonces
			puntos<-puntos+3;
			partidos_g<-partidos_g+1;
		Sino
			Si Goles_favor=Goles_contra Entonces
				puntos<-puntos+1;
				partidos_e<-partidos_e+1;
			Sino
				Si Goles_favor<Goles_contra Entonces
					puntos<-puntos+0;
					partidos_p<-partidos_p+1;
				FinSi
			FinSi
		FinSi
		partidos<-partidos+1;
	Hasta Que partidos=10
	Si (Goles_f>Goles_c) Entonces
		dife<-Goles_f-Goles_c;
	Sino
		Si (Goles_f<Goles_c) Entonces
			dife<-Goles_c-Goles_f;
		FinSi
	FinSi
	Si (puntos<10) Entonces
		Escribir "Clasificación: Liguilla de Promoción";
	Sino
		Si (puntos>10)&&(puntos<=20) Entonces
			Escribir "Clasificación: No Liguilla";
		Sino
			Si (puntos>20) Entonces
				Escribir "Clasificacion: Liguilla de Campeonato";
			FinSi
		FinSi
	FinSi
	Escribir "Total de goles a favor: ",Goles_f;
	Escribir "Total de goles en contra: ",Goles_c;
	Escribir "Total de puntos: ",puntos;
	Si (Goles_f>Goles_c) Entonces
		Escribir "La diferencia de goles a favor es: ",dife;
	Sino
		Si (Goles_f<Goles_c) Entonces
			Escribir "La diferencia de goles en contra es: ",dife;
		FinSi
	FinSi
	Escribir "Partidos Ganados: ",partidos_g;      
	Escribir "Partidos Empatados: ",partidos_e;        
	Escribir "Partidos Perdidos: ",partidos_p;
FinProceso
