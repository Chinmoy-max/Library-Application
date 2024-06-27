package com.libraryApp.LibraryApp.repository;

import com.libraryApp.LibraryApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
