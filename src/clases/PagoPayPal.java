package clases;

public class PagoPayPal extends Pago{
	
	private boolean loggedIn;//conexión a cuenta PayPal
	
	@Override
	public void realizarCobro(Factura factura) {
		if(!loggedIn) {
			logIn();
		}
		// cargar el monto de compra del medio de pago
	}
	
	public void logIn() {
		//solicita el logIn de la cuenta
	}
}
