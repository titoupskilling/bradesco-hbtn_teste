import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    private static Person pessoa;

    @BeforeAll
    public static void setup() {
        pessoa = new Person();
    }
    
    @Test
    public void check_user_valid(){
        assertTrue(true);
        assertEquals(true, Person.checkPassword());
    }
    
    //@ParameterizedTest
    //@ValueSource(strings = { "PT1H", "PT2H" })
    @Test
    public void check_user_not_valid(){
        assertFalse(Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_letters(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_numbers(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_eight_chars(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void check_password_valid(){
        assertEquals(true, Person.checkPassword());
        assertEquals(true, Person.checkPassword());
    }
    
    
    @Test
    public void check_user_valid_2(){
        assertTrue(true);
        assertEquals(true, Person.checkPassword());
    }
    
    //@ParameterizedTest
    //@ValueSource(strings = { "PT1H", "PT2H" })
    @Test
    public void check_user_not_valid_2(){
        assertFalse(Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_letters_2(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_numbers_2(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void does_not_have_eight_chars_2(){
        assertEquals(false, Person.isMEI());
        assertEquals(true, Person.checkPassword());
    }
    
    @Test
    public void check_password_valid_2(){
        assertEquals(true, Person.checkPassword());
        assertEquals(true, Person.checkPassword());
    }
}
