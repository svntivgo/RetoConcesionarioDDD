package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;

public class EliminarAdmin extends Command {
    private final AdministradorId administradorId;

    public EliminarAdmin(AdministradorId administradorId){
        this.administradorId = administradorId;
    }
}
