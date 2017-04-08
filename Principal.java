package entidades;

import java.util.*;

public class Principal {

	private static Scanner teclado;
	
	public static void main(String[] args) {
		
		teclado=new Scanner(System.in);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		int op;
		int op2=0;
		int cont=0;
		
		
		do{ 
			System.out.println("CARGA DE EMPLEADOS");
			System.out.println("1)Administrativo");
			System.out.println("2)Vendedor");
			op = (Integer.parseInt(teclado.nextLine()));
			
			if(op==1){
				Administrativo adm=new Administrativo();
				cargaDatosAdministrativo(adm);
				empleados.add(adm);
			}
			
			else{
				Vendedor ven=new Vendedor();
				cargaDatosVendedor(ven);
				empleados.add(ven);
			}
			
			cont++;
			if(cont != 20){
			System.out.println("Quiere agragar otro empleado?");
			System.out.println("1)SI");
			System.out.println("2)NO");
			op2 = (Integer.parseInt(teclado.nextLine()));
			};
		
			
			
		} while((cont<20)&&(op2==1));
		
		teclado.close();
		mostrarEmpleados(empleados);

	}

	private static void mostrarEmpleados(ArrayList<Empleado> empleados) {
	
		for(Empleado emp: empleados){
			System.out.println("######################################");
			System.out.println("Nombre: "+ emp.getNombre());
			System.out.println("Apellido: "+ emp.getApellido());
			System.out.println("DNI: "+ emp.getDni());
			System.out.println("eMAil: "+ emp.geteMail());
			System.out.println("Sueldo: "+ emp.getSueldo());
			
		}
		
		
		
	}

	private static void cargaDatosVendedor(Vendedor ven) {
		System.out.println("INGRESE DATOS");
		System.out.println("DNI:");
		ven.setDni(Integer.parseInt(teclado.nextLine()));
		System.out.println("Nombre:");
		ven.setNombre(teclado.nextLine());
		System.out.println("Apellido:");
		ven.setApellido(teclado.nextLine());
		System.out.println("E-mail:");
		ven.seteMail(teclado.nextLine());
		System.out.println("Sueldo base:");
		ven.setSueldoBase(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Porcentaje de comision:");
		ven.setTotalVentas(Integer.parseInt(teclado.nextLine()));
		System.out.println("Total ventas:");
		ven.setPorcentajeComision(Integer.parseInt(teclado.nextLine()));
	}

	private static void cargaDatosAdministrativo(Administrativo adm) {
		System.out.println("INGRESE DATOS");
		System.out.println("DNI:");
		adm.setDni(Integer.parseInt(teclado.nextLine()));
		System.out.println("Nombre:");
		adm.setNombre(teclado.nextLine());
		System.out.println("Apellido:");
		adm.setApellido(teclado.nextLine());
		System.out.println("E-mail:");
		adm.seteMail(teclado.nextLine());
		System.out.println("Sueldo base:");
		adm.setSueldoBase(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Horas extras: ");
		adm.setHorasExtra(Integer.parseInt(teclado.nextLine()));
		System.out.println("Horas mes: ");
		adm.setHorasMes(Integer.parseInt(teclado.nextLine()));
	}

}
