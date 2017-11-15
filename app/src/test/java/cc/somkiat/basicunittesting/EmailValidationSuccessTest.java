package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class EmailValidationSuccessTest {
    @Test
    public void EmailIsAllow(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isPatternAllow("Nacha@gmail.com");
        assertTrue("ต้องผ่านนะเพราะถูกต้องตาม Pattern email", result);
        assertEquals("Email validation is success", emailValidation.validate("Nacha@gmail.com"));
    }
}
