package co.com.sofka.sofkacars.domain.concesionario.ids;

import co.com.sofka.domain.generic.Identity;

public class CarroId extends Identity
{
    private CarroId (String value) // se pone privado ya que hereda de la clase Identity, la cual iría alojada en la BD
    {
        super(value);// se pone super ya que hereda de la clase identity
    }
    
    public CarroId(){
        
    }
    
    public static CarroId of(String value){ //constructor para crear el id del carro
        return new CarroId(value);
    }
    
    
}
