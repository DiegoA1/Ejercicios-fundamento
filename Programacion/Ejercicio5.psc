Proceso Ejercicio5
	Escribir "escribir sueldo basico";
	Leer sueldoBasico;
	Escribir "escribir horas trabajadas";
	Leer horastrabajo;
	HorasExtras <- (horastrabajo - (44 * 4));
	pagoHoraEx <- HorasExtras * 5000;
	Descuento <- sueldoBasico * 0.2;
	descuentoPago <- sueldoBasico - Descuento;
	Total <- descuentoPago + pagoHoraEx;
	Escribir "el sueldo basico es",sueldoBasico;
	Escribir "el descuento es",Descuento;
	Escribir "el total ganado es",Total;
FinProceso
