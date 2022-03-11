package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

public class AniadirAsesor extends Command {
    private final ConcesionarioId concesionarioId;
    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Telefono telefono;

    public AniadirAsesor(ConcesionarioId concesionarioId, AsesorId asesorId, Nombre nombre, Identificacion identificacion, Telefono telefono) {
        this.concesionarioId = concesionarioId;
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public ConcesionarioId getConcesionarioId() {
        return concesionarioId;
    }

    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
