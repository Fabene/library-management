package com.prog4.librarymanagement.controller;

import com.prog4.librarymanagement.model.Author;
import com.prog4.librarymanagement.model.Book;
import com.prog4.librarymanagement.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAll();
    }

    @PostMapping("/saveAll")
    public List<Author> saveAllAuthors(@RequestBody List<Author> authors) {
        return authorService.saveAllAuthors(authors);
    }

    @PostMapping("/save")
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/delete")
    public void deleteAuthor(@RequestBody Author author) {
        authorService.deleteAuthor(author);
    }
}