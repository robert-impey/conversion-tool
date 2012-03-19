/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontool;

/**
 *
 * @author robert
 */
public class ConversionTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length <= 2) {
            System.err.println("Please tell me what to do and give me some numbers to convert!");
        } else {
            String conversion = args[0];
            
            if ("FahrToCel".equals(conversion)) {
                for (int i = 1; i < args.length; i++) {
                    double fahr = Double.parseDouble(args[i]);
                    double cel = TemperatureConverter.fahrToCel(fahr);
                    
                    System.out.printf("%f F is %f C\n", fahr, cel);
                }
            } else {
                System.err.println("Unrecognised conversion!");
            }
        }
    }
}
