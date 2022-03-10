package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

public class CrearConcesionario extends Command {
    private ConcesionarioId concesionarioId;

    public CrearConcesionario(ConcesionarioId concesionarioId)
    {
        this.concesionarioId=concesionarioId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }
}
