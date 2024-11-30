package com.opensubtitles;

import okhttp3.mockwebserver.MockResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageTest extends BaseTest {

    @Test
    public void testGetLanguages() {
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody("""
                        {
                            "data": [
                                {"language_name": "English", "language_code": "en"},
                                {"language_name": "Spanish", "language_code": "es"},
                                {"language_name": "French", "language_code": "fr"}
                            ]
                        }
                        """)
                .addHeader("Content-Type", "application/json"));

        assertDoesNotThrow(() -> {
            var languagesResponse = openSubtitlesService.getLanguages();

            assertNotNull(languagesResponse.getLanguages());
            assertEquals(3,languagesResponse.getLanguages().size());
            assertEquals("English", languagesResponse.getLanguages().get(0).getLanguageName());
            assertEquals("en", languagesResponse.getLanguages().get(0).getLanguageCode());
            assertEquals("Spanish", languagesResponse.getLanguages().get(1).getLanguageName());
            assertEquals("es", languagesResponse.getLanguages().get(1).getLanguageCode());
            assertEquals("French", languagesResponse.getLanguages().get(2).getLanguageName());
            assertEquals("fr", languagesResponse.getLanguages().get(2).getLanguageCode());
        });
    }
}
