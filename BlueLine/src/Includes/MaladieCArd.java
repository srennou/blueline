package Includes;
import java.util.Collection;

public class MaladieCArd {
    public PCard pCard;
    public Maladie maladie;

    public MaladieCArd(PCard pCard, Maladie maladie) {
        this.pCard = pCard;
        this.maladie = maladie;
    }

    public PCard getpCard() {
        return pCard;
    }

    public void setpCard(PCard pCard) {
        this.pCard = pCard;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }
}
