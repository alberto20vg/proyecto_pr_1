public class ListaCli {

	private ClienteListable primer;

	public ClienteListable getPrimer() {
		return primer;
	}

	public void setPrimer(ClienteListable primer) {
		this.primer = primer;
	}

	public boolean isEmpty() {
		return (primer == null ? true : false);
	}

	public void add(ClienteListable client) {
		ClienteListable aux = primer;
		if (primer == null) {
			primer = client;
		} else {

			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(client);
		}
	}

	public boolean remove(ClienteListable client) {
		ClienteListable aux = primer;
		ClienteListable auxAnt = primer;

		while (aux != null && !(aux.equals(client))) {
			auxAnt = aux;
			aux = aux.getSig();
		}

		if (aux == null) {
			return false;
		} else {
			auxAnt.setSig(aux.getSig());
			aux.setSig(null);
			return true;
		}

	}

	public ClienteListable seek(String nombre) throws Exception {
		ClienteListable aux = primer;

		while (aux != null && !(aux.getNombre().equals(nombre))) {
			aux = aux.getSig();
		}

		if (aux == null) {
			throw new Exception("Elemento no encontrado");
		} else {
			return aux;
		}
	}

	public void clientesGrandes(float importeMinimo) throws Exception {
		ClienteListable aux = primer;

		while (aux != null) {
			if (aux.obtenerSaldoCliente() > importeMinimo)
				System.out.println(aux.toString());
			aux = aux.getSig();
		}

	}

	public int length() {

		int total = 0;
		ClienteListable aux = primer;
		if (primer == null) {
			total = 0;
		} else {

			while (aux != null) {
				total++;
				aux = aux.getSig();
			}
		}
		return total;
	}

	public String toString() {
		String cadena = "";
		ClienteListable aux = primer;
		if (primer == null) {
			cadena = "lista vacia\n";
		} else {
			while (aux != null) {
				cadena += aux + "\n";
				aux = aux.getSig();
			}
		}
		return cadena;
	}
}
