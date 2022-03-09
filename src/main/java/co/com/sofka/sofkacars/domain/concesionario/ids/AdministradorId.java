package co.com.sofka.sofkacars.domain.concesionario.ids;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity
{
    // constructores
    private AdministradorId(String value) {
        super(value);
    }

    public AdministradorId(){}

    public static AdministradorId of(String value){
        return new AdministradorId(value);
    }
}
