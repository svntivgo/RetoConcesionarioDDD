package co.com.sofka.sofkacars.domain.factura.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.factura.ids.ClienteId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.Objects;
import java.util.Set;

public class Cliente extends Entity<ClienteId> {

    // se crean variables para los objectValue

    private Nombre nombre;
    private Set<Telefono> telefono;
    private Identificacion identificacion;

    // se crea un constructor publico para los objectValue

    public Cliente(ClienteId clienteId, Nombre nombre, Set<Telefono> telefono, Identificacion identificacion) {

        // Super --> herencia
        super(clienteId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    // métodos de la entidad Cliente

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // aniadirTelefono()
    public void aniadirTelefono(Telefono telefono){ this.telefono.add(telefono); }

    // cambiarTelefono()
    public void cambiarTelefono(Telefono telefono){ this.telefono.forEach(t -> {
        if (t.equals(telefono)) {
            this.telefono.remove(t);
            this.telefono.add(telefono);
        }}); }

    // actualizarTelefono()
    public void actualizarTelefono(Telefono telefono){ this.telefono.forEach(t -> {
        if (t.equals(telefono)) {
            this.telefono.remove(t);
            this.telefono.add(telefono);
        }}); }


    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }


}