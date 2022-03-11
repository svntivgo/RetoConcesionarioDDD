package co.com.sofka.sofkacars.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;

public class FacturaCreada extends DomainEvent {
    private final FacturaId facturaId;
    private final ConcesionarioId concesionarioId;

    public FacturaCreada(FacturaId facturaId, ConcesionarioId concesionarioId) {
        super("RetoConcesionarioDDD.FacturaCreada");
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
