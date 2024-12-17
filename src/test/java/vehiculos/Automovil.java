package vehiculos;

public class Automovil extends Vehiculo {
	
	private static int cantAutomoviles;
	
	private int puestos;
	
	public Automovil() {cantAutomoviles++;}
	
	public Automovil(String placa, String nombre, 
			int precio, int peso, Fabricante fabricante, int puestos) {
		
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantAutomoviles++;
		
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public static int getCantAutomoviles() {
		return cantAutomoviles;
	}

}
