Proceso Ejercicio10
	Escribir "cantidad de alumnos aprobados";
	Leer Aprob;
	Escribir "cantidad de alumnos reprobados";
	Leer Reprob;
	Escribir "cantidad de alumnos notables";
	Leer notab;
	Escribir "cantidad de alumnos sobresalientes";
	Leer sobreS;
	Total <- Aprob + Reprob + notab + sobreS;
	por_Aprob <- redon((Aprob * 100) / Total);	
	por_Reprob <- redon((Reprob * 100) / Total);
	por_notab <- redon((notab * 100) / Total);
	por_sobreS <- redon((sobreS * 100) / Total);
	Escribir "porciento alumnos aprobados",por_Aprob;
	Escribir "porciento alumnos reprobados",por_Reprob;
	Escribir "porciento alumnos notables",notab;
	Escribir "porciento alumnos sobresalientes",por_sobreS;
FinProceso
