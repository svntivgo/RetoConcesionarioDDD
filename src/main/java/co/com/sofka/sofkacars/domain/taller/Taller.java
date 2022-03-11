package co.com.sofka.sofkacars.domain.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.events.*;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Color;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Marca;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Modelo;
import co.com.sofka.sofkacars.domain.factura.entities.Estado;
import co.com.sofka.sofkacars.domain.factura.entities.Transaccion;
import co.com.sofka.sofkacars.domain.taller.entities.BaulHerramientas;
import co.com.sofka.sofkacars.domain.taller.entities.Mecanico;
import co.com.sofka.sofkacars.domain.taller.entities.Servicio;
import co.com.sofka.sofkacars.domain.taller.events.*;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Alicates;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Gatos;
import co.com.sofka.sofkacars.domain.taller.valueobjects.LlavesInglesas;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Precio;
import co.com.sofka.sofkacars.generics.Telefono;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Taller extends AggregateEvent <TallerId>
{
    protected TallerId tallerId;
    protected Set<Mecanico> mecanicos;
    protected Set<BaulHerramientas>baulHerramientas;
    protected Servicio servicio;
    protected  ConcesionarioId concesionarioId;

    public Taller(TallerId tallerId, ConcesionarioId concesionarioId) {
        super(tallerId);
        appendChange(new TallerCreado(tallerId,concesionarioId)).apply();

        subscribe(new TallerChange(this));
        }


        public  static Taller from (TallerId tallerId ,ConcesionarioId concesionarioId, List< DomainEvent> events)
        {
            var taller = new Taller(tallerId, concesionarioId);
            events.forEach(taller::applyEvent);
            return  taller;
        }



    //métodos del agregado

    //Mecanico Entity
    public void aniadirMecanico(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion  )
    {
        Objects.requireNonNull(mecanicoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);


        appendChange(new MecanicoAniadido(mecanicoId,nombre,identificacion));

    }


    public void cambiarMecanico(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion  )
    {
        Objects.requireNonNull(mecanicoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);


        appendChange(new MecanicoCambiado(mecanicoId,nombre,identificacion));

    }

    public void eliminarMecanico(MecanicoId mecanicoId)
    {
        Objects.requireNonNull(mecanicoId);
        appendChange(new MecanicoEliminado(mecanicoId ));
    }

    //BaulHerramientas entity
    public void aniadirBaulHerramientas(BaulHerramientasId baulHerramientasid, LlavesInglesas llavesInglesas, Gatos gatos, Alicates alicates)
    {
        Objects.requireNonNull(baulHerramientasid);
        Objects.requireNonNull(llavesInglesas);
        Objects.requireNonNull(gatos);
        Objects.requireNonNull(alicates);
        appendChange(new BaulHerramientasAniadido(baulHerramientasid, alicates,gatos, llavesInglesas));

    }

    public void cambiarBaulHerramientas(BaulHerramientasId baulHerramientasid, LlavesInglesas llavesInglesas, Gatos gatos, Alicates alicates)
    {
        Objects.requireNonNull(baulHerramientasid);
        Objects.requireNonNull(llavesInglesas);
        Objects.requireNonNull(gatos);
        Objects.requireNonNull(alicates);
        appendChange(new BaulHerramientasCambiado(baulHerramientasid, alicates,gatos, llavesInglesas));
    }


        public void eliminarBaulHerramientas(BaulHerramientasId baulHerramientasId)
    {
        Objects.requireNonNull(baulHerramientasId);
        appendChange(new BaulHerramientasEliminado(baulHerramientasId ));
    }


    //Asesor entity

    public void aniadirServicio(ServicioId servicioId, Mantenimiento mantenimiento)
    {
        Objects.requireNonNull(servicioId);
        Objects.requireNonNull(mantenimiento);
        appendChange(new ServicioAniadido(servicioId,mantenimiento));

    }

    public void cambiarrServicio(ServicioId servicioId, Mantenimiento mantenimiento)
    {
        Objects.requireNonNull(servicioId);
        Objects.requireNonNull(mantenimiento);
        appendChange(new ServicioCambiado(servicioId,mantenimiento));

    }

    public void eliminarServicio(ServicioId servicioId)
    {
        Objects.requireNonNull(servicioId);
        appendChange(new ServicioEliminado(servicioId ));
    }




        public Set <BaulHerramientas> baulHerramientas() {
            return baulHerramientas;
        }

        public Set <Mecanico> mecanicos() {
            return mecanicos;
        }

        public Servicio servicio() {
            return servicio;
        }



    }

