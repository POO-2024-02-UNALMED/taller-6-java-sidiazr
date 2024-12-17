package vehiculos;

public class Camion extends Vehiculo {
	
	private static int cantCamiones;
	
	private int ejes;
	
	public Camion() {cantCamiones++;}
	public Camion(String placa, String nombre, 
			int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		cantCamiones++;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCantCamiones() {
		return cantCamiones;
	}

}
