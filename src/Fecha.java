public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return   dia + "/" + mes + "/" + año;
	}


	public int compareTo(Fecha fecha) {

		int resultado = this.getAño() - fecha.getAño();

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