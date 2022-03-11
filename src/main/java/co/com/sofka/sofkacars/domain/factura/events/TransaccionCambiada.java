package co.com.sofka.sofkacars.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.factura.ids.TransaccionId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;
import co.com.sofka.sofkacars.generics.Precio;

public class TransaccionCambiada extends DomainEvent {

    private final TransaccionId transaccionId;
    private final Fecha fecha;
    private final Precio precio;

    public TransaccionCambiada(TransaccionId transaccionId, Fecha fecha, Precio precio) {
        super("RetoConcesionarioDDD.TransaccionCambiada");
        this.transaccionId = transaccionId;
        this.fecha = fecha;
        this.precio = precio;
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
