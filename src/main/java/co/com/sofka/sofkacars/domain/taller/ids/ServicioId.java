package co.com.sofka.sofkacars.domain.taller.ids;

import co.com.sofka.domain.generic.Identity;

public class ServicioId  extends Identity
{
    // constructores
    private ServicioId(String value) { //se pone este constructor en caso tal de que por ejemplo, se desee trabajar con
                                        // una bd no relacional, ya que los ids serían strings
        super(value);
    }

    public ServicioId(){}

    public static ServicioId of(String value){
        return new ServicioId(value);
    }
}
