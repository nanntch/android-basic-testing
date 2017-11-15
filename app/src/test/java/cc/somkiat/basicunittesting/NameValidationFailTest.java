package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void NameIsEmpty(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าว่าง!", result);
        assertEquals("Name is empty", validation.validate(""));
    }

    @Test
    public void NameIsNull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull(null);
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันเป็นค่า null!", result);
        assertEquals("Name is Null", validation.validate(null));
    }

    @Test
    public void NameHaveSpecialChars(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNormal(">Nacha<");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีอักษรพิเศษ!", result);
        assertEquals("Name is not normal", validation.validate(">Nacha<"));
    }

    @Test
    public void NameHaveNumeric(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNormal("Nacha1");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีตัวเลข!", result);
        assertEquals("Name is not normal", validation.validate("Nacha1"));
    }

    @Test
    public void NameIsTooshort(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isTooShort("a");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่าชื่อสั้นเกินไป!", result);
        assertEquals("Name is too short", validation.validate("a"));
    }

    @Test
    public void NameIsTooLong(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isTooLong("abcdefghijklmnopqrstaaa");
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อยาวกว่า 20 ตัวอักษร", result);
        assertEquals("Name is too long", validation.validate("abcdefghijklmnopqrstaaa"));
    }

    @Test
    public void NameIsNotNormal(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNormal("!@5Nacha");
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อไม่ปกติ", result);
        assertEquals("Name is not normal", validation.validate("!@5Nacha"));
    }
}
