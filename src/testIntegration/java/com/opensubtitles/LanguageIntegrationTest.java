package com.opensubtitles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageIntegrationTest extends BaseIntegrationTest {
    @Test
    public void testGetLanguages() {
        Assertions.assertDoesNotThrow(() -> {
            var languagesResponse = BaseIntegrationTest.openSubtitlesService.getLanguages();
            Assertions.assertNotNull(languagesResponse.getLanguages());
            Assertions.assertTrue(languagesResponse.getLanguages().size() > 0, "Languages list should not be empty");
        });
    }
}
