import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		//Se crean tres objetos de la clase piloto
		Piloto piloto1 = new Piloto (1,"Pete Maverick", "Capitán",10000);
		Piloto piloto2 = new Piloto (2,"Natasha Phoenix", "Teniente",3000);
		Piloto piloto3 = new Piloto (3,"Bradley Rooster","Teniente",3500);
		

		//Se pide al usuario que introduzca los datos de 2 pilotos más
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca los datos del cuarto piloto:");
		System.out.print("Nombre piloto: ");
		String nombrePiloto4 = scanner.nextLine();
		System.out.print("Rango: ");
		String rangoPiloto4 = scanner.nextLine();
		System.out.print("Horas de vuelo:");
		int horasVueloPiloto4 = scanner.nextInt();
		Piloto piloto4 = new Piloto(4, nombrePiloto4, rangoPiloto4, horasVueloPiloto4);
		
		scanner.nextLine(); // salto de línea
		
		System.out.println("Introduzca los datos del quinto piloto");
		System.out.print("Nombre piloto: ");
		String nombrePiloto5 = scanner.nextLine();
		System.out.print("Rango: ");
		String rangoPiloto5 = scanner.nextLine();
		System.out.print("Horas de vuelo: ");
		int horasVueloPiloto5 = scanner.nextInt();
		Piloto piloto5 = new Piloto(5, nombrePiloto5, rangoPiloto5, horasVueloPiloto5);
		
		
		// Se muestran Maverick y Rooster
		System.out.println("Información de Maverick: ");
		piloto1.mostrarPiloto();
		
		System.out.println("Información de Rooster: ");
		piloto2.mostrarPiloto();
		
		// Se muestran los pilotos introducidos por el usuario
		System.out.println("Información del cuarto piloto: ");
		piloto4.mostrarPiloto();
		
		System.out.println("Información del quinto piloto: ");
		piloto5.mostrarPiloto();
		
		
		// Se crean objetos de la clase Avión 
		Avion avion1 = new Entrenamiento (1, "Modelo Águila " , 4, piloto1);
		Avion avion2 = new Combate(2, "Modelo Cuervo", 2, piloto2);
		Avion avion3 = new Combate(3, "Modelo Halcón", 3, piloto3);
		
		
		// Se piden datos de dos aviones mas
		System.out.println("Introduzca los datos del cuarto Avión:");
		System.out.print("Modelo: ");
		String modeloAvion4 = scanner.nextLine();
		System.out.print("Capacidad: ");
		int capacidadAvion4 = scanner.nextInt();
		System.out.print("Id del piloto de este avión : ");
		int idPilotoAvion4 = scanner.nextInt();
		Avion avion4 = new Entrenamiento(4, modeloAvion4, capacidadAvion4, getPilotoById(idPilotoAvion4, piloto5, piloto5));
		
		scanner.nextLine();// Salto de línea 
		
		System.out.println("Introduzca los datos del quinto Avion : ");
		System.out.print("Modelo: ");
		String modeloAvion5 = scanner.nextLine();
		System.out.print("Capacidad: ");
		int capacidadAvion5 = scanner.nextInt();
		System.out.print("Id del piloto de este avión: ");
		int idPilotoAvion5 = scanner.nextInt();
		Avion avion5 = new Entrenamiento(5, modeloAvion5, capacidadAvion5, getPilotoById(idPilotoAvion5, piloto5, piloto5));
		
		System.out.println("Información del primer avión:");
		avion1.mostrarAvion();
		System.out.println("Información del segundo avión: ");
		avion2.mostrarAvion();
		System.out.println("Información del tercer avión: ");
		avion3.mostrarAvion();
		System.out.println("Información del cuarto avión : ");
		avion4.mostrarAvion();
		System.out.println("Información del quinto avión : ");
		avion5.mostrarAvion();
		
		scanner.close();
	}
		 private static Piloto getPilotoById(int id, Piloto piloto1, Piloto piloto2) {
		        if (piloto1.getIdPiloto() == id) {
		            return piloto1;
		        } else if (piloto2.getIdPiloto() == id) {
		            return piloto2;
		        } else {
		            return piloto1;
		        }
		
	}

}
