package com.opensubtitles;

import com.opensubtitles.common.OpenSubtitlesApiException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthIntegrationTest extends BaseIntegrationTest {

    @Test
    public void checkIsLoggedIn(){
        assertFalse(openSubtitlesService.isLoggedIn());
    }

    @Test
    public void wrongCredentialsLogin() {
        OpenSubtitlesApiException exception = Assertions.assertThrows(OpenSubtitlesApiException.class, () -> {
            openSubtitlesService.login("wrongusername", "wrongpassword");
        });
        int expectedCode = 401;
        Assertions.assertEquals(expectedCode, exception.getStatusCode());
    }

    @Test
    public void correctCredentialsLogin() {
        Assertions.assertDoesNotThrow(() -> openSubtitlesService.login(System.getenv("TEST_USER_USERNAME"), System.getenv("TEST_USER_PASSWORD")));
        assertTrue(openSubtitlesService.isLoggedIn());
    }
}
