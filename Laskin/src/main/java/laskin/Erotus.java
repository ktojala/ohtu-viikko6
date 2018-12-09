
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus implements Komento {
    
    private TextField tuloskentta, syotekentta;
    private Button nollaa, undo;
    private Sovelluslogiikka sov;
    private int edellinen;

    public Erotus(TextField tuloskentta, TextField syotekentta,  Button nollaa, Button undo, Sovelluslogiikka sov) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;  
        this.nollaa = nollaa;
        this.undo = undo;
        this.sov = sov;
    }
    
    @Override
    public void suorita() {
        this.edellinen = sov.tulos();
        int luku = Integer.parseInt(syotekentta.getText());
        sov.miinus(luku);
        this.tuloskentta.setText("" + sov.tulos());
    }
    
    @Override
    public void peru() {
        this.edellinen = sov.tulos();
        int luku = Integer.parseInt(syotekentta.getText());
        sov.plus(luku);
        this.tuloskentta.setText("" + sov.tulos());
    }
    
}
    