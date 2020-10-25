
public class ClienteListable extends Cliente {

	private ClienteListable sig; // Apuntara al siguiente elemento en la lista

	ClienteListable(String dni, String nombre, ListaCtas tCtas) {
		super(dni, nombre, tCtas);
		sig = null;
	}

	public ClienteListable getSig() {
		return sig;
	}

	public void setSig(ClienteListable elemento) {
		this.sig = elemento;
	}

}
