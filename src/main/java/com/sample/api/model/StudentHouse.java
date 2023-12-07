package com.sample.api.model;


import lombok.Builder;
import lombok.Getter;

/**
 * This represents the student house form
 */

@Builder
@Getter
public class StudentHouse {

    private String name;
    private int size;
}
