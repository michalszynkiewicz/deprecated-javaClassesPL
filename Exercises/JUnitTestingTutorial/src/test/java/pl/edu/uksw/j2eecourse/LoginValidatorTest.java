package pl.edu.uksw.j2eecourse;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginValidatorTest {
    

    @Test
    public void testLoginValid() {
        System.out.println("loginValid");
        LoginValidator instance = new LoginValidator();
        assertFalse("Allowed null", instance.loginValid(null));
        assertFalse("Allowed empty", instance.loginValid(""));
        assertTrue("Failed on simple", instance.loginValid("asdf"));
        assertTrue("Failed on digits", instance.loginValid("asdf123"));
        assertFalse("Alowed diacriics", instance.loginValid("aąśćsdf123"));
        assertFalse("Alowed too short", instance.loginValid("a3"));
        assertFalse("Alowed too long", instance.loginValid("aqazwsxedcrfvtgbyhb"));
        
        assertEquals("Zły login", "przyklad", testedClass.findLogin());
        
    }
    
}
