/*
 * The business logic of the temperature converter.
 */
package conversiontool;

/**
 * Methods for converting between temperature scales.
 * @author Robert Impey
 */
public class TemperatureConverter {
    /**
     * Convert temperatures in Fahrenheit to Celsius.
     * @param fahr The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     * @throws IllegalArgumentException when the temperature is less than absolute zero.
     */
    public static double fahrToCel(double fahr) throws IllegalArgumentException {
        if (fahr < -459.67) {
            throw new IllegalArgumentException();
        }

        double cel = ((fahr - 32) / 9) * 5;
        return cel;
    }
    
    /**
     * Convert temperatures in Celsius to Fahrenheit.
     * @param cel The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     * @throws IllegalArgumentException when the temperature is less than absolute zero.
     */
    public static double celToFahr(double cel) throws IllegalArgumentException {
        if (cel < -273.15) {
            throw new IllegalArgumentException();
        }

        double fahr = ((cel / 5) * 9) + 32;
        return fahr;
    }
}
