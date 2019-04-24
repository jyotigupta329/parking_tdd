package com.cognizant.test;

import com.cognizant.model.Garage;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GarageTest {

    public static final double EXPECTED_TIME = 15.00;
    public static final boolean EXPECTED_HASPASS = true;
    Garage garage;

    @Before
    public void setup() {
        garage = new Garage();
        garage.setInTime(12.00);
        garage.setOutTime(3.00);
    }

    @Test
    public void calculateTimeTest(){
        double actual_time = garage.getCalculatedTime();

        //assert
        assertEquals(EXPECTED_TIME, actual_time);
    }

    @Test
    public void hasPassTest(){
        boolean actual_hasPass = garage.getMonthlyPass();

        assertEquals(EXPECTED_HASPASS, actual_hasPass);
    }


}
