package ResistIC.Interfaces;

import ResistIC.Logica.TipoCenario;
import ResistIC.Personagens.Herois.Heroi;

public interface Fase {
    public void iniciar(Heroi heroi);

    public boolean isConcluida();

    public TipoCenario getTipoDeCenario();
}