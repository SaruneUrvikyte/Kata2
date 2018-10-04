package kata2;

import java.util.Map;

/**
 * @author Sarune Urvikyte
 */

public class Kata2 {
    
    private final static int[] data = {1, 2, 100, 45, 32, 7, 0, 100, 32, 1, 100, 32, 7, 100, 7, 9, 13, 100, 26, 86};

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        histogr.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        });
    }  
}
