package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabina {

	private Integer id;
	private MedioDePago medioDePago;
	private List<Registro> registros;

	public Cabina(Integer id, MedioDePago medioDePago) {
		this.id = id;
		this.medioDePago = medioDePago;
		this.registros = new ArrayList<>();
	}

	// Se usa para las búsquedas
	public Cabina(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public void addRegistro(Registro registro) {
		this.registros.add(registro);
	}

	private void addRegistro(Integer hora, Vehiculo vehiculo, double pago) {
		Registro registro = new Registro(hora, vehiculo,pago );
		addRegistro(registro);
	}

	public void addRegistro(Vehiculo vehiculo) {
		Registro registro = new Registro(Estacion.dameHoraActual(), vehiculo, 100);
		addRegistro(registro);
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
		Cabina other = (Cabina) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cabina [id=" + id + ", medioDePago=" + medioDePago + ", registros=" + registros + "]";
	}

	
	
	public int diasDemora() {
		int totalDias=0;
		if(medioDePago.getDescripcion()=="SUBE" || "PASE"==medioDePago.getDescripcion())
			totalDias=medioDePago.getDiasDemora();
	
	return totalDias;
		
		
	}
	
	public void cobrar(Vehiculo vei,int damehoraactual) {
		double pago=vei.getCategoria().getPrecio();
		double medio=medioDePago.getDescuento();
		
		if((damehoraactual>=6 && damehoraactual<=10) || (damehoraactual>=17 && damehoraactual <=20)) {
			pago= pago+ (pago*0.08);
			pago=pago-(pago*medio/100);
			
			
		}else {
			pago=pago-(pago*medio/100);
			
		}
		System.out.println(pago);
		addRegistro(damehoraactual, vei,pago);
			
		
	
}
	

}
