/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontool;

/**
 *
 * @author robert
 */
public class TemperatureConverter {
    
    public static double fahrToCel(double fahr) {
        if (fahr < -459.67) {
            throw new IllegalArgumentException();
        }
        
        double cel = ((fahr - 32) / 9) * 5;
        return cel;
    }
}
