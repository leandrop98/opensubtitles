package com.opensubtitles;

import com.google.gson.Gson;
import com.opensubtitles.subtitles.SubtitleSearchRequest;
import com.opensubtitles.subtitles.SubtitleSearchResponse;
import okhttp3.mockwebserver.MockResponse;
import org.junit.jupiter.api.Test;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SubtitleSearchTest extends BaseTest {

    private final Gson gson = new Gson();
    @Test
    public void testSearchSubtitles() throws Exception {
        SubtitleSearchResponse mockResponse = new SubtitleSearchResponse();
        mockResponse.setTotalPages(2);
        mockResponse.setTotalCount(25);
        mockResponse.setPerPage(10);
        mockResponse.setPage(1);

        MockResponse response = new MockResponse()
                .setBody(gson.toJson(mockResponse))
                .setResponseCode(200);

        mockWebServer.enqueue(response);

        SubtitleSearchRequest searchRequest = new SubtitleSearchRequest("The Matrix", "en");
        searchRequest.setImdbId("tt0133093");

        SubtitleSearchResponse actualResponse = openSubtitlesService.searchSubtitles(searchRequest);

        var recordedRequest = mockWebServer.takeRequest();
        assertEquals("/subtitles", recordedRequest.getPath().split("\\?")[0]); // Endpoint check

        Map<String, String> expectedQueryParams = searchRequest.getQueryParameters();
        Map<String, String> actualQueryParams = queryParamsFromUrl(recordedRequest.getPath());

        for (Map.Entry<String, String> entry : expectedQueryParams.entrySet()) {
            String expectedValue = entry.getValue();
            String actualValue = actualQueryParams.get(entry.getKey());
            assertEquals(URLDecoder.decode(expectedValue, StandardCharsets.UTF_8), URLDecoder.decode(actualValue, StandardCharsets.UTF_8));
        }

        // Validate the response
        assertEquals(mockResponse.getTotalPages(), actualResponse.getTotalPages());
        assertEquals(mockResponse.getTotalCount(), actualResponse.getTotalCount());
        assertEquals(mockResponse.getPerPage(), actualResponse.getPerPage());
        assertEquals(mockResponse.getPage(), actualResponse.getPage());
    }

    private Map<String, String> queryParamsFromUrl(String url) {
        Map<String, String> queryParams = new HashMap<>();
        if (url.contains("?")) {
            String queryString = url.split("\\?")[1];
            String[] params = queryString.split("&");
            for (String param : params) {
                String[] keyValue = param.split("=");
                queryParams.put(keyValue[0], keyValue.length > 1 ? keyValue[1] : "");
            }
        }
        return queryParams;
    }
}

