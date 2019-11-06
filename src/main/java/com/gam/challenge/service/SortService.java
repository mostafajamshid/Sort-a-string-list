package com.gam.challenge.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;

@Service
public class SortService {

    public String[] sort(String[] values) {
        Objects.requireNonNull(values, "require non null");
        if (Arrays.asList(values).contains(null)) throw new IllegalArgumentException("null value is not allowed.");
        Arrays.sort(values);
        return values;
    }
}
