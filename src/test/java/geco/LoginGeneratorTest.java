package geco;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator logGen;
    private LoginService logServ;


    @Before
    public void setUp() throws Exception {
        final String [] c = new String[2];
        c[0] = "PDUP";
        c[1] = "VHUG";
        logServ = new LoginService(c);
        logGen = new LoginGenerator(logServ);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom() {
        assertEquals("PDUP1",logGen.generateLoginForNomAndPrenom("Dupond", "Paul"));
        assertEquals("JDUR",logGen.generateLoginForNomAndPrenom("Durand", "Jacques"));
    }
}