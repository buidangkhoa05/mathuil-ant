/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.khoabd.mathutil.core.test;

import com.khoabd.mathuil.core.MathUtility;
import com.sun.org.apache.xpath.internal.operations.Variable;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    //chuan bi mang 2 chieu de chua data trong cac test case 
    //bao voi JUnit rang code  trong class nay se tach data va ham so sanh
    //tach thi phai co ky thuat nhoi data va fill data tro lai ham so sanh thong qua bien so
    //DDT la co anh em nuong tua voi  paramiterized
    // quy uoc mang phai la  static public 
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    //map tung cap data ở tren vào 2 biến , đảy 2 biến này vào 
    //hàm assertEquals() đã quen
    @Parameterized.Parameter(value = 0) //lay cot 0 cua mang gan vao
    public int n;
    @Parameterized.Parameter(value = 1) //lay cot 1 cua mang gan vao
    public long expected;
    
    //tes hoy
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
