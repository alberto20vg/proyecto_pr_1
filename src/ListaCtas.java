public class ListaCtas {

	private CuentaListable primer;

	public CuentaListable getPrimer() {
		return primer;
	}

	public void setPrimer(CuentaListable primer) {
		this.primer = primer;
	}

	public boolean isEmpty() {
		return (primer == null ? true : false);
	}

	public void add(CuentaListable cuent) {
		CuentaListable aux = primer;
		if (primer == null) {
			primer = cuent;
		} else {

			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(cuent);
		}
	}

	public boolean remove(CuentaListable cuent) {
		CuentaListable aux = primer;
		CuentaListable auxAnt = primer;

		while (aux != null && !(aux.equals(cuent))) {
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

	public CuentaListable seek(long numero) throws Exception {
		CuentaListable aux = primer;

		while (aux != null && !(aux.getNumero() == numero)) {
			aux = aux.getSig();
		}

		if (aux == null) {
			throw new Exception("Elemento no encontrado");
		} else {
			return aux;
		}
	}


	public float sumarSaldosCuentas() {

		float saldo = 0;
		CuentaListable aux = primer;
		if (primer == null) {
			saldo = 0;
		} else {

			while (aux != null) {
				saldo += aux.mostrarSaldo();
				aux = aux.getSig();
			}
		}
		return saldo;
	}

	public int length() {

		int total = 0;
		CuentaListable aux = primer;
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
		CuentaListable aux = primer;
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