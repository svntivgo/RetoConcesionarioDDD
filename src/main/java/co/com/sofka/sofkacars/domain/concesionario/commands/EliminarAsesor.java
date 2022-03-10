package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;

public class EliminarAsesor extends Command {
    private final AsesorId asesorId;

    public EliminarAsesor(AsesorId asesorId){
        this.asesorId = asesorId;
    }

    // se genera getter
    public AsesorId getAsesorId() {
        return asesorId;
    }
}
