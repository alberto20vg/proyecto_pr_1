public class Cuenta {
	private long numero;
	private Cliente cliente;
	private ListaMovs tMovs;
	private Fecha fechaCreacion;

	public Cuenta(long numero, Cliente cliente, ListaMovs tMovs, Fecha fechaCreacion) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.tMovs = tMovs;
		this.fechaCreacion = fechaCreacion;
	}
	

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ListaMovs gettMovs() {
		return tMovs;
	}

	public void settMovs(ListaMovs tMovs) {
		this.tMovs = tMovs;
	}

	public Fecha getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Fecha fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Numero cuenta=" + numero + ", cliente=" + cliente.getNombre() + ", Saldo=" + this.mostrarSaldo() + ", fechaCreacion="
				+ fechaCreacion;
	}
	/**
	 * 
	 * @return devuelve el saldo de la cuenta 
	 */
	public double mostrarSaldo() {
		
		return tMovs.sumarMovimientos();
		
	}
	
	public void añadeMovACuenta(MovimientoListable m) throws Exception {

		ListaMovs tMov = this.gettMovs();
		tMov.add(m);

	}
	
	public void mostrarMovs(Fecha ini, Fecha fin) {
		tMovs.movimientosFecha( ini,  fin);
	}

}