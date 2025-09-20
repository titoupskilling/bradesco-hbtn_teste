import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;

public class PersonTest {

    Person pessoa;

    @BeforeAll
    void setup() {
        pessoa = new Person();
    }
    
    @Test
    public void check_user_valid(){
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }
    
    @Test
    public void check_user_not_valid(){
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }
    
    @Test
    public void does_not_have_letters(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
    
    @Test
    public void does_not_have_numbers(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
    
    @Test
    public void does_not_have_eight_chars(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
    
    @Test
    public void check_password_valid(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
}
