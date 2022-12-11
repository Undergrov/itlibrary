package com.itstep.itlibrary.controller;

import com.itstep.itlibrary.entity.Book;
import com.itstep.itlibrary.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController

@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;
    @GetMapping()
    public List<Book> getAll(){
        return bookService.getAll ();
    }
    @GetMapping("/{id}")
    public Book get(@PathVariable Long id){
        return bookService.get ( id );
    }
    @PostMapping()
    public void create(@RequestBody Book book){
        bookService.create(book);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Book book){
        bookService.update(id, book);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
