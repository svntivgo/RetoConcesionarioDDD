package co.com.sofka.sofkacars.domain.factura.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.factura.ids.TransaccionId;
import co.com.sofka.sofkacars.domain.factura.valueobjects.Fecha;
import co.com.sofka.sofkacars.generics.Precio;

import java.util.Objects;

public class Transaccion extends Entity<TransaccionId> {

    // se crean variables para los objectValue

    private Fecha fecha;
    private Precio precio;

    // se crea un constructor publico para los objectValue


    public Transaccion(TransaccionId entityId, Fecha fecha, Precio precio) {

        // Super --> herencia
        super(entityId);
        this.fecha = fecha;
        this.precio = precio;
    }

    // métodos de la entidad Transaccion

    // cambiarFecha()
    public void cambiarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    // cambiarFecha()
    public void cambiarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }
}
