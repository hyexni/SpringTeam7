package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    // 도서 목록 페이지
    @RequestMapping("/list")
    public String bookList(Model model){
        System.out.println(" BookController - bookList() 실행!");
        return "book/book_list";
    }
}
