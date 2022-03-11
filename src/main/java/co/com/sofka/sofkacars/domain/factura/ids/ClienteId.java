package co.com.sofka.sofkacars.domain.factura.ids;

import co.com.sofka.domain.generic.Identity;

public class ClienteId extends Identity {

    // constructores
    private ClienteId(String value) {
        super(value);
    }

    public ClienteId(){}

    public static ClienteId of(String value){
        return new ClienteId(value);
    }
}
