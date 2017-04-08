package entidades;

public class Administrativo extends Empleado {
	private int horasExtra;
	private int horasMes;
	
	
	
	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	public int getHorasMes() {
		return horasMes;
	}
	public void setHorasMes(int horasMes) {
		this.horasMes = horasMes;
	}
	@Override
	public double getSueldo(){
		return getSueldoBase()*(((getHorasExtra()*1.5)+getHorasMes())/getHorasMes());
	};
	
	

}
//sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes