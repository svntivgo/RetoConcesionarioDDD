package co.com.sofka.sofkacars.domain.taller.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Mantenimiento implements ValueObject<Mantenimiento.Value>
{
    private final Value value;

    //construc
    public Mantenimiento(Value value){
        this.value = value;
    }



    // crear el enum
    public enum Value{
         CambiarAceite,
        CambiarLlantas,
        MantenimientoGeneral

    }

    // implementacion del metodo value
    @Override
    public Value value(){
        return  value;
    }

    // se implementa el equal y hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mantenimiento)) return false;
        Mantenimiento mantenimiento = (Mantenimiento) o;
        return value == mantenimiento.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
