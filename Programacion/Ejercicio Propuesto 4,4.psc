Proceso Ejercicio4
	Escribir "ingresar horas trabajadas";
	Leer H;
	Escribir "ingresar grado";
	Leer grado;
	Escribir "ingresar isapre";
	Leer isapre;
	Escribir "ingresar afp";
	Leer afp;
	hex<-H-40;
	Si (hex>=1 y hex<=3) Entonces
		paghex<-2000;
	Sino
		Si (hex>=4 y hex<=7) Entonces
			paghex<-3000;
		Sino
			Si (hex>7) Entonces
				paghex<-3500;
			FinSi
		FinSi
	FinSi
	Si (grado=1) Entonces
		sueldobase<-450000;
	Sino
		Si (grado=2) Entonces
			sueldobase<-550000;
		Sino
			Si (grado=3) Entonces
				sueldobase<-700000;
			FinSi
		FinSi
	FinSi
	Si (isapre=1) Entonces
		desc<-6.5;
	Sino
		Si (isapre=2) Entonces
			desc<-7.3;
		Sino
			Si (isapre=3) Entonces
				desc<-7;
			Sino
				Si (isapre=4) Entonces
					desc<-7;
				FinSi
			FinSi
		FinSi
	FinSi
	Si (afp=1) Entonces
		descafp<-12;
	Sino
		Si (afp=2) Entonces
			descafp<-13.4;
		Sino
			Si (afp=3) Entonces
				descafp<-12.3;
			Sino
				Si (afp=4) Entonces
					descafp<-12.9;
				FinSi
			FinSi
		FinSi
	FinSi
	descuento<-sueldobase*((desc/100)+(descafp/100));
	Sueldo<-(sueldobase+paghex)-descuento;
	Escribir "el sueldo liquido es: ",sueldo;
FinProceso

//Entradas: horas trabajadas, grado entregado por la empresa, tipo de isapre y tipo de afp
//Proceso: se debe realisar el calculo del descuento para luego poder calcular el sueldo liquido
//Salida: sueldo liquido del trabajador
