package com.library.library_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller

public class BookController {
    @GetMapping("/")
    public String Home() {
        return "Home";
    }
    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getAllBooks() {
        return  "BookList";
    }
    
    
    
    
}
