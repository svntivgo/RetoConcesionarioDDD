package co.com.sofka.sofkacars.domain.concesionario.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.generics.Alicate;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;

public class CambiarAsesor extends Command {
    private final AsesorId asesorId;
    private final Nombre nombre;
    private final Alicate identificacion;
    private final Telefono telefono;

    //Constructor
    public CambiarAsesor(AsesorId asesorId, Nombre nombre, Alicate identificacion, Telefono telefono) {
        this.asesorId = asesorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }


    //Métodos get


    public AsesorId getAsesorId() {
        return asesorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Alicate getIdentificacion() {
        return identificacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
