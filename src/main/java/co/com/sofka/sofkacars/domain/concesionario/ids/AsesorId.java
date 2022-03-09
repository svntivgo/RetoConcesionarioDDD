package co.com.sofka.sofkacars.domain.concesionario.ids;

import co.com.sofka.domain.generic.Identity;

public class AsesorId extends Identity
{

    private AsesorId(String value) {
        super(value);
    } // se pone privado ya que hereda de la clase Identity, la cual iría alojada en la BD

    public AsesorId(){}

    public static AsesorId of(String value){ //constructor para crear el id del carro
        return new AsesorId(value);
    }

}
