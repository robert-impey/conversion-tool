/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontool;

import org.junit.*;
import static org.junit.Assert.*;

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
        double fahr = 0.0;
        double expResult = 0.0;
        double result = TemperatureConverter.fahrToCel(fahr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
