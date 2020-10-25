public class Movimiento {
	private Fecha fecha;
	private float importe;
	private String concepto;

	public Movimiento(Fecha fecha, float importe, String concepto) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.concepto = concepto;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	@Override
	public String toString() {
		return "Movimiento [fecha=" + fecha + ", importe=" + importe + ", concepto=" + concepto + "]";
	}

}