package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;

public class EliminarAdmin extends Command {
    private final ConcesionarioId concesionarioId;
    private final AdministradorId administradorId;

    public EliminarAdmin(ConcesionarioId concesionarioId, AdministradorId administradorId){
        this.concesionarioId = concesionarioId;
        this.administradorId = administradorId;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }
}
