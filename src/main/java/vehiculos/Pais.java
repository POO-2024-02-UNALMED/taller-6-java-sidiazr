package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private ArrayList<Pais> listado = new ArrayList<Pais>();
	private String nombre;
	
	public int cantVendidos;
	
	public Pais() {listado.add(this)}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this)
	}
	
	public Pais paisMasVendedor() {
		Pais ganador = listado.get(0);
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i).getCantVendidos() > ganador.getCantVendidos()) {
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

	public int getCantVendidos() {
		return cantVendidos;
	}

	public void setCantVendidos(int cantVendidos) {
		this.cantVendidos = cantVendidos;
	}

}
