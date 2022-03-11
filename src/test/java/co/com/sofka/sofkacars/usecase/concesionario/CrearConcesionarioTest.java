package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import org.junit.jupiter.api.Test;

class CrearConcesionarioTest {

    @Test
    void crearConcesionario () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("Este es un id");
        var command = new CrearConcesionario(concesionarioId);
        var usecase = new CrearConcesionarioUseCase();

        var events = UseCaseHandler.getInstance()
                        .syncExecutor(usecase,new RequestCommand<>(command))
                        .orElseThrow()
                        .getDomainEvents();



    }

}