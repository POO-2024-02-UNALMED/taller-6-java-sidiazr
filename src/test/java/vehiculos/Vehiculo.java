package vehiculos;

public class Vehiculo {
	
	private static int cantidadVehiculos;
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo() {cantidadVehiculos++;}
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, 
			int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa; this.puertas = puertas; this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre; this.precio = precio; this.peso = peso; this.traccion = traccion;
		this.fabricante = fabricante;
		
		fabricante.getPais().cantVendidos++;
		fabricante.cantVehiculos++;
		
		cantidadVehiculos++;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantAutomoviles()
				+ "\nCamionetas: " + Camioneta.getCantCamionetas()
				+ "\nCamiones: " + Camion.getCantCamiones();
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public int getVelocidadMaxima() {
	return velocidadMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public static void setCantidadVehiculos(int i) {
		Vehiculo.cantidadVehiculos = i;
		
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

}
