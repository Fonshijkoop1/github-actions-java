package com.example.devopstraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class DevopsTrainingApplication {

    // Private constructor to prevent instantiation
    private DevopsTrainingApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(final String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}
