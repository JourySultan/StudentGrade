/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package studentgrade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    
    
    /**
    الكود التالي يجري عملية اختبار لعلامة الطالب 
    * الاختبارات ستكون على مجموعة من العلامات مع النتيجة الموافقة كما في الكود الأصلي
     **/
       @Test
        public void test100Pass() {
            //اختبار العلامة 100
        System.out.println("getGrade 100");
        int mark = 100;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        @Test
        public void test100Fail() {
            //اختبار العلامة 100
        System.out.println("getGrade 100");
        int mark = 100;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        @Test
        public void test95Pass() {
            //اختبار العلامة 95
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      
        @Test
        public void test95Fail() {
            //اختبار العلامة 95
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        @Test
        public void test85Pass() {
            //اختبار العلامة 85
        System.out.println("getGrade 85");
        int mark = 95;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      
        @Test
        public void test85Fail() {
            //اختبار العلامة 85
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        @Test
        public void test75Pass() {
            //اختبار العلامة 75
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      
        @Test
        public void test75Fail() {
            //اختبار العلامة 75
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        @Test
        public void test0Pass() {
            //اختبار العلامة 0
        System.out.println("getGrade 0");
        int mark = 0;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
      
        @Test
        public void test0Fail() {
            //اختبار العلامة 0
        System.out.println("getGrade 0");
        int mark = 0;
        String expResult = "C";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}

