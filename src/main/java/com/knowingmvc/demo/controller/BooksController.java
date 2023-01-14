package com.knowingmvc.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.knowingmvc.demo.dao.Books;

@Controller
public class BooksController {

	@GetMapping("/book")
	public String getBook(Model model) {
		Books b1 = new Books();
		b1.setBookId(100);
		b1.setBookName("Atomic Habits");
		b1.setBookPrice(350);
		model.addAttribute("bookDetail", b1);
		return "bookData";
	}

	@GetMapping("/bookList")
	public ModelAndView getBookList() {
		Books b1 = new Books();
		b1.setBookId(100);
		b1.setBookName("Atomic Habits");
		b1.setBookPrice(350);

		Books b2 = new Books();
		b2.setBookId(101);
		b2.setBookName("B");
		b2.setBookPrice(300);

		Books b3 = new Books();
		b3.setBookId(102);
		b3.setBookName("C");
		b3.setBookPrice(250);

		Books b4 = new Books();
		b4.setBookId(103);
		b4.setBookName("D");
		b4.setBookPrice(150);

		List<Books> bookList = new ArrayList();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);

		ModelAndView mv = new ModelAndView();
		mv.addObject("listOfBook", bookList);
		mv.setViewName("bookList");
		return mv;
	}

}
