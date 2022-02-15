package com.example.tool;
import org.junit.jupiter.api.*;

@DisplayName("com.example.tool/com.example.tool.MyDateTest")

class MyDateTest {
    //private final MyDateTest mydatetest = new MyDateTest();

    @Test
     void isLeapYear () {
        Assertions.assertFalse(MyDate.isLeapYear(1999));
        Assertions.assertTrue(MyDate.isLeapYear(2000));
        Assertions.assertTrue(MyDate.isLeapYear(2020));
        Assertions.assertFalse(MyDate.isLeapYear(1965));
       

    }
    @Test
    void isValidDate () {
        Assertions.assertTrue(MyDate.isValidDate(2, 2, 27), "");
        Assertions.assertTrue(MyDate.isValidDate(2, 4, 28), "");
        Assertions.assertTrue(MyDate.isValidDate(2, 12, 28), "");
        Assertions.assertFalse(MyDate.isValidDate(9999, 12, 31), "");
    }
    @Test
    void getDayOfWeek (){
        Assertions.assertEquals(MyDate.getDayOfWeek(2,1,2), 6);
        Assertions.assertEquals(MyDate.getDayOfWeek(2,4,28), 5);

        //Assertions.assertEquals(MyDate.setDate(0, 0, 0), "match");
    }
   

    @Test
    void nextDay(){
        Assertions.assertFalse(MyDate.isLeapYear(9999));

    }
    @Test
      void previousDay(){
        Assertions.assertEquals(MyDate.isLeapYear(1),false);
        
    }
    
    @Test
      void previousMonth(){
        Assertions.assertEquals(MyDate.isLeapYear(1),false);
        
    }

    /* @Test
    

    @Test
    int getYear(){
        Assertions.assertEquals(mydatetest.getYear(), "match");
        return 0;
    }
    @Test
    int getMonth(int y, int m, int d){
        Assertions.assertEquals(MyDate.isValidDate(y,m,s));
        
    }

    @Test
    int getDay(){
        Assertions.assertEquals(mydatetest.getDay(), "match");
        return 0;
    }*/

    
}




