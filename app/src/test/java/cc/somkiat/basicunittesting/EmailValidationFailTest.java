package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class EmailValidationFailTest {

    @Test
    public void EmailIsEmpty() {
        EmailValidation emailValidation = new EmailValidation();
        String email = "";
        boolean result = emailValidation.isEmptyAndNull(email);
        assertFalse("ต้องไม่ผ่านนะเพราะ email เป้นค่าว่าง", result);
        assertEquals("Email is Empty or Null", emailValidation.validate(email));
    }

    @Test
    public void EmailIsNull(){
        EmailValidation emailValidation = new EmailValidation();
        String email = null;
        boolean result = emailValidation.isEmptyAndNull(email);
        assertFalse("ต้องไม่ผ่านนะ เพราะ email เป็นค่า null", result);
        assertEquals("Email is Empty or Null", emailValidation.validate(email));
    }

    @Test
    public void EmailNotAllow(){
        EmailValidation emailValidation = new EmailValidation();
        String email = "me@me@gmail.com";
        emailValidation.isPatternAllow(email);
        //assertFalse("ต้องไม่ผ่านนะเพราะ ผิด email pattern", result);
        assertEquals("Email is not allow", emailValidation.validate(email));
    }
}
