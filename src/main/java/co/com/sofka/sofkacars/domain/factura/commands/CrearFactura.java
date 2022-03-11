package co.com.sofka.sofkacars.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;

public class CrearFactura extends Command {
    private final FacturaId facturaId;
    private final ConcesionarioId concesionarioId;

    public CrearFactura(FacturaId facturaId, ConcesionarioId concesionarioId) {
        this.facturaId = facturaId;
        this.concesionarioId = concesionarioId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }
}
