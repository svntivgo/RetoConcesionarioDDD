package co.com.sofka.sofkacars.domain.taller.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LlavesInglesas implements ValueObject<LlavesInglesas.Properties> {
    private final Integer cantidad;

    // constructor
    public LlavesInglesas(Integer cantidad){
        this.cantidad = cantidad;
    }

    // interface
    public interface Properties{
        Integer cantidad();

    }

    // constructor del properties
    @Override
    public LlavesInglesas.Properties value() {
        return () -> cantidad;
    }

    // se implementa equals y hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LlavesInglesas)) return false;
        LlavesInglesas llavesInglesas = (LlavesInglesas) o;
        return cantidad.equals(llavesInglesas.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }
}
