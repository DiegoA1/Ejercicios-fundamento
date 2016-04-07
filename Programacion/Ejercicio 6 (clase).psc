Proceso sin_titulo
	Leer n1;
	Leer n2;
	leer n3;
	Si (n1>n2 y n1>n3) Entonces
		Escribir "el numero mayor es: ",n1;
	Sino
		Si (n2>n1 y n2>n3) Entonces
			Escribir "el numero mayor es: ",n2;
		Sino
			Si (n3>n1 y n3>n2) Entonces
				Escribir "el numero mayor es: ",n3;
			Sino
				Escribir "numero invalidos";
			FinSi
		FinSi
	FinSi
FinProceso
