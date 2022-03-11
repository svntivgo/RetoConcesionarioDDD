package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

public class MecanicoCambiado  extends DomainEvent

{
    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Identificacion identificacion;


    public MecanicoCambiado(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion ) {
        super("RetoConcesionarioDDD.MecanicoCambiado");
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
        this.identificacion = identificacion;

    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }
}

