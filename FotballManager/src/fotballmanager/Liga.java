/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotballmanager;

import java.util.ArrayList;

/**
 *
 * @author vegar
 */
public class Liga {
    private String navn;
    private ArrayList<Sesong> sesonger;
    private int sesongnr;
    private Database db;

    public Liga(String navn) {
        this.navn = navn;
        sesongnr = 1;
        this.sesonger = new ArrayList<>();
        db = new Database();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    public Sesong opprettSesong(){
        Sesong sesong = new Sesong(sesongnr, db);
        sesonger.add(sesong);
        return sesong;
    }
    
    public void plussSesongnr(){
        sesongnr++;
    }
    
    
}
