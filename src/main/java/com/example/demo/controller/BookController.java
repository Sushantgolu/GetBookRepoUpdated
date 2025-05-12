package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addbook")
    public ResponseEntity<Book> addbook(@RequestBody Book book){
         Book b = bookService.add(book);
        System.out.println(book.id);
        System.out.println(book.name);
        System.out.println(book.author);
         return ResponseEntity.ok(b);
    }

    @GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getbook(@PathVariable("id") Integer id){
        Book GetBook = bookService.GetById(id);
        System.out.println("Done");
        return ResponseEntity.ok(GetBook);
    }

    @PutMapping("/updatebook/{id}")
    public ResponseEntity<Book> updatebook(@RequestBody Book book, @PathVariable("id") int id){
           Book updatebook = bookService.updatebook(book);
           return ResponseEntity.ok(updatebook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void delete(@PathVariable("id") int id){
        bookService.DeleteBook(id);

    }


}
