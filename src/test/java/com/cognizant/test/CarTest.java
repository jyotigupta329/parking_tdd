package com.cognizant.test;

import com.cognizant.model.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {


    Car car;

    @Before
    public void setup(){
        car = new Car();
        car.setLicenceNumber("12LK45");
        car.setHasMonthlyPass(true);
    }

    @Test
    public void carTest(){
        //setup and excute
      Car expected = new Car();
      expected.setLicenceNumber("12LK45");
      expected.setHasMonthlyPass(true);


        //assert
        assertEquals(expected, car);
    }
}
