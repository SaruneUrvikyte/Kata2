package kata2;

import java.util.Map;

/**
 * @author Sarune Urvikyte
 */

public class Kata2 {
    
    private final static String[] data = {"Laura", "Sara", "Monika", "Laura", "Monika", "Laura"};

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        histogr.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        });
    }  
}
