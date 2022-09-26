package dev.danvega.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSlugServiceTest {

    Slugify slugify;

    @BeforeEach
    void setUp() {
        slugify = new SimpleSlugService();
    }

    @Test
    void shouldSlugifySimpleTitle() {
        String title = "Hello World";
        String slug = slugify.slugify(title);
        assertEquals("hello-world", slug);
    }

    @Test
    void shouldSlugifyTitleWithSpecialCharacters() {
        String title = "Hello, World!";
        String slug = slugify.slugify(title);
        assertEquals("hello-world", slug);
    }

}