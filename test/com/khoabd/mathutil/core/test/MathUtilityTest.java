/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khoabd.mathutil.core.test;

import com.khoabd.mathuil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

//    kiem thu ngoai le thi sao
//    tuc lam ham getF dc thie ke neu dua n ca chon se throw ra ngoai le 
//    Thay ngoai le mung roi nc mat
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentShowException() {
//        test case 5 getF() with wrong arg: n = -5
//            expected result : An Exceptionn is thrown : Illegal Argument
        MathUtility.getFactorial(-5);
//      neu chi go lenh tren thi Bi mau do
//      do lenh nay gay ra exception vaf exception la mau do
//      Nhung ham nay minh ky vong ra exception, va exception la mau do
//      ta can them mot lenh co ngoai le chua
//        JUnit 4 khong dung ham assert() de do ngoai le
//        JUnit 5 thi dung ham assert() de do ngoai le
    }

    @Test
    //trông hàm này chứa các test case để test getF();
    //với n hợp lệ trong khoảng 0...20
    public void testFactorialGivenRightArgumentReturnWell() {
        //test case 1 test getF() with n = 0
        //Expected Value = 1; //hy vong = 1
        int n = 0;
        long expectedValue = 1;
        int actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);

        //test cas2 5! = 120  xem may co tinh dung nhu vay khong
        actualValue = MathUtility.getFactorial(5);
        Assert.assertEquals(120, actualValue);

        //test case 3
        actualValue = MathUtility.getFactorial(5);
        Assert.assertEquals(120, actualValue);

    }
}
