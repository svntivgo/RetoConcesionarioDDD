package co.com.sofka.sofkacars.domain.concesionario.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.generics.Alicate;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.Objects;

public class Asesor extends Entity <AsesorId>
{

    private Nombre nombre;
    private Alicate identificacion;
    private Telefono telefono;



    // se crea un constructor publico para los objectValue

    public Asesor(AsesorId asesorId, Nombre nombre, Alicate identificacion, Telefono telefono){

        // Super --> herencia
        super(asesorId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;

    }

    // métodos de la entidad Asesor

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Alicate identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }

    // cambiarTelefono()
    public void cambiarTelefono(Telefono telefono){
        this.telefono = Objects.requireNonNull(telefono);
    }
    

    @Override
    public String toString() {
        return "Asesor{" +
                "nombre=" + nombre +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", entityId=" + entityId +
                '}';
    }
}
