package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.CrearConcesionario;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.commands.CrearTaller;
import co.com.sofka.sofkacars.domain.taller.events.TallerCreado;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.usecase.concesionario.CrearConcesionarioUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrearTallerUseCaseTest {

    @Test
    void crearTaller () {
        //arrange
        TallerId tallerId = TallerId.of("3");
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        var command = new CrearTaller(tallerId, concesionarioId);
        var usecase = new CrearTallerUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event=(TallerCreado)events.get(0);
        Assertions.assertEquals("RetoConcesionarioDDD.TallerCreado",event.type);
        Assertions.assertEquals("1",event.getConcesionarioId().value());
        Assertions.assertEquals("3",event.getTallerId().value());


    }

}