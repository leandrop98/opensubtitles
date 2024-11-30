package com.opensubtitles;

import com.opensubtitles.subtitles.DownloadSubtitleRequest;
import okhttp3.mockwebserver.MockResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubtitleDownloadTest extends BaseTest {

    @Test
    public void downloadSubtitle() throws InterruptedException {
        // Mock response for the subtitle download API
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody("""
                        {
                          "link": "https://www.opensubtitles.com/download/12473573...",
                          "file_name": "castle.rock.s01e03.webrip.x264-tbs.ettv.-eng.ro.srt",
                          "requests": 3,
                          "remaining": 97,
                          "message": "Your quota will be renewed in 07 hours and 30 minutes (2022-04-08 13:03:16 UTC)",
                          "reset_time": "07 hours and 30 minutes",
                          "reset_time_utc": "2022-04-08T13:03:16.000Z"
                        }
                        """)
                .addHeader("Content-Type", "application/json"));

        // Test downloading the subtitle
        assertDoesNotThrow(() -> {
            int subtitleId = 12473573; // Example subtitle ID
            var response = openSubtitlesService.downloadSubtitle(subtitleId);

            // Validate the response
            assertNotNull(response);
            assertEquals("https://www.opensubtitles.com/download/12473573...", response.getDownloadUrl());
            assertEquals("castle.rock.s01e03.webrip.x264-tbs.ettv.-eng.ro.srt", response.getFileName());
            assertEquals(97, response.getRemainingRequests());
            assertEquals("Your quota will be renewed in 07 hours and 30 minutes (2022-04-08 13:03:16 UTC)", response.getMessage());
        });

        // Validate the request sent to the MockWebServer
        var recordedRequest = mockWebServer.takeRequest();
        assertEquals("/download", recordedRequest.getPath());
        assertEquals("POST", recordedRequest.getMethod());
    }


    @Test
    public void downloadSubtitleWithRequestObject() throws InterruptedException {
        // Mock response for the subtitle download API
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody("""
                    {
                      "link": "https://www.opensubtitles.com/download/A184A5EA6302...",
                      "file_name": "castle.rock.s01e03.webrip.x264-tbs.ettv.-eng.ro.srt",
                      "requests": 3,
                      "remaining": 97,
                      "message": "Your quota will be renewed in 07 hours and 30 minutes (2022-04-08 13:03:16 UTC)",
                      "reset_time": "07 hours and 30 minutes",
                      "reset_time_utc": "2022-04-08T13:03:16.000Z"
                    }
                    """)
                .addHeader("Content-Type", "application/json"));

        DownloadSubtitleRequest request = new DownloadSubtitleRequest(12345);
        request.setSubFormat("srt");
        request.setFileName("custom_name.srt");
        request.setInFps(23.976f);
        request.setOutFps(24.0f);
        request.setTimeshift(1.5f);
        request.setForceDownload(true);

        // Test downloading the subtitle
        assertDoesNotThrow(() -> {
            var response = openSubtitlesService.downloadSubtitle(request);

            // Validate the response
            assertNotNull(response);
            assertEquals("https://www.opensubtitles.com/download/A184A5EA6302...", response.getDownloadUrl());
            assertEquals("castle.rock.s01e03.webrip.x264-tbs.ettv.-eng.ro.srt", response.getFileName());
            assertEquals(97, response.getRemainingRequests());
            assertEquals("Your quota will be renewed in 07 hours and 30 minutes (2022-04-08 13:03:16 UTC)", response.getMessage());
        });

        // Validate the request sent to the MockWebServer
        var recordedRequest = mockWebServer.takeRequest();
        assertEquals("/download", recordedRequest.getPath());
        assertEquals("POST", recordedRequest.getMethod());
        assertEquals("application/json", recordedRequest.getHeader("Content-Type"));

        // Verify the request body
        String expectedRequestBody = "{\"fileId\":12345,\"subFormat\":\"srt\",\"fileName\":\"custom_name.srt\",\"inFps\":23.976,\"outFps\":24.0,\"timeshift\":1.5,\"forceDownload\":true}".trim();
        assertEquals(expectedRequestBody.trim(), recordedRequest.getBody().readUtf8().trim());
    }
}

