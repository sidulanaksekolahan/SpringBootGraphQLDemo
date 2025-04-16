package com.nucsaping.graphql.service;

import com.nucsaping.graphql.dto.BookInput;
import com.nucsaping.graphql.model.Book;
import com.nucsaping.graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book createBook(BookInput input) {
        Book book = Book.builder()
                .title(input.title())
                .author(input.author())
                .build();
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, BookInput input) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setTitle(input.title());
                    book.setAuthor(input.author());
                    return bookRepository.save(book);
                }).orElse(null);
    }

    @Override
    public Boolean deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
