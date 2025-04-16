package com.nucsaping.graphql.repository;

import com.nucsaping.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
