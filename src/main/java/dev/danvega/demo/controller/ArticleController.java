package dev.danvega.demo.controller;

import dev.danvega.demo.model.Article;
import dev.danvega.demo.repository.ArticleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleRepository articles;

    public ArticleController() {
        this.articles = new ArticleRepository();
    }

    @GetMapping
    public Iterable<Article> findAll() {
        return articles.findAll();
    }

    @GetMapping("/{id}")
    public Article findById(@PathVariable("id") Integer id) {
        return articles.findById(id);
    }

}
