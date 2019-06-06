/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

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
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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
     * Test of build method, of class PascalTriangle.
     */
    @Test
    public void PruebaNivelesMenorArreglo() {
        System.out.println("Prueba Niveles Menor Arreglo ");
        int levels = 5;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "Error: Prueba niveles";
        String result = instance.build(levels);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void PruebaNivelNUll() {
        System.out.println("Prueba NivelNull ");
        String levels = null;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "Error: Nivel null ";
        String result = instance.build(1);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void PruebaArreglos() {
        System.out.println("Prueba Arreglo Previo-Nuevo");
        int levels = 2;
        PascalTriangle instance = new PascalTriangle();
        long[] previousLevel = new long[]{3};
        long[] newLevel = new long[]{5};
        String expResult = "Error: Previo nivel supera secuencia por 2";
        String result = instance.build(levels);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void PruebaNivelNegativo() {
        System.out.println("Prueba Niveles  ");
        int levels = -1;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "Error: Prueba nivel negativo" ;
        String result = instance.build(levels);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void PruebaNivelLetra() {
        System.out.println("Prueba: Tipo de dato nIvel ");
        String levels = "A";
        PascalTriangle instance = new PascalTriangle();
        boolean expectedResult = true;
        String actualResult = instance.build(levels);
        assertEquals(actualResult, expectedResult);
        
    }
    
}
