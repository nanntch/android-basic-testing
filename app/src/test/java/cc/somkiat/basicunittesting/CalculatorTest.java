package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    //1 testcase = 1 story (จบในตัวเอง)
    // x = เรากำลังทดสอบอะไรและต้องการผลลัพธ์อะไรเป็น "ชื่อ testcase" บอกเฉพาะเจาะจงไปเลยว่าทำอะไร
    @Test
    public void สองบวกสองต้องได้ผลลัพธ์เท่ากับสี่(){
        //Arrange = สิ่งแวดล้อมว่าเราจะใส่อะไรบ้าง
        Calculator calculator = new Calculator();
        //Act = การกระทำ
        int result = calculator.plus(2, 2);
        //Assert = compair (สำคัญสุด)
        assertEquals(4, result);
    }


    @Test
    public void เจ็ดบอกสองต้องได้ผลลัพธ์เท่ากับเก้า(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(7, 2);
        assertEquals(9, result);
    }


}
