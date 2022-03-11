package co.com.sofka.sofkacars.domain.factura.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoActual implements ValueObject<EstadoActual.Value> {
    private final Value value;

    // constructor
    public EstadoActual(EstadoActual.Value value){
        this.value = value;
    }

    // crear el enum
    public enum Value{
        INICIADO,
        PAGADO,
        CANCELADO,
        INTERCAMBIO,
        SEPARADO
    }

    // implementacion del metodo value
    @Override
    public EstadoActual.Value value(){
        return  value;
    }

    // se implementa el equal y hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstadoActual)) return false;
        EstadoActual estadoActual = (EstadoActual) o;
        return value == estadoActual.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
