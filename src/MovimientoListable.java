
public class MovimientoListable extends Movimiento {

	private MovimientoListable sig; // Apuntara al siguiente elemento en la lista

	MovimientoListable(Fecha fecha, float importe, String concepto) {
		super(fecha, importe, concepto);
		sig = null;
	}

	public MovimientoListable getSig() {
		return sig;
	}

	public void setSig(MovimientoListable elemento) {
		this.sig = elemento;
	}

}
