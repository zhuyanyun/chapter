package com.smart.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}
