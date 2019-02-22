package fotballmanager;

import java.util.Random;
/**
 *
 * @author Vegar
 */
public class RndGen {
    private Random rnd;
    
    public RndGen(){
        rnd = new Random();
    }
    
    /**
     * Returnerer et tall fra 0 - t
     * @return Tall fra 0 - t
     */
    public int getTall(int min, int max){
        int i = rnd.nextInt((max - min) + 1) + min;
                return i;
    }
}
