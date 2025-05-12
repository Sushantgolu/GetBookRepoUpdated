package com.example.demo.repositry;
import com.example.demo.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositry extends JpaRepository<Book,Integer> {

    public void UpdateById();

}
