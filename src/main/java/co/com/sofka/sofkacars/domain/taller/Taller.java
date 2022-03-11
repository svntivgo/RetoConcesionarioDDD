package co.com.sofka.sofkacars.domain.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.sofkacars.domain.taller.entities.BaulHerramientas;
import co.com.sofka.sofkacars.domain.taller.entities.Mecanico;
import co.com.sofka.sofkacars.domain.taller.entities.Servicio;
import co.com.sofka.sofkacars.domain.taller.events.TallerCreado;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

import java.util.Set;

public class Taller extends AggregateEvent <TallerId>
{
    protected TallerId tallerId;
    protected Set<Mecanico> mecanicos;
    protected Set<BaulHerramientas>baulHerramientas;
    protected Servicio servicio;

    public Taller(TallerId tallerId) {
        super(tallerId);
        appendChange(new TallerCreado(tallerId)).apply();

        subscribe(new TallerChange(this));
    }
}
