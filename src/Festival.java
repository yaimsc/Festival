import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	
	private String nombre; 
	
	private String patrocinador;
	
	private ArrayList<Actuacion> actuaciones; 
	
	
	public void addActuacion(Actuacion a){
		this.actuaciones.add(a); //se añade a la lista de actuaciones
	}
	
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion(); 
			a.setNombreGrupo(nombre);
			a.setDuracion(duracion);
		
		this.actuaciones.add(a); 
	}
	
	public void mostrarInfo(){
		System.out.println(this.getNombre());
		System.out.println("--------------------");
		System.out.println("Patrocinado por :" + this.getPatrocinador());
		System.out.println("-----------------------------------------------");
		System.out.println(this.getDuracion() + " de musica!!");
			
			Iterator<Actuacion> i = this.getActuaciones().iterator(); //recorre array actuaciones
		
			while(i.hasNext()){
				String infoActuacion = i.next().getInfo();  //enseñar la informacion de cada una de la lista
					System.out.println(infoActuacion);
			}
		
	}
	
	public void eliminarActuacion(String grupoEliminado) {
		Iterator <Actuacion> i = this.getActuaciones().iterator(); 
		while (i.hasNext()){
			Actuacion actuacion = i.next(); 
			if(actuacion.getNombreGrupo().equals(grupoEliminado)){
				i.remove();
					
				System.out.println(actuacion.getNombreGrupo() + " " + "se ha eliminado del festival");
			
				}
		}
		
	} 
	
	public void cambiarDuracionActuacion(String nombreGrupo, int duracion){
		for(int i = 0; i < this.actuaciones.size(); i++){ //recorrer arraylist con for
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombreGrupo)){ //mirar si el nombre de grupo que tiene i coincide con el que queremos
				
				Actuacion a = this.actuaciones.get(i); //coge la actuacion de la que se trata
				a.setDuracion(duracion); //le cambia la duracion
				this.actuaciones.set(i,a);  //reemplazar la actuacion que habia con la que le voy a meter
				}
			
		}
		
		System.out.println("La duración de la actuacion de  " + nombreGrupo + " fue cambiada a " + duracion + " minutos");
	}
	
	
	private int getDuracion(){
		int duracionTotal = 0; 
		Iterator <Actuacion> i = this.actuaciones.iterator(); 
		
		while(i.hasNext()){
			duracionTotal = duracionTotal + i.next().getDuracion(); 
		}
		
		return duracionTotal;
	}
		
	
	//recoger un atributo de la lista con "actuaciones.get(2)"
	
	
	/*
	 * getters y setters
	 */

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the patrocinador
	 */
	public String getPatrocinador() {
		return patrocinador;
	}

	/**
	 * @param patrocinador the patrocinador to set
	 */
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	/**
	 * @return the actuaciones
	 */
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}

	/**
	 * @param actuaciones the actuaciones to set
	 */
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}

	
	
	
	

}
