package com.example.demo.service;
import com.example.demo.entity.Book;
import com.example.demo.repositry.repositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private repositry re;

    public Book add(Book book){
        return re.save(book);

    }


    public Book GetById(Integer id) {
        return re.findById(id).get();
    }

    public Book updatebook(Book book) {

    }

    public void DeleteBook(int id) {
        re.deleteById(id);
    }
}
