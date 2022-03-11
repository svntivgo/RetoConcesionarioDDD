package co.com.sofka.sofkacars.domain.taller.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Gatos implements ValueObject<Gatos.Properties>
{

    private final Integer cantidad;

    // constructor
    public Gatos(Integer cantidad){
        this.cantidad = cantidad;
    }

    // interface
    public interface Properties{
        Integer cantidad();

    }

    // constructor del properties
    @Override
    public Gatos.Properties value() {
        return () -> cantidad;
    }

    // se implementa equals y hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gatos)) return false;
        Gatos gatos = (Gatos) o;
        return Objects.equals(cantidad, gatos.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad);
    }
}
