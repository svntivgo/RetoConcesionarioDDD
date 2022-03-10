package co.com.sofka.sofkacars.domain.concesionario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.sofkacars.domain.concesionario.entities.Administrador;
import co.com.sofka.sofkacars.domain.concesionario.entities.Asesor;
import co.com.sofka.sofkacars.domain.concesionario.entities.Carro;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

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
}
