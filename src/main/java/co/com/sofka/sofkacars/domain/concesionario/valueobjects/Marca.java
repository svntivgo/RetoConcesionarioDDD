package co.com.sofka.sofkacars.domain.concesionario.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<Marca.Value> {

     private final Value value;

    //Constructor de Marca
    public Marca(Value value){
            this.value = value;
        }


    public enum Value{
            Mazda,
            Kia,
            BMW
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
            if (!(o instanceof Marca)) return false;
            Marca marca = (Marca) o;
            return value == marca.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
}
