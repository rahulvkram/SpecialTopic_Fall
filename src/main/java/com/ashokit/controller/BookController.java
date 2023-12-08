package com.ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashokit.domain.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {

		Book b = new Book();
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(450.00);

		model.addAttribute("book", b);

		return "pageOne";
	}

	@GetMapping("/books")
	public String getBooksData(Model model) {

		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBookName("Spring");
		b1.setBookPrice(450.00);

		Book b2 = new Book();
		b2.setBookId(102);
		b2.setBookName("Spring Boot");
		b2.setBookPrice(550.00);

		Book b3 = new Book();
		b3.setBookId(103);
		b3.setBookName("Angular");
		b3.setBookPrice(250.00);

		List<Book> booksList = new ArrayList<Book>();
		booksList.add(b1);
		booksList.add(b2);
		booksList.add(b3);

		model.addAttribute("books", booksList);

		return "pageTwo";
	}

}
