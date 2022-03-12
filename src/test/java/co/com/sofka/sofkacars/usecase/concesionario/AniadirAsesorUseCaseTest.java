package co.com.sofka.sofkacars.usecase.concesionario;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.Concesionario;
import co.com.sofka.sofkacars.domain.concesionario.commands.AniadirAsesor;
import co.com.sofka.sofkacars.domain.concesionario.events.AsesorAniadido;
import co.com.sofka.sofkacars.domain.concesionario.events.ConcesionarioCreado;
import co.com.sofka.sofkacars.domain.concesionario.ids.AsesorId;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import co.com.sofka.sofkacars.generics.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AniadirAsesorUseCaseTest {

    Nombre nombre = new Nombre("Jaa", "Alimaña");
    Identificacion identificacion = new Identificacion(123456L);
    Telefono telefono = new Telefono("3114567820");

    @Mock
    private DomainEventRepository repository;

    @Test
    void crearConcesionario () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        AsesorId asesorId = AsesorId.of("2");
//        Nombre nombre = new Nombre("Jaa", "Alimaña");
//        Identificacion identificacion = new Identificacion(123456L);
//        Telefono telefono = new Telefono("3114567820");

        var command = new AniadirAsesor(concesionarioId,asesorId,nombre, identificacion, telefono);
        var usecase = new AniadirAsesorUseCase();



        Mockito.when(repository.getEventsBy("1")).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(AsesorAniadido)events.get(0);
        Assertions.assertEquals("RetoConcesionarioDDD.AsesorAniadido",event.type);
        Assertions.assertEquals("2",event.getAsesorId().value());


    }

    public List<DomainEvent> historial() {

        return List.of(
                new ConcesionarioCreado(ConcesionarioId.of("1")),
                new AsesorAniadido(AsesorId.of("2"), nombre, identificacion, telefono)
        );
    }

}
