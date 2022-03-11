package co.com.sofka.sofkacars.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

public class MecanicoAniadido extends DomainEvent
{

    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Identificacion identificacion;


    public MecanicoAniadido(MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion ) {
        super("RetoConcesionarioDDD.MecanicoAniadido");
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
