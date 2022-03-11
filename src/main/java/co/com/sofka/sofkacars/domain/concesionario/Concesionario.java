package co.com.sofka.sofkacars.domain.concesionario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.entities.Administrador;
import co.com.sofka.sofkacars.domain.concesionario.entities.Asesor;
import co.com.sofka.sofkacars.domain.concesionario.entities.Carro;
import co.com.sofka.sofkacars.domain.concesionario.events.*;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Precio;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Concesionario  extends AggregateEvent<ConcesionarioId>
{
    //entidades Concesionario

    protected  ConcesionarioId concesionarioId;
    protected Set<Carro> carros;
    protected Set<Asesor> asesores;
    protected Administrador administrador;

    //constructor

    public Concesionario(ConcesionarioId concesionarioId){
        super(concesionarioId);
        appendChange(new ConcesionarioCreado(concesionarioId)).apply();

        subscribe(new ConsecionarioChange(this));
    }



    public  static Concesionario from(ConcesionarioId concesionarioId, List<DomainEvent>events)
    {
        var concesionario = new Concesionario(concesionarioId);
        events.forEach(concesionario::applyEvent);
        return  concesionario;
    }


    //métodos del agregado

    //Carro Entity
    public void aniadirCarro(CarroId carroId, Marca marca, Modelo modelo, Color color, Precio precio)
    {


        Objects.requireNonNull(carroId);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(modelo);
        Objects.requireNonNull(color);
        Objects.requireNonNull(precio);
        appendChange(new CarroAniadido(carroId,marca,modelo,color,precio));

    }


    public void cambiarCarro(CarroId carroId, Marca marca, Modelo modelo, Color color, Precio precio)
    {
        Objects.requireNonNull(carroId);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(modelo);
        Objects.requireNonNull(color);
        Objects.requireNonNull(precio);
        appendChange(new CarroCambiado(carroId,marca,modelo,color,precio));

    }

    public void eliminarCarro(CarroId carroId)
    {
        Objects.requireNonNull(carroId);
        appendChange(new CarroEliminado(carroId ));
    }

    //Admin entity
    public void aniadirAdmin(AdministradorId administradorId, Nombre nombre, Identificacion identificacion, Email email)
    {
        Objects.requireNonNull(administradorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);
        appendChange(new AdminAniadido(administradorId,nombre,identificacion,email));

    }

    public void cambiarAdmin(AdministradorId administradorId, Nombre nombre, Identificacion identificacion, Email email)
    {
        Objects.requireNonNull(administradorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);
        appendChange(new AdminCambiado(administradorId,nombre,identificacion,email));

    }


    public void eliminarAdmin(AdministradorId administradorId)
    {
        Objects.requireNonNull(administradorId);
        appendChange(new AdminEliminado(administradorId ));
    }


    //Asesor entity

    public void aniadirAsesor(AsesorId asesorId, Nombre nombre, Identificacion identificacion, Telefono telefono)
    {
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(telefono);
        appendChange(new AsesorAniadido(asesorId,nombre,identificacion,telefono));

    }

    public void cambiarAsesor(AsesorId asesorId, Nombre nombre, Identificacion identificacion, Telefono telefono)
    {
        Objects.requireNonNull(asesorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(telefono);
        appendChange(new AsesorCambiado(asesorId,nombre,identificacion,telefono));

    }

    public void eliminarAsesor(AsesorId asesorId)
    {
        Objects.requireNonNull(asesorId);
        appendChange(new AsesorEliminado(asesorId ));
    }



    //constructor por defecto

    public  Set<Carro> carros()
    {
        return carros;
    }

    public  Set<Asesor> asesores()
    {
        return asesores;
    }

    public Administrador administrador()
    {
        return administrador;
    }



}
