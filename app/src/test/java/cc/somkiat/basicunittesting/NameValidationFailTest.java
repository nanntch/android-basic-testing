package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class NameValidationFailTest {

    @Test
    public void NameIsEmpty()throws IllegalArgumentException{
        NameValidation validation = new NameValidation();
        String name = "";
        boolean result = validation.isEmptyAndNull(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าว่าง!", result);
        assertEquals("Name is Empty or Null", validation.validate(name));
    }

    @Test
    public void NameIsNull(){
        NameValidation validation = new NameValidation();
        String name = null;
        boolean result = validation.isEmptyAndNull(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันเป็นค่า null!", result);
        assertEquals("Name is Empty or Null", validation.validate(name));
    }

    @Test
    public void NameHaveSpecialChars(){
        NameValidation validation = new NameValidation();
        String name = ">Nacha<";
        boolean result = validation.isNormal(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีอักษรพิเศษ!", result);
        assertEquals("Name is not normal", validation.validate(name));
    }

    @Test
    public void NameHaveNumeric(){
        NameValidation validation = new NameValidation();
        String name = "Nacha1";
        boolean result = validation.isNormal(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีตัวเลข!", result);
        assertEquals("Name is not normal", validation.validate(name));
    }

    @Test
    public void NameIsTooshort(){
        NameValidation validation = new NameValidation();
        String name = "n";
        boolean result = validation.isWrongLength(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่าชื่อสั้นเกินไป!", result);
        assertEquals("Name is wrong length", validation.validate(name));
    }

    @Test
    public void NameIsTooLong(){
        NameValidation validation = new NameValidation();
        String name = "abcdefghijklmnopqrstaaa";
        boolean result = validation.isWrongLength(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อยาวกว่า 20 ตัวอักษร", result);
        assertEquals("Name is wrong length", validation.validate(name));
    }

    @Test
    public void NameIsNotNormal(){
        NameValidation validation = new NameValidation();
        String name = "!@5Nacha";
        boolean result = validation.isNormal(name);
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อไม่ปกติ", result);
        assertEquals("Name is not normal", validation.validate(name));
    }
}
