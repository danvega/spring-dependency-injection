package dev.danvega.demo.repository;

import dev.danvega.demo.model.Article;
import dev.danvega.demo.service.SimpleSlugService;
import dev.danvega.demo.service.Slugify;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {

    private final Slugify simpleSlugService;
    private List<Article> articles = new ArrayList<>();

    public ArticleRepository() {
        this.simpleSlugService = new SimpleSlugService();
        articles = List.of(
                new Article(1, "Hello, World!", simpleSlugService.slugify("Hello, World!"),"Welcome to my new Blog!", LocalDateTime.now()),
                new Article(2, "Spring Initializr", simpleSlugService.slugify("Spring Initializr"),"Get started with Spring Boot at start.spring.io", LocalDateTime.now()),
                new Article(3, "Spring Dependency Injection", simpleSlugService.slugify("Spring Dependency Injection"),"An introduction to Dependency Injection in Spring", LocalDateTime.now())
        );
    }

    public List<Article> findAll() {
        return articles;
    }

    public Article findById(Integer id) {
        return articles.stream().filter(a -> a.id().equals(id)).findFirst().orElse(null);
    }

}
