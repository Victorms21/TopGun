
public class Combate extends Avion{
	private boolean esFurtivo;

	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		super(idAvion, modAvion, capAvion, piloto);
		this.esFurtivo = esFurtivo;
	}
	
	public boolean isEsFurtivo() {
		return esFurtivo;
	}

	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}
		
		
	public void mostrarCombate() {
		super.mostrarAvion();
		System.out.println("Es furtivo:" +esFurtivo);
		}
	}
	
	
