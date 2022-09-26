package dev.danvega.demo.controller;

import dev.danvega.demo.model.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ArticleControllerTest {

    ArticleController controller;

    @BeforeEach
    void setUp() {
        controller = new ArticleController();
    }

    @Test
    void shouldReturnAllArticles() {
        assertEquals(3,controller.findAll().spliterator().getExactSizeIfKnown());
    }

    @Test
    void shouldReturnArticleByIdWithValidId() {
        Article article = controller.findById(1);
        assertNotNull(article);
    }

}