package com.phikod.unittest;

import android.content.Context;
import android.provider.Settings;

import com.phikod.unittest.utils.CommonUtil;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Context mContext;

    @Before
    public void initialize() {
        System.out.println("initialize");
    }

    @Test
    public void addition_isCorrect() throws Exception {
        System.out.println("addition_isCorrect");
        CommonUtil util = new CommonUtil();
        int result = CommonUtil.addition(2, 2);

        assertEquals(4, result);
    }
    @Test
    public void multiply_isCorrect() throws Exception {
        System.out.println("multiply_isCorrect");
        CommonUtil util = new CommonUtil();
        int result = CommonUtil.multiply(2, 2);

        assertEquals(4, result);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        System.out.println("subtraction_isCorrect");
        CommonUtil util = new CommonUtil();
        int result = CommonUtil.subtraction(6, 2);

        assertEquals(4, result);
    }
}