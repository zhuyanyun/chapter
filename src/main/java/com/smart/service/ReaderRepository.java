package com.smart.service;

import com.smart.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader,String> {

    Reader findOne(String username);
}
