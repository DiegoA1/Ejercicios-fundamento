Proceso jumaji	
	avance1<-0;
	avance2<-0;
	avance3<-0;
	jugadasP1<-0;
	jugadasP2<-0;
	jugadasP3<-0;
	Repetir
		Escribir "apretar enter para lanzar dado";
		Esperar Tecla;
		D1<-azar(6)+1;
		D2<-azar(6)+1;
		avance1<-avance1+(D1+D2);
		jugadasP1<-jugadasP1+1;
		Escribir "dado 1: ",D1;
		Escribir "dado 2: ",D2;
		Escribir "casilla: ",avance1;
		Si (avance1%2=0) Entonces
			avance1<-avance1+2;
			Escribir "avance 2 casillas";
		Sino
			Si (avance1=1)||(avance1=3)||(avance1=5)||(avance1=7)||(avance1=9)||(avance1=11)||(avance1=13)||(avance1=15)||(avance1=17)||(avance1=19)||(avance1=21)||(avance1=23)||(avance1=25)  Entonces
				avance1<-avance1-1;
				Escribir "retroceda 1 casilla";
			Sino
				Si (avance1%10=0) Entonces
					avance1<-avance1+5;
					Escribir "avance 5 casillas";
				Sino
					Si (avance1=2)||(avance1=3)||(avance1=5)||(avance1=7)||(avance1=11)||(avance1=13)||(avance1=17)||(avance1=19)||(avance1=23) Entonces
						avance1<-avance1-1;
						Escribir "regrese al inicio";
					Sino
						Si (avance1=13) Entonces
							avance1<-avance1-avance1;
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
		Escribir "apretar enter para lanzar dado";
		Esperar Tecla;
		D1<-azar(6)+1;
		D2<-azar(6)+1;
		avance2<-avance2+(D1+D2);
		jugadasP2<-jugadasP2+1;
		Escribir "dado 1: ",D1;
		Escribir "dado 2: ",D2;
		Escribir "casilla: ",avance2;
		Si (avance2%2=0) Entonces
			avance2<-avance2+2;
			Escribir "avance 2 casillas";
		Sino
			Si (avance2=1)||(avance2=3)||(avance2=5)||(avance2=7)||(avance2=9)||(avance2=11)||(avance2=13)||(avance2=15)||(avance2=17)||(avance2=19)||(avance2=21)||(avance2=23)||(avance2=25)  Entonces
				avance2<-avance2-1;
				Escribir "retroceda 1 casilla";
			Sino
				Si (avance2%10=0) Entonces
					avance2<-avance2+5;
					Escribir "avance 5 casillas";
				Sino
					Si (avance2=2)||(avance2=3)||(avance2=5)||(avance2=7)||(avance2=11)||(avance2=13)||(avance2=17)||(avance2=19)||(avance2=23) Entonces
						avance2<-avance2-1;
						Escribir "regrese al inicio";
					Sino
						Si (avance2=13) Entonces
							avance2<-avance2-avance2;
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
		Escribir "apretar enter para lanzar dado";
		Esperar Tecla;
		D1<-azar(6)+1;
		D2<-azar(6)+1;
		avance3<-avance3+(D1+D2);
		jugadasP3<-jugadasP3+1;
		Escribir "dado 1: ",D1;
		Escribir "dado 2: ",D2;
		Escribir "casilla: ",avance3;
		Si (avance3%2=0) Entonces
			avance3<-avance3+2;
			Escribir "avance 2 casillas";
		Sino
			Si (avance3=1)||(avance3=3)||(avance3=5)||(avance3=7)||(avance3=9)||(avance3=11)||(avance3=13)||(avance3=15)||(avance3=17)||(avance3=19)||(avance3=21)||(avance3=23)||(avance3=25)  Entonces
				avance3<-avance3-1;
				Escribir "retroceda 1 casilla";
			Sino
				Si (avance3%10=0) Entonces
					avance3<-avance3+5;
					Escribir "avance 5 casillas";
				Sino
					Si (avance3=2)||(avance3=3)||(avance3=5)||(avance3=7)||(avance3=11)||(avance3=13)||(avance3=17)||(avance3=19)||(avance3=23) Entonces
						avance3<-avance3-1;
						Escribir "regrese al inicio";
					Sino
						Si (avance3=13) Entonces
							avance3<-avance3-avance3;
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		
	Hasta Que (avance1>27)||(avance2>27)||(avance3>27)
	Si (avance1>27) Entonces
		Escribir "Gano el jugador 1 - en ",jugadasP1, " jugadas";
	FinSi
	
	Si (avance2>27) Entonces
		Escribir "Gano el jugador 2 - en ",jugadasP2, " jugadas";
	FinSi
	
	Si (avance3>27) Entonces
		Escribir "Gano el jugador 3 - en ",jugadasP3, " jugadas";
	FinSi
	
FinProceso
