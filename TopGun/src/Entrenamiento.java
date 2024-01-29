
public class Entrenamiento extends Avion {
	private boolean tieneDobleMando;

	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
		this.tieneDobleMando = tieneDobleMando;
	}

	public boolean isTieneDobleMando() {
		return tieneDobleMando;
	}

	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	

	public void mostrarEntrenamiento() {
		super.mostrarAvion();
		System.out.println("Tiene doble mando: " +tieneDobleMando);
	}
	
}
