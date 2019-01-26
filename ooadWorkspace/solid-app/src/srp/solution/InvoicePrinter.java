package srp.solution;

public class InvoicePrinter {
	public void printInvoice(Invoice invoice) {
		System.out.println("Id :\t" + invoice.getId() + "\nName :\t" + invoice.getName() + "\nCost :\t"
				+ invoice.getCost() + "\nDiscount :\t" + invoice.calculateDiscount() + "\nGst :\t"
				+ invoice.calculateTax() + "\nTotal Price :\t" + invoice.calculateTotalCost());
	}
}
