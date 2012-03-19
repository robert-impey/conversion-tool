/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontool;

import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author robert
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fahrToCel method, of class TemperatureConverter.
     */
    @Test
    public void testFahrToCel() {
        System.out.println("fahrToCel");
        double fahr = 212;
        double expResult = 100;
        double result = TemperatureConverter.fahrToCel(fahr);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExtremeFahrToCel() {
        double fahr = -459.67;
        double expectedResult = -273.15;
        double result = TemperatureConverter.fahrToCel(fahr);
        assertEquals(expectedResult, result, 0.001);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testInvalidFahrToCel() {
        double fahr = -460;
        TemperatureConverter.fahrToCel(fahr);
    }
}
