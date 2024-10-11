/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07021;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DevFast
 */
public class MainNGTest {
    
    public MainNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
