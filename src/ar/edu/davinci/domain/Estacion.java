package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Estacion {

	private Integer id;
	private String nombre;
	private List<Cabina> cabinas;

	public Estacion(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cabinas = new ArrayList<>();
	}

	// Constructor para usar en la búsqueda
	public Estacion(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}

	public void addCabina(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	public void addCabina(Integer id, MedioDePago medioDePago) {
		Cabina cabina = new Cabina(id, medioDePago);
		this.addCabina(cabina);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacion other = (Estacion) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", cabinas=" + cabinas + "]";
	}

	public Cabina getCabinaById(Integer id) {
		Cabina aBuscar = new Cabina(id);
		for (Cabina cabina : cabinas) {
			if (cabina.equals(aBuscar)){
				return cabina;
			}
		}
		return null;
	}


	public static Integer dameHoraActual() {
		Random rand = new Random();
		return rand.nextInt(24);
	}
	
	

	public List<Cabina> cabinasConEfectivo( ){
		 List<Cabina> cabiEfec=new ArrayList<Cabina>();
		
		for(Cabina cabi: this.cabinas){
			
			
			if(cabi.getMedioDePago().getDescripcion().equals("EFECTIVO")) {
				
				cabiEfec.add(cabi);
			}
			
		}
		
		
		return cabiEfec;
	}
	
	
	public void cobrar(Vehiculo vei, Cabina cab) {
		
				
				for(Cabina cabinas:this.cabinas) {
					if(cabinas.getId()==cab.getId()) {
					cabinas.cobrar(vei,dameHoraActual());
					}
				}
				
			
		}
		
	public double promedioDeDemora() {
		int totaCabinasDia=0;
		for(Cabina esta:cabinas) {
			totaCabinasDia=esta.diasDemora();
		}
		return totaCabinasDia/cabinas.size();
		
	}
	
}
