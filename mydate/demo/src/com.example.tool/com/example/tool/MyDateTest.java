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
        ///System.out.println(MyDate.isLeapYear(5555));
    }

    @Test
    void isValidDate () {
        Assertions.assertTrue(MyDate.isValidDate(1999, 2, 27), "");
        Assertions.assertTrue(MyDate.isValidDate(2022, 4, 28), "");
        Assertions.assertTrue(MyDate.isValidDate(1980, 12, 28), "");
        Assertions.assertFalse(MyDate.isValidDate(10000, 2, 31), "");
        Assertions.assertFalse(MyDate.isValidDate(1999, 3, 32), "");
    }
    @Test
    void getDayOfWeek (){
        Assertions.assertEquals(4,MyDate.getDayOfWeek(2012,1,3));
        Assertions.assertEquals(2,MyDate.getDayOfWeek(2012, 4, 28));
        Assertions.assertEquals(2,MyDate.getDayOfWeek(2020, 10, 10));

    }

    @Test 
    void testToString(){
        MyDate datechar = new MyDate (2021, 12, 30);
        Assertions.assertEquals("Monday 30 Dec 2021", datechar.toString());
    }
   
    @Test
    void nextDay(){
        MyDate date1 = new MyDate(2000, 12 , 28);
        date1.nextDay();
        Assertions.assertEquals(29, date1.getDay());
        Assertions.assertEquals(12, date1.getMonth());
        Assertions.assertEquals(2000, date1.getYear());

        MyDate date2 = new MyDate(2022,1, 9);
        date2.nextDay();
        Assertions.assertEquals(10, date2.getDay());
        Assertions.assertEquals(1, date2.getMonth());
        Assertions.assertEquals(2022, date2.getYear());
    }
    
    @Test
    void nextMonth(){
        MyDate month = new MyDate(2000, 11 , 29);
        month.nextMonth();
        Assertions.assertEquals(29, month.getDay());
        Assertions.assertEquals(12, month.getMonth());
        Assertions.assertEquals(2000, month.getYear());
    }

    @Test
    void nextYear(){
        MyDate year = new MyDate(2000, 12 , 29);
        year.nextYear();
        Assertions.assertEquals(29, year.getDay());
        Assertions.assertEquals(12, year.getMonth());
        Assertions.assertEquals(2001, year.getYear());
    }

    @Test
      void previousDay(){
          MyDate preDay = new MyDate(2000, 12, 28);
          Assertions.assertEquals(12, preDay.getMonth());
          Assertions.assertEquals(2000, preDay.getYear());
          Assertions.assertEquals(27, preDay.getDay());

          /*MyDate prevDay2 = new MyDate(1999, 10, 2);
          prevDay2.previousDay();
          prevDay2.setMonth(10);
          IllegalArgumentException prev = Assertions.assertThrowsExactly(IllegalArgumentException.class,()->{
             prevDay2.nextDay();
          });

          Assertions.assertEquals(prev.getMessage(), prev);*/
    }
    
    @Test
      void previousMonth(){
        MyDate premonth = new MyDate(2000, 12 , 28);
        premonth.previousMonth();
        Assertions.assertEquals(11, premonth.getMonth());
        Assertions.assertEquals(2000, premonth.getYear());
        Assertions.assertEquals(2000, premonth.getDay());


        
    }

    @Test
    void previousYear(){
        MyDate preyear= new MyDate(2000, 12 , 28);
        Assertions.assertEquals(28, preyear.getDay());
        Assertions.assertEquals(12, preyear.getMonth());
        Assertions.assertEquals(1999, preyear.getYear());
       
  }

    @Test
    void setMonth(){
      MyDate month = new MyDate(2000, 12 , 12);
      month.setMonth(12);
      Assertions.assertEquals(month.getMonth(), 12);
      
  }

    @Test
    void setYear(){
        MyDate year = new MyDate(2010, 10 , 10);
        year.setYear(2010);
        Assertions.assertEquals(year.getYear(),2010 );
}
    @Test
        void setDay(){
        MyDate date = new MyDate(2010, 10, 10);
        date.setDate(2010, 10, 10);
        Assertions.assertEquals(date.getDay(), 10);
    }   
}




