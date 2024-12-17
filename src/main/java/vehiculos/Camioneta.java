package vehiculos;

public class Camioneta extends Vehiculo {
	
	private static int cantCamionetas;
	
	boolean volco;
	
	public Camioneta() {cantCamionetas++;}
	public Camioneta(String placa, int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantCamionetas++;
	}
	
	public boolean getVolco() {
		return volco;
	}
	
	public static int getCantCamionetas() {
		return cantCamionetas;
	}

}
