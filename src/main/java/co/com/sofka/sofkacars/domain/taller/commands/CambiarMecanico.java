package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

public class CambiarMecanico {
    private final ConcesionarioId concesionarioId;
    private final TallerId tallerId;
    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Identificacion identificacion;


    public CambiarMecanico(ConcesionarioId concesionarioId, TallerId tallerId, MecanicoId mecanicoId, Nombre nombre, Identificacion identificacion ) {
        this.concesionarioId = concesionarioId;
        this.tallerId = tallerId;
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
        this.identificacion = identificacion;

    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public TallerId getTallerId() {
        return tallerId;
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
