package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirMecanico;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirServicio;
import co.com.sofka.sofkacars.domain.taller.events.MecanicoAniadido;
import co.com.sofka.sofkacars.domain.taller.events.ServicioAniadido;
import co.com.sofka.sofkacars.domain.taller.events.TallerCreado;
import co.com.sofka.sofkacars.domain.taller.ids.MecanicoId;
import co.com.sofka.sofkacars.domain.taller.ids.ServicioId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Mantenimiento;
import co.com.sofka.sofkacars.generics.Identificacion;
import co.com.sofka.sofkacars.generics.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class AniadirServicioUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void aniadirServicio () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        TallerId tallerId = TallerId.of("1");
        ServicioId servicioId = ServicioId.of("2");
        Mantenimiento mantenimiento = new Mantenimiento(Mantenimiento.Value.CambiarAceite);

        var command = new AniadirServicio(concesionarioId,tallerId,servicioId,mantenimiento);
        var usecase = new AniadirServicioUseCase();

        Mockito.when(repository.getEventsBy(tallerId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(ServicioAniadido)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.ServicioAniadido",event.type);
        Assertions.assertEquals(servicioId,event.getServicioId());
        Assertions.assertEquals(mantenimiento,event.getMantenimiento());




    }

    public List<DomainEvent> historial() {

        return List.of(
                new TallerCreado(TallerId.of("1"), ConcesionarioId.of("1"))
        );
    }

}