package com.opensubtitles;

import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {

    protected MockWebServer mockWebServer;
    protected OpenSubtitlesService openSubtitlesService;

    @BeforeEach
    public void setUp() throws Exception {
        // Start the MockWebServer
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        // Initialize the OpenSubtitlesService with the MockWebServer's URL
        openSubtitlesService = new OpenSubtitlesService(
                "I7OcPtGLpl4mijTgYVvBIJ0Fr0YOJes5",
                "appnametest",
                "v1.0.0",
                mockWebServer.url("/").toString()
        );
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Shut down the MockWebServer
        if (mockWebServer != null) {
            mockWebServer.shutdown();
        }
    }
}
