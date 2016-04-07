Proceso sin_titulo
	cont<-0;
	apro<-0;
	repro<-0;
	exam<-0;
	prom_suma<-0;
	max<-0;
	Escribir "ingresar numero de alumnos";
	Leer x;
	Repetir
		cont<-cont+1;
		Escribir "ingresar nota";
		Leer n1;
		Escribir "ingresar nota";
		Leer n2;
		Escribir "ingresar nota";
		Leer n3;
		Escribir "ingresar nota";
		Leer n4;
		Prom<-(n1+n2+n3+n4)/4;
		prom_suma<-prom_suma+prom;
		Escribir "El promedio del alumno es: ",Prom;
	Si (Prom>3.9) Entonces
		Escribir "Aprobado";
		apro<-apro+1;
	Sino
		Si (Prom==3.9) Entonces
			Escribir "Examen";
			exam<-exam+1;
		Sino
			Si (Prom<3.9) Entonces
				Escribir "Reprobado";
				repro<-repro+1;
			FinSi
		FinSi
	FinSi
	Si Prom>max Entonces
		max<-Prom;
	FinSi
    Hasta Que (cont=x)
	PromTotal<-prom_suma/x;
	Por_apro<-apro*100/x;
	Por_exam<-exam*100/x;
	Por_repro<-repro*100/x;
	Escribir "El porcentaje de aprobados es: ",Por_apro,"%";
	Escribir "El porcentaje de alumnos en exame es: ",Por_exam,"%";
	Escribir "El porcentaje de reprobados es: ",Por_repro,"%";
	Escribir "El promedio general es: ",promTotal;
	Escribir "El mejor promedio es: ",max;
FinProceso
