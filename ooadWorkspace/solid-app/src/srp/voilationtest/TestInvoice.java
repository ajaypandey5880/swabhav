package srp.voilationtest;

import srp.solution.InvoicePrinter;
import srp.voilation.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "name", 100, 10, 5);
		invoice.printInvoice();
		srp.solution.Invoice invoice2 = new srp.solution.Invoice(1, "ajay", 100, 10, 5);
		InvoicePrinter invoicePrinter = new InvoicePrinter();
		invoicePrinter.printInvoice(invoice2);
		
	}

}
