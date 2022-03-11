package co.com.sofka.sofkacars.domain.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.factura.entities.Cliente;
import co.com.sofka.sofkacars.domain.factura.entities.Estado;
import co.com.sofka.sofkacars.domain.factura.entities.Transaccion;
import co.com.sofka.sofkacars.domain.factura.events.ClienteCambiado;
import co.com.sofka.sofkacars.domain.factura.events.EstadoCambiado;
import co.com.sofka.sofkacars.domain.factura.events.FacturaCreada;
import co.com.sofka.sofkacars.domain.factura.events.TransaccionCambiada;
import co.com.sofka.sofkacars.domain.factura.ids.ClienteId;
import co.com.sofka.sofkacars.domain.factura.ids.EstadoId;
import co.com.sofka.sofkacars.domain.factura.ids.FacturaId;
import co.com.sofka.sofkacars.domain.factura.ids.TransaccionId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.EstadoActual;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Precio;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Factura extends AggregateEvent<FacturaId> {
    // se llaman las entidades de factura
    // modificador de acceso
    protected FacturaId facturaId;
    protected Cliente cliente;
    protected Transaccion transaccion;
    protected Estado estado;
    protected ConcesionarioId concesionarioId;

    // se crea el constructor

    public Factura(FacturaId facturaId, ConcesionarioId concesionarioId) {
        super(facturaId);

        appendChange(new FacturaCreada(facturaId, concesionarioId)).apply();

        subscribe(new FacturaChange(this));

    }

    // se crea la funcion from para la factura
    // Metodo que permite reconstruir el estado del agregado a partir de una lista de eventos de dominios
    public static Factura from(FacturaId facturaId, ConcesionarioId concesionarioId, List<DomainEvent> events){

        var factura = new Factura(facturaId, concesionarioId);
        // Evento de dominio, aplica el evento de dominio sobre la factura
        //events.forEach(event -> factura.applyEvent(event))
        events.forEach(factura::applyEvent);
        return factura;
    }

    //Cambiar Cliente
    public void cambiarCliente(ClienteId clienteId, Nombre nombre, Set<Telefono> telefono, Identificacion identificacion) {

        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        Objects.requireNonNull(identificacion);
        appendChange(new ClienteCambiado(clienteId, nombre, telefono, identificacion)).apply();
    }

    //cambiar transaccion
    public void cambiarTransaccion(TransaccionId transaccionId, Fecha fecha, Precio precio) {

        Objects.requireNonNull(transaccionId);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(precio);
        appendChange(new TransaccionCambiada(transaccionId, fecha, precio)).apply();
    }

    //cambiar estado
    public void cambiarEstado(EstadoId estadoId, EstadoActual estadoActual, Fecha fecha) {

        Objects.requireNonNull(estadoId);
        Objects.requireNonNull(estadoActual);
        Objects.requireNonNull(fecha);
        appendChange(new EstadoCambiado(estadoId, estadoActual, fecha)).apply();
    }

    // se crean los constructores

    public Cliente cliente() {
        return cliente;
    }

    public Transaccion transaccion() {
        return transaccion;
    }

    public Estado estado() {
        return estado;
    }
}
