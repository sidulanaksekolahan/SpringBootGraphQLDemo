package com.nucsaping.graphql.controller;

import com.nucsaping.graphql.dto.BookInput;
import com.nucsaping.graphql.model.Book;
import com.nucsaping.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @QueryMapping
    public Book getBookById(@Argument Long id) {
        return bookService.getBookById(id).orElse(null);
    }

    @MutationMapping
    public Book createBook(@Argument BookInput input) {
        return bookService.createBook(input);
    }

    @MutationMapping
    public Book updateBook(@Argument Long id, @Argument BookInput input) {
        return bookService.updateBook(id, input);
    }

    @MutationMapping
    public Boolean deleteBook(@Argument Long id) {
        return bookService.deleteBook(id);
    }
}
