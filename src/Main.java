import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear una actuacion por programación

		Actuacion a1 = new Actuacion();

			a1.setNombreGrupo("AC/DC");
			a1.setDuracion(90);

		// crear una actuación por inputs de teclado

		Actuacion a2 = new Actuacion();

		Scanner lector = new Scanner(System.in);

		System.out.println("Nombre del grupo para la segunda actuacion:");

			String grupo = lector.nextLine();
			a2.setNombreGrupo(grupo);

		System.out.println("Duración de la segunda actuación:");

			int duracion = lector.nextInt();
			a2.setDuracion(duracion);

		System.out.println("La segunda actuacion sera de:" + " " + a2.getNombreGrupo() + ", " + a2.getDuracion() + " "
				+ "minutos");

		// crear una actuación leyendo desde fichero

		File fichero = new File("F:/Programación/actuaciones.txt");
		Scanner lector2;
		
		Actuacion a3 = new Actuacion();
		
		try {
			lector2 = new Scanner(fichero);
			
		

			while (lector2.hasNextLine()) {
				String linea = lector2.nextLine();
				String[] actuaciones = linea.split(",");

					a3.setNombreGrupo(actuaciones[0]);
					a3.setDuracion(Integer.parseInt(actuaciones[1]));

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//crear un festival por porgramacion con 3 actuaciones
		
		Festival festival2017 = new Festival(); 
		
		ArrayList<Actuacion> actus = new ArrayList<Actuacion>(); //crear arraylist

			actus.add(a1); //añadir las actuaciones al arraylist
			actus.add(a2); 
			actus.add(a3); 
		
		festival2017.setNombre("Coachella");
		festival2017.setPatrocinador("Vodafone");
		festival2017.setActuaciones(actus); 
		
		/*se crea un arrayList actus con todos su valores 
		 * para mandarlo al primer ArrayList actuaciones
		 */
		 
		
		//añadir otra actuacion al festival 
		
		Actuacion a4 = new Actuacion(); 
		
		a4.setNombreGrupo("coldplay");
		a4.setDuracion(120);
		
		festival2017.addActuacion(a4);
		
		festival2017.addActuacion("linkin park", 120); 
		
		festival2017.mostrarInfo();
		
		
		festival2017.addActuacion("Berri Txarrak", 32); 
	}

}
