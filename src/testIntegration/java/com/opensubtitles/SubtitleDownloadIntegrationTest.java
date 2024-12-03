package com.opensubtitles;

import com.opensubtitles.subtitles.DownloadSubtitleResponse;
import com.opensubtitles.subtitles.SubtitleSearchRequest;
import com.opensubtitles.subtitles.SubtitleSearchResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtitleDownloadIntegrationTest extends BaseIntegrationTest {
    @Test
    public void downloadSubtitle(){
        Assertions.assertDoesNotThrow(() -> {
            DownloadSubtitleResponse res = openSubtitlesService.downloadSubtitle(4371053);
            Assertions.assertNotNull(res);
        });
    }
}
