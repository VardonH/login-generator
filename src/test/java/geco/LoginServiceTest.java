package geco;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService logServ;
    @Before
    public void setUp() throws Exception {
        final String [] c = new String[3];
        c[0] = "e1";
        c[1] = "e2";
        c[2] = "e3";
        logServ = new LoginService(c);

    }
    @Test
    public void testLoginExists() {
        assertTrue(logServ.loginExists("e1"));
        assertFalse(logServ.loginExists("faux"));
    }
    @Test
    public void testAddLogin() {
        logServ.addLogin("e4");
        assertTrue(logServ.loginExists("e4"));
        assertFalse(logServ.loginExists("faux"));
    }
    @Test
    public void testFindAllLoginsStartingWith() {
        assertEquals(3,logServ.findAllLoginsStartingWith("e").size());
    }
    @Test
    public void testFindAllLogins() {
        assertEquals(3,logServ.findAllLogins().size());
    }
}