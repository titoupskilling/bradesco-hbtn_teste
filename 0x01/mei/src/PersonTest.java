import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PersonTest {

    Person pessoa;

    @BeforeEach
    void setup() {
        pessoa = new Person();
    }
    
    @Test
    public void show_full_name(){
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }
    
    @Test
    public void test_calculateYearlySalary(){
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }
    
    @Test
    public void person_is_MEI(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
    
    @Test
    public void person_is_not_MEI(){
        assertEquals(false, Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
}
