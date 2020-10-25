public class Fecha {
	private int dia;
	private int mes;
	private int a�o;

	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return   dia + "/" + mes + "/" + a�o;
	}


	public int compareTo(Fecha fecha) {

		int resultado = this.getA�o() - fecha.getA�o();

		if (resultado == 0) {
			resultado = this.getMes() - fecha.getMes();
			if (resultado == 0) {
				resultado = (this.getDia() - fecha.getDia());
			}
		}
		
		if (resultado < 0) {
			resultado = -1;
		}
		if (resultado > 0) {
			resultado = 1;
		}
		return resultado;

	}

}