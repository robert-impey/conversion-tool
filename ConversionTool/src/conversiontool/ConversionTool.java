/*
 * CLI Tool for Converting between Celsius and Fahrenheit.
 */
package conversiontool;

/**
 * The command line interface for the temperature conversion tool.
 * 
 * The first argument should be either "FahrToCel" or "CelToFahr".
 * 
 * Subsequent arguments should be floats for temperatures to be converted.
 * 
 * @author Robert Impey
 */
public class ConversionTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please tell me what to do and give me some numbers to convert!");
        } else {
            String conversion = args[0];
            switch (conversion) {
                case "FahrToCel":
                    for (int i = 1; i < args.length; i++) {
                        double fahr = Double.parseDouble(args[i]);
                        double cel = TemperatureConverter.fahrToCel(fahr);

                        System.out.printf("%f F is %f C\n", fahr, cel);
                    }
                    break;
                case "CelToFahr":
                    for (int i = 1; i < args.length; i++) {
                        double cel = Double.parseDouble(args[i]);
                        double fahr = TemperatureConverter.celToFahr(cel);

                        System.out.printf("%f C is %f F\n", cel, fahr);
                    }
                    break;
                default:
                    System.err.println("Unrecognised conversion!");
                    break;
            }
        }
    }
}
