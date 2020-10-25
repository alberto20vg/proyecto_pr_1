public class ListaMovs {

	private MovimientoListable primer;

	public boolean isEmpty() {
		return (primer == null ? true : false);
	}

	public void add(MovimientoListable mov) {
		MovimientoListable aux = primer;
		if (primer == null) {
			primer = mov;
		} else {

			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(mov);
		}
	}

	public boolean remove(MovimientoListable mov) {
		MovimientoListable aux = primer;
		MovimientoListable auxAnt = primer;

		while (aux != null && !(aux.equals(mov))) {
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

	public MovimientoListable seek(String concepto) throws Exception {
		MovimientoListable aux = primer;

		while (aux != null && !(aux.getConcepto().equals(concepto))) {
			aux = aux.getSig();
		}

		if (aux == null) {
			throw new Exception("Elemento no encontrado");
		} else {
			return aux;
		}
	}

	public float sumarMovimientos() {

		float saldo = 0;
		MovimientoListable aux = primer;
		if (primer == null) {
			saldo = 0;
		} else {

			while (aux != null) {
				saldo += aux.getImporte();
				aux = aux.getSig();
			}
		}
		return saldo;
	}

	public void movimientosFecha(Fecha ini, Fecha fin) {
		MovimientoListable aux = primer;

		while (aux != null) {
			if (aux.getFecha().compareTo(ini) == 1 && aux.getFecha().compareTo(fin) == -1
					|| aux.getFecha().compareTo(ini) == 0 || aux.getFecha().compareTo(fin) == -1)
				System.out.println(aux.toString());
			aux = aux.getSig();
		}

	}

	public int length() {

		int total = 0;
		MovimientoListable aux = primer;
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
		MovimientoListable aux = primer;
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