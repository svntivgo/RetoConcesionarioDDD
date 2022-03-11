package co.com.sofka.sofkacars.domain.concesionario.ids;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity
{
    // constructores
    private AdministradorId(String value) {
        super(value);
    } //se pone este constructor en caso tal de que por ejemplo, se desee trabajar con
    // una bd no relacional, ya que los ids serían strings

    public AdministradorId(){}

    public static AdministradorId of(String value){
        return new AdministradorId(value);
    }
}
