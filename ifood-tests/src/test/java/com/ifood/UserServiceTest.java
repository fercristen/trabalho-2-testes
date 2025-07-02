package com.ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    void senhaComMenosDeOitoCaracteresFalha() {
        User user = new User("a@a.com", "SenhaAntiga123!");
        UserService svc = new UserService();
        boolean result = svc.changePassword(user, "aB1@cDe");
        assertFalse(result);
        assertEquals("SenhaAntiga123!", user.getPassword());
    }

    @Test
    void senhaSemMaiusculaFalha() {
        User user = new User("a@a.com", "SenhaAntiga123!");
        UserService svc = new UserService();
        boolean result = svc.changePassword(user, "novasenha123@");
        assertFalse(result);
    }

    @Test
    void alterarSenhaComSucesso() {
        User user = new User("a@a.com", "SenhaAntiga123!");
        UserService svc = new UserService();
        boolean result = svc.changePassword(user, "NovaSenha@2025");
        assertTrue(result);
        assertEquals("NovaSenha@2025", user.getPassword());
    }
}
