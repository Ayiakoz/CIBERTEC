package semana_03;

public class Consultor {
	private int codigo;
	private String nombre;
	private int horastrabajadas;
	private double tarifaHora;

	private static int cantidad;
	private static double sueldoNeto;

	public static final double AFP, EPS;

	static {
		AFP = 0.10;
		EPS = 0.05;
		cantidad = 0;
		sueldoNeto = 0;
	}

	public Consultor(int codigo, String nombre, int horastrabajadas, double tarifaHora) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horastrabajadas = horastrabajadas;
		this.tarifaHora = tarifaHora;
		cantidad++;
		sueldoNeto = sueldoNeto + sueldoBruto();

	}

	public Consultor(int codigo, String nombre, int horastrabajadas) {
		this(codigo,nombre,horastrabajadas,65.0);
	}

	public Consultor() {
		this(333, "Juan", 30);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorastrabajadas() {
		return horastrabajadas;
	}

	public void setHorastrabajadas(int horastrabajadas) {
		this.horastrabajadas = horastrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Consultor.cantidad = cantidad;
	}

	public static double getSueldoNeto() {
		return sueldoNeto;
	}

	public static void setSueldoNeto(double sueldoNeto) {
		Consultor.sueldoNeto = sueldoNeto;
	}

	public double sueldoBruto() {
		return horastrabajadas * tarifaHora;
	}

	public double descuentoAfp() {
		return sueldoBruto() * AFP;
	}

	public double descuentoEps() {
		return sueldoBruto() * EPS;
	}

	public double sueldoNeto() {
		return sueldoBruto() - descuentoAfp() - descuentoEps();
	}

}
