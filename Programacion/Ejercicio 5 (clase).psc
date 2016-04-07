Proceso sin_titulo
	Escribir "ingresar nota del alumno 1.0 a 7.0";
	Leer nota;
	Escribir "la nota sera";
	si (nota>=1.0 y nota<=3.9) Entonces
		Escribir "insuficiente";
	Sino
		Si (nota>=4.0 y nota<=4.9) Entonces
			Escribir "suficiente";
		Sino
			si (nota>=5.0 y nota<=5.9) entonces
				Escribir "bien";
			Sino
				si (nota>=6.0 y nota<=7.0) Entonces
					Escribir "muy bien";
				Sino
					Escribir "error en la nota ingresada";
				Finsi
			FinSi
		FinSi
	FinSi
FinProceso
