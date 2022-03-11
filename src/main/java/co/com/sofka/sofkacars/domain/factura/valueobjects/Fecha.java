package co.com.sofka.sofkacars.domain.factura.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Fecha implements ValueObject<Fecha.Properties> {

    // declaración de variables
    private final Date fecha;

    // constructor
    public Fecha(Date fecha){
        this.fecha = fecha;
    }

    // interface
    public interface Properties{
        Date fecha();
    }

    // constructor del properties
    @Override
    public Properties value() {
        return () -> fecha;
    }

    // se implementa el equals y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fecha fecha1 = (Fecha) o;

        return fecha != null ? fecha.equals(fecha1.fecha) : fecha1.fecha == null;
    }

    @Override
    public int hashCode() {
        return fecha != null ? fecha.hashCode() : 0;
    }
}
