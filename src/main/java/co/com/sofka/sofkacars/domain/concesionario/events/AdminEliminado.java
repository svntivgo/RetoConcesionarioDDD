package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;

public class AdminEliminado extends DomainEvent
{
    private final AdministradorId administradorId;

    public AdminEliminado(AdministradorId administradorId){
        super("RetoConcesionarioDDD.AdminEliminado");
        this.administradorId = administradorId;

    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }
}
