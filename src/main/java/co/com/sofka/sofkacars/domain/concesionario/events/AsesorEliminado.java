package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;

public class AsesorEliminado extends DomainEvent {
    private final AsesorId asesorId;

    public AsesorEliminado(AsesorId asesorId){
        super("RetoConcesionarioDDD.AsesorEliminado");
        this.asesorId = asesorId;
    }

    // se genera getter
    public AsesorId getAsesorId() {
        return asesorId;
    }
}
