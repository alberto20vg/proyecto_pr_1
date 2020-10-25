// @author Alberto Valdivia García
public class Main {

	public static void main(String[] args) throws Exception {

// BANCO
		ListaCli clientesSantander = new ListaCli();
		Banco Santander = new Banco("Santander", clientesSantander);

// FECHAS
		Fecha fecha4 = new Fecha(05, 01, 2017);
		Fecha fecha1 = new Fecha(26, 03, 2019);
		Fecha fecha3 = new Fecha(26, 07, 2020);
		Fecha fecha2 = new Fecha(02, 12, 2020);

// MOVIMIENTOS
		MovimientoListable mov1 = new MovimientoListable(fecha1, 10, "Movimiento 1");
		MovimientoListable mov2 = new MovimientoListable(fecha2, 20, "Movimiento 2");
		MovimientoListable mov3 = new MovimientoListable(fecha3, 40, "Movimiento 3");
		MovimientoListable mov4 = new MovimientoListable(fecha4, -10, "Movimiento 4");
// LISTA CUENTAS
		ListaCtas ListaCuentasAlberto = new ListaCtas();
		ListaCtas ListaCuentasJuan = new ListaCtas();
		ListaCtas ListaCuentasMacarena = new ListaCtas();

// LISTA MOVIMIENTOS
		ListaMovs AlbertoMovs1 = new ListaMovs();
		ListaMovs AlbertoMovs2 = new ListaMovs();
		ListaMovs JuanMovs = new ListaMovs();
		ListaMovs MacarenaMovs = new ListaMovs();

// CLIENTES
		ClienteListable Alberto = new ClienteListable("46938753Q", "Alberto", ListaCuentasAlberto);
		ClienteListable Juan = new ClienteListable("46938753Q", "Juan", ListaCuentasJuan);
		ClienteListable Macarena = new ClienteListable("46938753Q", "Macarena", ListaCuentasMacarena);

// CUENTAS
		CuentaListable cuentaAlberto1 = new CuentaListable(1, Alberto, AlbertoMovs1, fecha1);
		CuentaListable cuentaAlberto2 = new CuentaListable(2, Alberto, AlbertoMovs2, fecha2);
		CuentaListable cuentaJuan = new CuentaListable(3, Juan, JuanMovs, fecha1);
		CuentaListable cuentaMacarena = new CuentaListable(4, Macarena, MacarenaMovs, fecha1);

// ENLAZAR LAS LISTAS DE CLIENTES Y LAS LISTAS DE CUENTAS
		clientesSantander.add(Alberto);
		clientesSantander.add(Juan);
		clientesSantander.add(Macarena);

		ListaCuentasAlberto.add(cuentaAlberto1);
		ListaCuentasAlberto.add(cuentaAlberto2);
		ListaCuentasJuan.add(cuentaJuan);
		ListaCuentasMacarena.add(cuentaMacarena);

//		AÑADIR MOVIMIENTOS
		cuentaAlberto2.añadeMovACuenta(mov1);
		Alberto.añadeMovACuenta(1, fecha4, 50, "prueba 1");

		cuentaJuan.añadeMovACuenta(mov2);

		cuentaMacarena.añadeMovACuenta(mov3);
		cuentaMacarena.añadeMovACuenta(mov4);
System.out.println("-----Prueba de mostrarMovs-----");
		cuentaAlberto1.mostrarMovs(fecha1, fecha3);
		System.out.println();
		
		System.out.println("-----Prueba de mostrarClientes-----");
		Santander.mostrarClientes();
		System.out.println();
		
		System.out.println("-----Prueba de grandesClientes-----");
		Santander.grandesClientes(20);;
		

	}

}
