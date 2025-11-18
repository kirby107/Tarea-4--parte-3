package Adapter;

import Legacy.LegacyBillingSystem;

public class FacturaAdapter extends FacturaService {

    private final LegacyBillingSystem legacy = new LegacyBillingSystem();

    @Override
    public void generarFactura(String cliente, String producto, double total) {
        legacy.emitirFactura(cliente, "Producto: " + producto, total);
    }
}
