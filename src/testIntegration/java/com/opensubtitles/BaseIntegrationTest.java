package com.opensubtitles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import java.util.concurrent.TimeUnit;

public class BaseIntegrationTest {

    protected static OpenSubtitlesService openSubtitlesService;

    @BeforeAll
    public static void setUp() {
        openSubtitlesService = new OpenSubtitlesService(System.getenv("TEST_API_KEY"), "appnametest", "1.0.0");
    }

    @BeforeEach
    public void waitBeforeTest() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1); // Throttling delay
    }
}
