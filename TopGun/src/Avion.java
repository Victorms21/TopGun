
public class Avion {
	
	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;


	
	public Avion(int idAvion, String modAvion, int capAvion,Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}



	public int getIdAvion() {
		return idAvion;
	}



	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}



	public String getModAvion() {
		return modAvion;
	}



	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}



	public int getCapAvion() {
		return capAvion;
	}



	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}



	public Piloto getPiloto() {
		return piloto;
	}



	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public void mostrarAvion() {
		System.out.println("Id de Avión: + idAvion");
		System.out.println("Modelo de Avión:"+ modAvion);
		System.out.println("Capacidad del Avión:"+ capAvion);
		System.out.println("Información del Piloto:");
		piloto.mostrarPiloto();
	}

		







}

	

