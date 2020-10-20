package relojdigital;

import java.util.Scanner;

public class RelojDigital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dia de la semana");
		String dia = sc.nextLine();
		switch (dia) {
		case "Lunes":
		case "Martes":
		case "Miercoles":
		case "Jueves":
		case "Viernes":
		case "Sabado":
		case "Domingo":
			break;
		default:
			System.out.println("Introduzca un dia válido");
			sc.close();
			return;
		}
		System.out.println("Introduzca la hora");
		int hora = sc.nextInt();
		if(hora < 0 || hora > 23) {
			System.out.println("Introduzca una hora válida");
			sc.close();
			return;
		}
		System.out.println("Introduzca los minutos");
		int min = sc.nextInt();
		if(min < 0 || min > 59) {
			System.out.println("Introduzca un minuto válido");
			sc.close();
			return;
		}
		System.out.println("Introduzca los segundos");
		int sec = sc.nextInt();
		if (sec < 0 || sec > 59) {
			System.out.println("Introduzca un segundo válido");
			sc.close();
			return;
		}
		
		System.out.println("Hora introducida " + dia + " " + hora + " " + min + " " + sec);
		
		for (int i = 0; i < 150; i++) {
			sec++;
			if(sec > 59) {
				sec = 0;
				min++;
			}
			if(min > 59) {
				min = 0;
				hora++;
			}
			if(hora > 23) {
				hora = 0;
				switch(dia) {
				case "Lunes":
					dia = "Martes";
					break;
				case "Martes":
					dia = "Miercoles";
					break;
				case "Miercoles":
					dia = "Jueves";
					break;
				case "Jueves":
					dia = "Viernes";
					break;
				case "Viernes":
					dia = "Sabado";
					break;
				case "Sabado":
					dia = "Domingo";
					break;
				case "Domingo":
					dia = "Lunes";
					break;
				}	
			}
			System.out.println(dia + " " + hora + ":" + min + ":" + sec);
		}
		sc.close();
	}

}
