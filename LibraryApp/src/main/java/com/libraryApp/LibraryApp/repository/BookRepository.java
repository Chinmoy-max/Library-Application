package com.libraryApp.LibraryApp.repository;

import com.libraryApp.LibraryApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
