package ar.com.gl.clasesobjetos;

public class Empleado extends Persona{
	
	private int ID;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double retenciones;
	private boolean casado;
	private int hijos;
	private static double valorHoraExtra;
	private int dni;
	
	public Empleado(int dni) {
		this.dni = dni;
	}
	
	@Override
	public void caminar() {
		System.out.println("Un empleado caminando");
	}
	
	@Override
	public void saltar() {
		System.out.println("Un empleado saltando");
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(double retenciones) {
		this.retenciones = retenciones;
	}

	public String isCasado() {
		
		if (casado) {
			return "Si";
		}
		
		return "no";
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public static double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public double calculoHorasExtrasTrabajadas() {
		double bonoHorasExtras = this.getHorasExtras() * getValorHoraExtra();
	
		return bonoHorasExtras;
	}
	
	public double calculoSueldoBruto() {
		
		double sueldoBruto = this.calculoHorasExtrasTrabajadas() + this.sueldoBase;
		
		return sueldoBruto;
	}
	
	public double calculoRetenciones() {
		
		double retencion = this.getRetenciones();
		
		if (casado) {
			retencion-=2;
		}
		if (this.getHijos() > 0) {
			retencion -= (this.getHijos() * 1);
		}
		
		retencion /= 100;
		
		return calculoSueldoBruto() - (calculoSueldoBruto() * retencion);
	}

	@Override
	public String toString() {
		
		return	this.getID() + this.getNombre() + "\n" +
				"Sueldo base: " + this.getSueldoBase() + "\n" +
				"Horas extras: " + this.getHorasExtras() +  "\n" +
				"tipo IRPF: " + this.getRetenciones() + "\n" +
				"Casado: " + this.isCasado() + "\n" +
				"Numero de Hijos: " + this.getHijos();
	}
	
	
	
	
	 
}
