package co.com.sofka.sofkacars.domain.concesionario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.CarroId;

public class CarroEliminado extends DomainEvent {
    private final CarroId carroId;

    public CarroEliminado(CarroId carroId) {
        super("RetoConcesionarioDDD.CarroEliminado");
        this.carroId = carroId;
    }

    public CarroId getCarroId() {
        return carroId;
    }
}
