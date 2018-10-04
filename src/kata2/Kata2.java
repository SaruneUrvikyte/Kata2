package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sarune Urvikyte
 */
public class Kata2 {

    private static Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
    private static int[] data = {1, 2, 100, 45, 32, 7, 0, 100, 32, 1, 100, 32, 7, 100, 7, 9, 13, 100, 26, 86};
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        for (int i = 0; i < data.length; i++) {
                if(histogram.containsKey(data[i])){
                    histogram.put(data[i], histogram.get(data[i])+1);
                }else{
                    histogram.put(data[i], 1);
                }
        }
        
        histogram.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }); 
    }  
}
