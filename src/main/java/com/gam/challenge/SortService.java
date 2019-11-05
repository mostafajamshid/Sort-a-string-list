package com.gam.challenge;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SortService {

    public String[] sort(String[] values) {
        Arrays.sort(values);
        return values;
    }
}
