package dev.danvega.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AdvancedSlugService implements SlugService {
    @Override
    public String slugify(String input) {
        return "advanced-slug";
    }
}
