package co.com.sofka.sofkacars.domain.concesionario.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

import java.util.Objects;

public class Administrador  extends Entity <AdministradorId>

{

    // se crean variables para los objectValue

    private Nombre nombre;
    private Identificacion identificacion;
    private Email email;

    // se crea un constructor público para los objectValue

    public Administrador(AdministradorId administradorId, Nombre nombre, Identificacion identificacion, Email email){

        // Super --> herencia
        super(administradorId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email=email;
    }

    // métodos de la entidad Asesor

    // cambiarNombre()
    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    // cambiarIdentificacion()
    public void cambiarIdentificacion(Identificacion identificacion){
        this.identificacion = Objects.requireNonNull(identificacion);
    }
    //cambiarEmail()
    public  void cambiarEmail(Email email)
    {
        this.email= Objects.requireNonNull(email);
    }

}
