package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation validation = new NameValidation();
        //โยน input เข้าไป check
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าว่าง!", result);
        assertEquals("Name is empty", validation.validate(""));
    }

    @Test
    public void ชื่อเป็นค่าnull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull(null);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันเป็นค่า null!", result);
        assertEquals("Name is Null", validation.validate(null));
    }

    @Test
    public void ชื่อมีอักษรพิเศษ(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isSpecialChars("!@#$^&()");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีอักษรพิเศษ!", result);
        assertEquals("Name have Special chars", validation.validate("!@#$^&()"));
    }
    
}
