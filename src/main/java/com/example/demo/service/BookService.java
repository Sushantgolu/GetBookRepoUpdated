package com.example.demo.service;
import com.example.demo.entity.Book;
import com.example.demo.repositry.repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private repositry re;

    public void add(Book book){
        re.save(book);

    }


}
