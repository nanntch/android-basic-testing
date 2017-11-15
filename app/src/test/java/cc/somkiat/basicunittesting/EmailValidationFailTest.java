package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class EmailValidationFailTest {
    @Test
    public void EmailIsEmpty() {
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะเพราะ email เป้นค่าว่าง", result);
        assertEquals("Email is empty", emailValidation.validate(""));
    }

    @Test
    public void EmailIsNull(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isNull(null);
        assertFalse("ต้องไม่ผ่านนะ เพราะ email เป็นค่า null", result);
        assertEquals("Email is null", emailValidation.validate(null));
    }

    @Test
    public void EmailNotAllow(){
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.isPatternAllow("me@me@gmail.com");
        //assertFalse("ต้องไม่ผ่านนะเพราะ ผิด email pattern", result);
        assertEquals("Email is not allow", emailValidation.validate("me@me@gmail.com"));
    }
}
