Proceso Ejercicio11
	Escribir "ingresar calificaciones parciales";
	Leer parcial;
	Escribir "ingresar promedio de talleres";
	Leer talleres;
	Escribir "ingresar promedio de tareas";
	Leer tareas;
	Escribir "ingresar exposicion del tema de investigacion";
	Leer invest;
	Cali_parci <- parcial * 0.5;
	Prom_tall <- talleres * 0.25;
	Prom_tare <- tareas * 0.15;
	Expo_inv <- invest * 0.1;
	Cali_final <- Cali_parci + Prom_tall + Prom_tare + Expo_inv;
	Escribir "la calificacion final es",Cali_final;
FinProceso
