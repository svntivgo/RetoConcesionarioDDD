package co.com.sofka.sofkacars.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identificacion implements ValueObject<Identificacion.Properties> {
     // declaración de variables
        private final Long identificacion;
    
        // constructor
        public Identificacion(Long identificacion)
        {
            this.identificacion = identificacion;
        }
    
        // interface
        public interface Properties{
            Long identificacion();
    
        }
    
        // constructor del properties
        @Override
        public Properties value() {
            return () -> identificacion;
        }
    
        // se implementa equals y hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Identificacion)) return false;
            Identificacion that = (Identificacion) o;
            return Objects.equals(identificacion, that.identificacion);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(identificacion);
        }
}
