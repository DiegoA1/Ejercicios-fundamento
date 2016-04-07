Proceso Ejercicio3
	Escribir "ingresar nota";
	Leer nota;
	Si (nota>=6.0 y nota<=7.0) Entonces
		Escribir "Muy bien";
	Sino
		Si (nota>=5.0 y nota<=5.9) Entonces
			Escribir "Bien";
		Sino
			Si (nota>=4.0 y nota<=4.9) Entonces
				Escribir "Suficiente";
			Sino
				Si (nota>=1.0 y nota<=3.9) Entonces
					Escribir "Insuficiente";
				Sino
					Escribir "Nota mal ingresada";
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
