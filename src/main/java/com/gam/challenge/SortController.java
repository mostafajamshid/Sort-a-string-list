package com.gam.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {

    private SortService sortService;

    @Autowired
    public SortController(SortService sortService) {
        this.sortService = sortService;
    }

    @PostMapping("/sort")
    public SortResponse sort(@RequestBody SortRequest req) {
        String[] sorted = sortService.sort(req.getValues());
        return new SortResponse(sorted);
    }
}
