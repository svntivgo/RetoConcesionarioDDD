package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AsesorAniadido;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Test;

class AniadirAsesorUseCaseTest {
    @Test
    void crearConcesionario () {
        //arrange
        AsesorId asesorId = AsesorId.of("Este es un id");
        Nombre nombre = new Nombre("Jaa", "Alimaña");
        Identificacion identificacion = new Identificacion(123456L);
        Telefono telefono = new Telefono("3114567822");
        var command = new AniadirAsesor(asesorId, nombre, identificacion, telefono);
        var usecase = new AniadirAsesorUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command));
//                .orElseThrow()
//                .getDomainEvents();
//
//        //assert
//        var event = (AsesorAniadido)events.get(0);
//        System.out.println(event);
    }

}