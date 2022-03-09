package co.com.sofka.sofkacars.generics;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Telefono.Properties>{

 // declaración de variables
        private final String telefono;

        // constructor
        public Telefono(String telefono){
            this.telefono = telefono;
        }

        // interface
        public interface Properties{
            String telefono();

        }

        // constructor del properties
        @Override
        public Properties value() {
            return () -> telefono;
        }

        // se implementa equals y hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Telefono)) return false;
            Telefono that = (Telefono) o;
            return Objects.equals(telefono, that.telefono);
        }

        @Override
        public int hashCode() {
            return Objects.hash(telefono);
        }
}
