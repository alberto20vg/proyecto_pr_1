
public class CuentaListable extends Cuenta {

	private CuentaListable sig; // Apuntara al siguiente elemento en la lista

	CuentaListable(long numero, Cliente cliente, ListaMovs tMovs, Fecha fechaCreacion) {
		super(numero, cliente, tMovs, fechaCreacion);
		sig = null;
	}

	public CuentaListable getSig() {
		return sig;
	}

	public void setSig(CuentaListable elemento) {
		this.sig = elemento;
	}

}
