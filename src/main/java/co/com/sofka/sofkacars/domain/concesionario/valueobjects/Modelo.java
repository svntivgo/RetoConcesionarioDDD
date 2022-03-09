package co.com.sofka.sofkacars.domain.concesionario.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Modelo implements ValueObject<Modelo.Properties> {

    private final Date modelo;

    //Constructor
    public Modelo(Date modelo) {
        this.modelo = modelo;
    }

    //Interface
    public interface Properties{
        Date modelo();
    }

    // constructor del properties
    @Override
    public Properties value() {
        return () -> modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Modelo modelo1 = (Modelo) o;

        return modelo != null ? modelo.equals(modelo1.modelo) : modelo1.modelo == null;
    }

    @Override
    public int hashCode() {
        return modelo != null ? modelo.hashCode() : 0;
    }
}
