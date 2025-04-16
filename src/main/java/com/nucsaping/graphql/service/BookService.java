package com.nucsaping.graphql.service;

import com.nucsaping.graphql.dto.BookInput;
import com.nucsaping.graphql.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    Book createBook(BookInput input);

    Book updateBook(Long id, BookInput input);

    Boolean  deleteBook(Long id);
}
