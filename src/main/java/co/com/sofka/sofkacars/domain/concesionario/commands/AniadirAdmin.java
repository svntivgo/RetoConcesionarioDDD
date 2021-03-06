package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AdministradorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;

public class AniadirAdmin extends Command {
    private final ConcesionarioId concesionarioId;
    private final AdministradorId administradorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;

    public AniadirAdmin(ConcesionarioId concesionarioId, AdministradorId administradorId, Nombre nombre, Identificacion identificacion, Email email) {
        this.concesionarioId = concesionarioId;
        this.administradorId = administradorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }
}
