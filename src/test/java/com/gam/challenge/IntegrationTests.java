package com.gam.challenge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.gam.challenge.TestUtils.isSortedArray;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests {

    @LocalServerPort
    private int port;

    private TestRestTemplate restTemplate = new TestRestTemplate();
    private ResponseEntity<SortResponse> response;
    private String[] unsortedArray = new String[]{"b", "a", "c", "d", "e"};

    @Test
    void whenGivenUnsortedStrings_shouldReturnTheSortedArray() {
        whenGivenUnsortedArrayToSortEndpoint(new SortRequest(unsortedArray));
        shouldResponseWithOkStatusCode();
        ensureTheResponseIsSorted();
    }

    private void whenGivenUnsortedArrayToSortEndpoint(SortRequest sortRequest) {
        String url = "http://localhost:" + port + "/sort";
        response = restTemplate
                .postForEntity(url, sortRequest, SortResponse.class);
    }

    private void shouldResponseWithOkStatusCode() {
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    private void ensureTheResponseIsSorted() {
        SortResponse body = response.getBody();
        assertNotNull(body);
        assertTrue(isSortedArray(body.getValues()));
    }

}

