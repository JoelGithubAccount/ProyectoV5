package Modelo;

public abstract class Profesionistas {

	private Long cedula;
	private String carrera;
	
	
	public Profesionistas(Long cedula, String carrera) {
		this.cedula = cedula;
		this.carrera = carrera;
	}


	public Long getCedula() {
		return cedula;
	}


	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	
}
