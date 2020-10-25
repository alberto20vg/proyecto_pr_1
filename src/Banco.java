public class Banco {
	private String idBanco;
	private ListaCli lCli;

	public Banco(String idBanco, ListaCli lCli) {
		super();
		this.idBanco = idBanco;
		this.lCli = lCli;
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	public ListaCli getlCli() {
		return lCli;
	}

	public void setlCli(ListaCli lCli) {
		this.lCli = lCli;
	}

	public void grandesClientes(float importeMinimo) throws Exception {
		lCli.clientesGrandes(importeMinimo);
	}

	public void mostrarClientes() {
		ClienteListable posicion = this.getlCli().getPrimer();


		ClienteListable[] lista = new ClienteListable[lCli.length()];
		posicion = this.getlCli().getPrimer();
// se meten los clientes en una lista sin ordenar
		for (int i = 0; i < lista.length; i++) {
			lista[i] = posicion;
			posicion = posicion.getSig();
		}

		lista = ordena(lista);
//para representarlos
		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.println("Cliente: " + lista[i].getNombre());
			System.out.println("DNI: " + lista[i].getDni());
			System.out.println(lista[i].gettCtas());
			CuentaListable posMov = lista[0].gettCtas().getPrimer();


		}

	}

	public ClienteListable[] ordena(ClienteListable[] lista) {
		ClienteListable aux;

		for (int i = 1; i < lista.length; i++) {
			for (int j = lista.length - 1; j >= 1; j--) {
				if (lista[j].obtenerSaldoCliente() < lista[j - 1].obtenerSaldoCliente()) {
					aux = lista[j];
					lista[j] = lista[j - 1];
					lista[j - 1] = aux;
				}
			}
		}
		return lista;

	}

	@Override
	public String toString() {
		return idBanco +"\n" + lCli;
	}

}