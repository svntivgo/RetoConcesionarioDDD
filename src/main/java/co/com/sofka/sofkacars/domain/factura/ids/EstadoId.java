package co.com.sofka.sofkacars.domain.factura.ids;

import co.com.sofka.domain.generic.Identity;

public class EstadoId extends Identity {

    // constructores
    private EstadoId(String value) {
        super(value);
    }

    public EstadoId(){}

    public static EstadoId of(String value){
        return new EstadoId(value);
    }
}
