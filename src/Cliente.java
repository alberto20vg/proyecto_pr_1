public class Cliente {
	private String dni;
	private String nombre;
	private ListaCtas tCtas;

	public Cliente(String dni, String nombre, ListaCtas tCtas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.tCtas = tCtas;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ListaCtas gettCtas() {
		return tCtas;
	}

	public void settCtas(ListaCtas tCtas) {
		this.tCtas = tCtas;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", dni=" + dni + "\n" + tCtas;

	}

	public float obtenerSaldoCliente() {
		return tCtas.sumarSaldosCuentas();

	}

	public void añadeMovACuenta(long cuenta, Fecha f, float imp, String cpto) throws Exception {
		CuentaListable lCuenta = tCtas.seek(cuenta);

		MovimientoListable mov1 = new MovimientoListable(f, imp, cpto);

		ListaMovs tMov = lCuenta.gettMovs();
		tMov.add(mov1);

	}

	/**
	 * 
	 * @param c
	 * @return resultado = -1 this menor resultado = 1 this mayor resultado = 0
	 *         iguales
	 */
	public int compareTo(Cliente c) {

		int resultado = 0;

		if (this.obtenerSaldoCliente() < c.obtenerSaldoCliente()) {
			resultado = -1;
		}

		else if (this.obtenerSaldoCliente() > c.obtenerSaldoCliente()) {
			resultado = 1;
		}

		else {
			resultado = 0;

		}

		return resultado;

	}

}
