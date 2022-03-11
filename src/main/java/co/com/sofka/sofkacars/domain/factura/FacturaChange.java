package co.com.sofka.sofkacars.domain.factura;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.sofkacars.domain.factura.entities.Cliente;
import co.com.sofka.sofkacars.domain.factura.entities.Estado;
import co.com.sofka.sofkacars.domain.factura.entities.Transaccion;
import co.com.sofka.sofkacars.domain.factura.events.ClienteCambiado;
import co.com.sofka.sofkacars.domain.factura.events.EstadoCambiado;
import co.com.sofka.sofkacars.domain.factura.events.FacturaCreada;
import co.com.sofka.sofkacars.domain.factura.events.TransaccionCambiada;

public class FacturaChange extends EventChange {
    public FacturaChange(Factura factura){

        apply((FacturaCreada event) -> {
            factura.facturaId = event.getFacturaId();
            factura.concesionarioId = event.getConcesionarioId();
        });

        // metodos

        // cambiarCliente()
        apply((ClienteCambiado event) -> {
            Cliente nuevoCliente = new Cliente(event.getClienteId(),
                    event.getNombre(),
                    event.getTelefono(),
                    event.getIdentificacion());
        });

        // cambiarTransaccion()

        apply((TransaccionCambiada event) -> {
            Transaccion nuevaTransaccion = new Transaccion(event.getTransaccionId(),
                    event.getFecha(),
                    event.getPrecio());
        });


        // cambiarEstado()
        apply((EstadoCambiado event) -> {
            Estado estado = new Estado(
                    event.getEstadoId(),
                    event.getEstadoActual(),
                    event.getFecha()
            );
        });

    }
}
