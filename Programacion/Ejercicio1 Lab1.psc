Proceso ejercicio1
	Escribir "ingrese precio base";
	Leer Preciobase;
	Escribir "ingrese porcentaje de descuento, por ejermplo 0.1";
	Leer porcentajedescuento;
	IVA<-0.19;
	Precioapagar<-Preciobase*(1+IVA-porcentajedescuento);
	Escribir "El precio a pagar es",Precioapagar;
FinProceso

//Problema: se necesita un algoritmo que permita saber el Precio a pagar de un producto
//Entradas: el precio base y el descuento que son ingresados por el usuario y el iva que pasa a ser una constante
//Ssalidas: precio final con descuento