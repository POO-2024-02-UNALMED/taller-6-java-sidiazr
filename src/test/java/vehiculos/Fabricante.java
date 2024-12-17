package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	public int cantVehiculos;
	
	private String nombre;
	private Pais pais;
	
	public Fabricante() {listado.add(this);}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre; this.pais = pais;
		listado.add(this);
	}
	
	public Fabricante fabricaMayorVentas() {
		Fabricante ganador = listado.get(0);
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i).cantVehiculos > ganador.cantVehiculos) {
				ganador = listado.get(i);
			}
		}
		return ganador;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}

	public static int getCantVehiculos() {
		return cantVehiculos;
	}

	public static void setCantVehiculos(int cantVehiculos) {
		Fabricante.cantVehiculos = cantVehiculos;
	}

}
