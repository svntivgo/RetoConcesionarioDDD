package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

public class EliminarAsesor extends Command {
    private final ConcesionarioId concesionarioId;
    private final AsesorId asesorId;

    public EliminarAsesor(ConcesionarioId concesionarioId, AsesorId asesorId){
        this.concesionarioId = concesionarioId;
        this.asesorId = asesorId;
    }


    // se genera getter


    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }
}
