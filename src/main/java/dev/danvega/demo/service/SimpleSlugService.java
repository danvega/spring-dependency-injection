package dev.danvega.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleSlugService implements SlugService {

    @Override
    public String slugify(String title) {
        return title.
                toLowerCase() // Convert to lowercase
                .replaceAll("[^a-zA-Z0-9 ]", "") // replace all special characters expect space
                .replaceAll(" ", "-"); // replace all spaces with hyphens
    }

}
