package co.com.sofka.sofkacars.domain.concesionario.valueobjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<Email.Properties> {

    // declaración de variables
    private final String email;

    // constructor
    public Email(String email) {

        if (!email.matches("^(.+)@(.+)$")) {
            throw new RuntimeException("El email no es válido");
        }

        this.email = email;
    }


    // interface
    public interface Properties {
        String email();

    }

    // constructor del properties
    @Override
    public Email.Properties value() {
        return () -> email;
    }

    // se implementa equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email that = (Email) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
