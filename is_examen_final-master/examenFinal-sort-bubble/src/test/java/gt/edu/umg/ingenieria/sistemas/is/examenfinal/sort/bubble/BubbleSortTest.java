/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mariajose
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sortBasic method, of class BubbleSort.
     */
    @Test
    public void PruebaBurbu1() {
        System.out.println("Prueba Burbuja1");
        int[] numbers = null;
        int[] expectedResult = null;
        int[] actualResult = BubbleSort.sortBasic(numbers);
        assertTrue( actualResult == expectedResult);
    }
    
    @Test
    public void PruebaBurbu2() {
        System.out.println("Prueba: Burbuja2");
        int[] numbers = new int[]{0};
        int[] expectedResult = new int[]{1};
        int[] actualResult = BubbleSort.sortBasic(numbers);
        assertArrayEquals( expectedResult, actualResult);
    }
    
    @Test
    public void PruebaBurbu3() {
        int[] numbers = new int[]{};
        int[] expectedResult = new int []{};
        int[] actualResult = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void PruebaBurbu4() {
        System.out.println("Prueba: Burbuja3");
        int[] numbers = new int[]{1,3,5,8};
        int[] expectedResult = new int[]{0,0,0,0};
        int[] actualResult = BubbleSort.sortBasic(numbers);
        assertArrayEquals( expectedResult, actualResult);
    }
    
    @Test
    public void PruebaBurbu5() {
        System.out.println("Prueba: Burbuja5");
        int[] numbers = new int[]{0};
        int[] expectedResult = new int[]{0};
        int[] actualResult = BubbleSort.sortBasic(numbers);
        assertArrayEquals( expectedResult, actualResult);
    }
    
    
    
}
