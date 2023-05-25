import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class EmailTest {
    @Test
    public void naoDeveriaCriarEmailsComEnderecosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("EmailInvalido"));
    }

    public void deveSerPossivelCriarUmEmailValido(){
    }

}
