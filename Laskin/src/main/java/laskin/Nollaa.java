
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa implements Komento {
    
    private TextField tuloskentta, syotekentta;
    private Button nollaa, undo;
    private Sovelluslogiikka sov;
    private int edellinen;

    public Nollaa(TextField tuloskentta, TextField syotekentta,  Button nollaa, Button undo, Sovelluslogiikka sov) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;  
        this.nollaa = nollaa;
        this.undo = undo;
        this.sov = sov;
    }

    @Override
    public void suorita() {
        this.edellinen = sov.tulos();
        sov.nollaa();
        this.tuloskentta.setText("" + sov.tulos());
    }
    
    @Override
    public void peru() {
        this.tuloskentta.setText("" + this.edellinen);
        sov.plus(this.edellinen);
    }
    
}
