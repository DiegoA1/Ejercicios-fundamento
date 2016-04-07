Proceso Ejercicio6
	Escribir "ingresar cantidad de completos italianos";
	Leer comple_ita;
	Escribir "ingresar cantidad de completos a la chilena";
	Leer comple_chi;
	Escribir "ingresar cantidad de hamburguesa - queso";
	Leer hambur_que;
	Escribir "ingresar cantidad de churrasco";
	Leer churra;
	Escribir "ingresar cantidad de cerveza";
	Leer cerve;
	Escribir "ingresar cantidad de bebida";
	Leer bebi;
	iva <- 21 / 100;
	orden1 <- redon((comple_ita * 690) + (690 * iva));
	orden2 <- redon((comple_chi * 890) + (890 * iva));
	orden3 <- redon((hambur_que * 990) + (990 * iva));
	orden4 <- redon((churra * 1100) + (1100 * iva));
	orden5 <- redon((cerve * 700) + (700 * iva));
	orden6 <- redon((bebi * 500)  + (500 * iva));
	Escribir "total del completo italiano es",orden1;
	Escribir "total del completo a la chilena es",orden2;
	Escribir "total de la hamburguesa-queso es",orden3;
	Escribir "total del churrasco es",orden4;
	Escribir "total de la cerveza es",orden5;
	Escribir "total de la bebida es",orden6;
	Ord_total <- orden1 + orden2 + orden3 + orden4 + orden5 + orden6
	Escribir "el total es",Ord_total;
FinProceso
