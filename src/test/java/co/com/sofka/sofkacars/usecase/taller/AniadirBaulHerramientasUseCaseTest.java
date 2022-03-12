package co.com.sofka.sofkacars.usecase.taller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.sofkacars.domain.concesionario.ids.ConcesionarioId;
import co.com.sofka.sofkacars.domain.taller.commands.AniadirBaulHerramientas;
import co.com.sofka.sofkacars.domain.taller.events.BaulHerramientasAniadido;
import co.com.sofka.sofkacars.domain.taller.events.TallerCreado;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Alicates;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Gatos;
import co.com.sofka.sofkacars.domain.taller.valueobjects.LlavesInglesas;
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
class AniadirBaulHerramientasUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void aniadirBaulHerramientas () {
        //arrange
        ConcesionarioId concesionarioId = ConcesionarioId.of("1");
        TallerId tallerId = TallerId.of("1");
        BaulHerramientasId baulHerramientasId = BaulHerramientasId.of("2");
        LlavesInglesas llavesInglesas = new LlavesInglesas(2);
        Gatos gatos = new Gatos(3);
        Alicates alicates = new Alicates(4);

        var command = new AniadirBaulHerramientas(concesionarioId,tallerId,baulHerramientasId,alicates, gatos, llavesInglesas);
        var usecase = new AniadirBaulHerramientasUseCase();

        Mockito.when(repository.getEventsBy(tallerId.value())).thenReturn(historial());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(BaulHerramientasAniadido)events.get(1);
        Assertions.assertEquals("RetoConcesionarioDDD.BaulHerramientasAniadido",event.type);
        Assertions.assertEquals(baulHerramientasId,event.getBaulHerramientasId());
        Assertions.assertEquals(llavesInglesas,event.getLlavesInglesas());
        Assertions.assertEquals(gatos,event.getGatos());
        Assertions.assertEquals(alicates,event.getAlicates());



    }

    public List<DomainEvent> historial() {

        return List.of(
                new TallerCreado(TallerId.of("1"), ConcesionarioId.of("1"))
        );
    }

}