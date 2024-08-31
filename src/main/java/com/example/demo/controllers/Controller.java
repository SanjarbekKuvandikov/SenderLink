package com.example.demo.controllers;

import com.example.demo.dtos.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    List<BookDto> books = new ArrayList<>();

    @GetMapping("/books")
    private ResponseEntity<List<BookDto>> getAll(){
        books.add(
                new BookDto(
                        123L,
                        "Android develepment",
                        "Joe Sterling",
                        "12244df333333"
                )
        );
        return ResponseEntity.ok(books);
    }

    @GetMapping(value = "/id={id}")
    private ResponseEntity<BookDto> getById(@PathVariable Long id)
    {
        BookDto book;
        book = books.stream().filter(b -> b.getId() == id).findFirst().get();
        book = books.stream().findFirst().get();
        return ResponseEntity.ok(book);
    }

}