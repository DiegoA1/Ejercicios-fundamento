Proceso Ejercicio13
	Escribir "ingresar precio del vehiculo";
	Leer precio;
	gan_vend <- (precio * 8) / 100;
	imp_loc <- (precio * 3) / 100;
	imp_est <- (precio * 3) / 100;
	Prec_tot <- precio + gan_vend + imp_loc + imp_est;
	costo_ad <- gan_vend + imp_loc + imp_est;
	Escribir "el valor del vehiculo es",precio;
	Escribir "los costos adicionales son",costo_ad;
	Escribir "el precio total del vehiculo es",Prec_tot;
FinProceso
