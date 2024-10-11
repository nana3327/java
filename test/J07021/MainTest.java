/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07021;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DevFast
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chuanHoa method, of class Main.
     */
    @Test
    public void testChuanHoa() {
        System.out.println("chuanHoa");
        String s = "";
        String expResult = "";
        String result = Main.chuanHoa(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kyTuHoa method, of class Main.
     */
    @Test
    public void testKyTuHoa() {
        System.out.println("kyTuHoa");
        char c = ' ';
        char expResult = ' ';
        char result = Main.kyTuHoa(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kyTuThuong method, of class Main.
     */
    @Test
    public void testKyTuThuong() {
        System.out.println("kyTuThuong");
        char c = ' ';
        char expResult = ' ';
        char result = Main.kyTuThuong(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
