package semana_03;

public class Asesor {
	
	private String nombre;
	private int dni,codigo;
	private double remuneracion;
    
	private static int cantidad;
    private static double sumaRemuneracion;
    public static final String NOMINSTITUCION;
    
    static {
    	cantidad =  0;
    	sumaRemuneracion =  0;
    	NOMINSTITUCION = "Caritas Felices ";
    }

	public Asesor(String nombre, int dni, int codigo, double remuneracion) {
	
		this.nombre = nombre;
		this.dni = dni;
		this.codigo = codigo;
		this.remuneracion = remuneracion;
		cantidad ++;
		sumaRemuneracion = sumaRemuneracion + remuneracion;
	}

	public Asesor(String nombre, int dni) {
		this(nombre,dni,55555,2000.0);
	}
	
	public Asesor() {
		this("NN",88888888);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Asesor.cantidad = cantidad;
	}

	public static double getSumaRemuneracion() {
		return sumaRemuneracion;
	}

	public static void setSumaRemuneracion(double sumaRemuneracion) {
		Asesor.sumaRemuneracion = sumaRemuneracion;
	}
	
	
	
    
    




}
