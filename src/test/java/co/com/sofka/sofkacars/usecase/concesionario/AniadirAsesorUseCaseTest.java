package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AsesorAniadido;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.concesionario.valueobjects.Email;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AniadirAsesorUseCaseTest {
    @Test
    void crearConcesionario () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        AsesorId asesorId = AsesorId.of("1");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);
        Telefono telefono = new Telefono("3114567820");

        var command = new AniadirAsesor(concesionarioId,asesorId,nombre, identificacion, telefono);
        var usecase = new AniadirAsesorUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(AsesorAniadido)events.get(0);
        Assertions.assertEquals("RetoConcesionarioDDD.AsesorAniadido",event.type);
        Assertions.assertEquals("1",event.getAsesorId().value());
    }

}
