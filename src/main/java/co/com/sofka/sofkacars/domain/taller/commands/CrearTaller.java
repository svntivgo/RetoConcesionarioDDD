package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;

public class CrearTaller extends Command
{
    private TallerId tallerId;
    private ConcesionarioId concesionarioId;

    public CrearTaller(TallerId tallerId,ConcesionarioId concesionarioId)
    {

        this.tallerId=tallerId;
        this.concesionarioId=concesionarioId;
    }


    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }
}
