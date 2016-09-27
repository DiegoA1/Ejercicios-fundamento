Proceso Ejercicio1
	Escribir 'Ingresar numero 1';
	Leer N1;
	Escribir 'Ingresar numero 2';
	Leer N2;
	Escribir 'Ingresar numero 3';
	Leer N3;
	Escribir 'Ingresar numero 4';
	Leer N4;
	Si (N1>N2 Y N1>N3 Y N1>N4) Entonces
		Escribir 'El mayor es: ',N1;
	Sino
		Si (N2>N1 Y N2>N3 Y N2>N4) Entonces
			Escribir 'El mayor es: ',N2;
		Sino
			Si (N3>N1 Y N3>N2 Y N3>N4) Entonces
				Escribir 'El mayor es: ',N3;
			Sino
				Si (N4>N1 Y N4>N2 Y N4>N3) Entonces
					Escribir 'El mayor es: ',N4;
				Sino
					Escribir 'Numeros mal ingresados';
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso

