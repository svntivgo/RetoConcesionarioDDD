package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Alicates;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Gatos;
import co.com.sofka.sofkacars.domain.taller.valueobjects.LlavesInglesas;

public class AniadirBaulHerramientas extends Command {
    private final BaulHerramientasId baulHerramientasId;
    private final Alicates alicates;
    private final Gatos gatos;
    private final LlavesInglesas llavesInglesas;

    public AniadirBaulHerramientas( BaulHerramientasId baulHerramientasId, Alicates alicates, Gatos gatos, LlavesInglesas llavesInglesas) {
        this.baulHerramientasId = baulHerramientasId;
        this.alicates = alicates;
        this.gatos = gatos;
        this.llavesInglesas = llavesInglesas;
    }

    public BaulHerramientasId getBaulHerramientasId() {
        return baulHerramientasId;
    }

    public Alicates getAlicates() {
        return alicates;
    }

    public Gatos getGatos() {
        return gatos;
    }

    public LlavesInglesas getLlavesInglesas() {
        return llavesInglesas;
    }
}
