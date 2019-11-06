package com.gam.challenge.controller;

import com.gam.challenge.model.SortRequest;
import com.gam.challenge.model.SortResponse;
import com.gam.challenge.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sorting-app")
@CrossOrigin(origins = "*")

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
