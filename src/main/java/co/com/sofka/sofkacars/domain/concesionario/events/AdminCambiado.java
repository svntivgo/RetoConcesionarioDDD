package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Alicate;
import co.com.sofka.sofkacars.generics.Nombre;

public class AdminCambiado extends DomainEvent
{

    private final AdministradorId administradorId;
    private final Nombre nombre;
    private final Alicate identificacion;
    private final Email email;

    public AdminCambiado(AdministradorId administradorId, Nombre nombre, Alicate identificacion, Email email) {
        super("RetConcesionarioDDD.AdminCambiado");
        this.administradorId = administradorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Alicate getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }
}
