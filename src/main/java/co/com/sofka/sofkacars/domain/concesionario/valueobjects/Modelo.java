package co.com.sofka.sofkacars.domain.concesionario.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Modelo implements ValueObject<Modelo.Properties> {

    private final Date modelo;

    //Constructor
    public Modelo(Date modelo) {
        if (modelo.getYear()<LocalDate.now().getYear())
        {
            this.modelo = modelo;
        }
        else {throw new RuntimeException("El modelo aún no está en el mercado");}

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

        return Objects.equals(modelo, modelo1.modelo);
    }

    @Override
    public int hashCode() {
        return modelo != null ? modelo.hashCode() : 0;
    }
}
