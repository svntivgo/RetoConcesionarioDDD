package co.com.sofka.sofkacars.domain.taller.valueobjects;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.sofkacars.generics.Alicate;

import java.util.Objects;

public class Alicates implements ValueObject<Alicates.Properties>
{
    private final Integer cantidad;

    // constructor
    public Alicates(Integer cantidad){
        this.cantidad = cantidad;
    }

    // interface
    public interface Properties{
        Integer cantidad();

    }

    // constructor del properties
    @Override
    public Alicates.Properties value() {
        return () -> cantidad;
    }

    // se implementa equals y hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alicates)) return false;
        Alicates alicates = (Alicates) o;
        return Objects.equals(cantidad, alicates.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }
}
