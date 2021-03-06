package co.com.sofka.sofkacars.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;
import co.com.sofka.sofkacars.domain.factura.ids.TransaccionId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;
import co.com.sofka.sofkacars.generics.Precio;

public class CambiarTransaccion extends Command {

    private final FacturaId facturaId;
    private final TransaccionId transaccionId;
    private final Fecha fecha;
    private final Precio precio;

    public CambiarTransaccion(FacturaId facturaId,TransaccionId transaccionId, Fecha fecha, Precio precio) {
        this.facturaId=facturaId;
        this.transaccionId = transaccionId;
        this.fecha = fecha;
        this.precio = precio;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }


    public TransaccionId getTransaccionId() {
        return transaccionId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Precio getPrecio() {
        return precio;
    }
}
