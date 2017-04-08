package entidades;

public class Vendedor extends Empleado {
	private int porcentajeComision;
	private int totalVentas;
	
	
	
	public int getPorcentajeComision() {
		return porcentajeComision;
	}
	public void setPorcentajeComision(int porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	@Override
	public double getSueldo(){
		return getSueldoBase()+(getPorcentajeComision()*getTotalVentas()/100);
	}

}
	//sueldoBase + (porcenComision*totalVtas/100)
