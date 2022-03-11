package co.com.sofka.sofkacars.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Precio.Properties> {
      // declaración de variables
        private final Double precio;

        // constructor
        public Precio(Double precio)
        {
            if (precio <=0 )
            {
                throw  new RuntimeException("El precio debe de ser mayor a 0");
            }
            this.precio = precio;

        }

        // interface
        public interface Properties{
            Double precio();

        }

        // constructor del properties
        @Override
        public Properties value() {
            return () -> precio;
        }

        // se implementa el equal y hashCode

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Precio)) return false;
            Precio precio1 = (Precio) o;
            return precio.equals(precio1.precio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(precio);
        }
}
