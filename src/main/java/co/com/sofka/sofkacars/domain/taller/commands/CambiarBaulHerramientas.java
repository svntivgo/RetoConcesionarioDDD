package co.com.sofka.sofkacars.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.sofkacars.domain.taller.ids.BaulHerramientasId;
import co.com.sofka.sofkacars.domain.taller.ids.TallerId;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Alicates;
import co.com.sofka.sofkacars.domain.taller.valueobjects.Gatos;
import co.com.sofka.sofkacars.domain.taller.valueobjects.LlavesInglesas;

public class CambiarBaulHerramientas extends Command {
    private final TallerId tallerId;
    private final BaulHerramientasId baulHerramientasId;
    private final Alicates alicates;
    private final Gatos gatos;
    private final LlavesInglesas llavesInglesas;

    public CambiarBaulHerramientas( TallerId tallerId,BaulHerramientasId baulHerramientasId, Alicates alicates, Gatos gatos, LlavesInglesas llavesInglesas) {
        this.tallerId = tallerId;
        this.baulHerramientasId = baulHerramientasId;
        this.alicates = alicates;
        this.gatos = gatos;
        this.llavesInglesas = llavesInglesas;
    }

    public TallerId getTallerId() {
        return tallerId;
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
