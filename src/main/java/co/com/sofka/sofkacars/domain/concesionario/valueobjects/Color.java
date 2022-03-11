package co.com.sofka.sofkacars.domain.concesionario.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<Color.Value>
{
    private final Value value;

        //construc
        public Color(Value value){
                this.value = Objects.requireNonNull(value);//verificar
        }

            // crear el enum
            public enum Value{
                NegroVALUE,
                AzulVALUE,
                BlancoVALUE,

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
                if (!(o instanceof Color)) return false;
                Color color = (Color) o;
                return value == color.value;
            }

            @Override
            public int hashCode() {
                return Objects.hash(value);
            }
}
