package com.opensubtitles;

import com.opensubtitles.subtitles.SubtitleSearchRequest;
import com.opensubtitles.subtitles.SubtitleSearchResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtitleSearchIntegrationTest extends BaseIntegrationTest {
    @Test
    public void searchSubtitle(){
        Assertions.assertDoesNotThrow(() -> {
            SubtitleSearchRequest request = new SubtitleSearchRequest("iron", "en");
            SubtitleSearchResponse res = BaseIntegrationTest.openSubtitlesService.searchSubtitles(request);
            Assertions.assertNotNull(res);
            Assertions.assertNotEquals(0, res.getTotalCount());
        });
    }
}
