Proceso sin_titulo
	Viajes<-0;
	Km<-0;
	Total_combus<-0;
	Total_bencina<-0;
	Total_petroleo<-0;
	Ciudad1<-0;
	Ciudad2<-0;
	Ciudad3<-0;
	Ciudad4<-0;
	litros<-0;
	opcion<-0;
	Repetir
		Repetir
			Escribir "ingresar 1 para comenzar";
			Escribir "ingresar 2 para detener";
			Leer opcion;
			Si (opcion!=1)&&(opcion!=2) Entonces
				Escribir "opcion no valida";
			FinSi
		Hasta Que (opcion=1)||(opcion=2)
		Si (opcion=1) Entonces
			Repetir
				Escribir "ingresar destino";
				Leer numciud;
				Si (numciud>4)||(numciud<1) Entonces
					Escribir "ingreso incorrecto de ciudad";
				FinSi
			Hasta Que (numciud<=4)&&(numciud>=1)
			Segun numciud Hacer
				1:
					Repetir
						Escribir "ingresar distancia";
						Leer distancia;
						Si (distancia<9)||(distancia>600) Entonces
							Escribir "ingreso incorrecto de distancia";
						FinSi
					Hasta Que (distancia>=9)&&(distancia<=600)
					Repetir
						Escribir "ingresar peso de carga";
						Leer carga;
						Si (carga<1)||(carga>1500) Entonces
							Escribir "ingreso incorrecto de carga";
						FinSi
					Hasta Que (carga>=1)&&(carga<=1500)
					Si (carga>700) Entonces
						Escribir "se ocupara camion petrolero";
						estanque<-60;
						rendimiento<-11;
					Sino
						Escribir "se ocupara camion bencinero";
						estanque<-40;
						rendimiento<-13;
					FinSi
					/////////////////////////////////////////////////////
					litros<-(distancia*2)/rendimiento;
					Escribir "la cantidad de combustible es de: ",redon(litros);
					Ciudad1<-Ciudad1+1;
				2:
					Repetir
						Escribir "ingresar distancia";
						Leer distancia;
						Si (distancia<9)||(distancia>600) Entonces
							Escribir "ingreso incorrecto de distancia";
						FinSi
					Hasta Que (distancia>=9)&&(distancia<=600)
					Repetir
						Escribir "ingresar peso de carga";
						Leer carga;
						Si (carga<1)||(carga>1500) Entonces
							Escribir "ingreso incorrecto de carga";
						FinSi
					Hasta Que (carga>=1)&&(carga<=1500)
					Si (carga>700) Entonces
						Escribir "se ocupara camion petrolero";
						estanque<-60;
						rendimiento<-11;
					Sino
						Escribir "se ocupara camion bencinero";
						estanque<-40;
						rendimiento<-13;
					FinSi
					/////////////////////////////////////////////////////
					litros<-(distancia*2)/rendimiento;
					Escribir "la cantidad de combustible es de: ",redon(litros);
					Ciudad2<-Ciudad2+1;
				3:
					Repetir
						Escribir "ingresar distancia";
						Leer distancia;
						Si (distancia<9)||(distancia>600) Entonces
							Escribir "ingreso incorrecto de distancia";
						FinSi
					Hasta Que (distancia>=9)&&(distancia<=600)
					Repetir
						Escribir "ingresar peso de carga";
						Leer carga;
						Si (carga<1)||(carga>1500) Entonces
							Escribir "ingreso incorrecto de carga";
						FinSi
					Hasta Que (carga>=1)&&(carga<=1500)
					Si (carga>700) Entonces
						Escribir "se ocupara camion petrolero";
						estanque<-60;
						rendimiento<-11;
					Sino
						Escribir "se ocupara camion bencinero";
						estanque<-40;
						rendimiento<-13;
					FinSi
					/////////////////////////////////////////////////////
					litros<-(distancia*2)/rendimiento;
					Escribir "la cantidad de combustible es de: ",redon(litros);
					Ciudad3<-Ciudad3+1;
				4:
					Repetir
						Escribir "ingresar distancia";
						Leer distancia;
						Si (distancia<9)||(distancia>600) Entonces
							Escribir "ingreso incorrecto de distancia";
						FinSi
					Hasta Que (distancia>=9)&&(distancia<=600)
					Repetir
						Escribir "ingresar peso de carga";
						Leer carga;
						Si (carga<1)||(carga>1500) Entonces
							Escribir "ingreso incorrecto de carga";
						FinSi
					Hasta Que (carga>=1)&&(carga<=1500)
					Si (carga>700) Entonces
						Escribir "se ocupara camion petrolero";
						estanque<-60;
						rendimiento<-11;
					Sino
						Escribir "se ocupara camion bencinero";
						estanque<-40;
						rendimiento<-13;
					FinSi
					litros<-(distancia*2)/rendimiento;
					Escribir "la cantidad de combustible es de: ",redon(litros);
					Ciudad4<-Ciudad4+1;
			FinSegun
			viajes<-viajes+1;
			Km<-Km+(distancia)*2;
			total_combus<-total_combus+1;
			Si (carga<700) Entonces
				Total_bencina<-Total_bencina+litros;
			Sino
				Total_petroleo<-Total_petroleo+litros;
			FinSi
		FinSi
	Hasta Que (opcion=2)
	Escribir "La cantidad de viajes es: ",viajes;
	Escribir "La cantidad de KM es de: ",Km;
	Escribir "el consumo total de combustible es: ",total_combus;
	Escribir "El costo total de bencina es: ",redon(Total_bencina);
	Escribir "el costo total de petroleo es: ",redon(Total_petroleo);
	Escribir "el numero de viejes a la Ciudad 1: ",Ciudad1;
	Escribir "el numero de viejes a la Ciudad 2: ",Ciudad2;
	Escribir "el numero de viejes a la Ciudad 3: ",Ciudad3;
	Escribir "el numero de viejes a la Ciudad 4: ",Ciudad4;
FinProceso

/////////////////////////////////////////////////////////////////////////////////////////////
//Entradas: Las entradas seran las 4 cuidades, el pego de la carga y los kilometros a recorrer, tambien se puede tomar las veces que se hara los despachos
//Proceso: Primero se ingresara un digito para comenzar el proceso para asi continuar con el ingreso del numero de ciudad y en ello se escojera la opcion de la cuidad,
//         luego se pedidra el ingreso de la distancia de la cuidad y el peso de la carga. Dependiendo de la carga se indicara que camion se ocupara. Se realizara el
//         ejercicio para calcular la cantidad de combustible a utilizar, para finalizar se sacara los totales de viajes, de kilometros recorridos, de combustible total
//         ocupado, el respectivo total de bencina o petroleo y el numero de viajes a las distintas ciudades.
//Salidas: El camion a utilizar, la cantidad de combustible, la cantidad de viajes realizados, la cantidad de kilometros recorridos, el consumo total de combustible,
//         el costo total de combustible.