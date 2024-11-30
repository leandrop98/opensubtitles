package com.opensubtitles;

import com.opensubtitles.common.OpenSubtitlesApiException;
import okhttp3.mockwebserver.MockResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthTest extends BaseTest {

    @Test
    public void checkIsLoggedIn() {
        assertFalse(openSubtitlesService.isLoggedIn());
    }

    @Test
    public void wrongCredentialsLogin() {
        // Mock the response for a failed login
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(401)
                .setBody("{\"message\":\"Invalid username or password\"}")
                .addHeader("Content-Type", "application/json"));

        // Test the login method with wrong credentials
        OpenSubtitlesApiException exception = assertThrows(OpenSubtitlesApiException.class, () -> {
            openSubtitlesService.login("wrongusername", "wrongpassword");
        });

        assertEquals(401, exception.getStatusCode());
    }

    @Test
    public void correctCredentialsLogin() {
        // Mock the response for a successful login
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody("{\"token\":\"valid-token\"}"));

        // Test the login method with correct credentials
        assertDoesNotThrow(() -> openSubtitlesService.login("correctUsername", "correctPassword"));
        assertTrue(openSubtitlesService.isLoggedIn());
    }
}
