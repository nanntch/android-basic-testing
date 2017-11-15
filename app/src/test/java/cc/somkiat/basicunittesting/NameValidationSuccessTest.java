package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Nacha on 15-Nov-17.
 */

public class NameValidationSuccessTest {
    @Test
    public void NameIsNormal(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isNormal("Nacha");
        assertTrue("ต้องผ่านนะเพราะชื่อเป็นปกติแล้ว", result);
        assertEquals("Name is normal", validation.validate("Nacha"));
    }
}
