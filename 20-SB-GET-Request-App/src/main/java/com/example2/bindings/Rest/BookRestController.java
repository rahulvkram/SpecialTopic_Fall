package com.example2.bindings.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.bindings.Book;

@RestController
public class BookRestController {

	
	@GetMapping(value = "/book")
	public Book getBook() 
	{
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("HWF&IP");
		book.setIsbn("ISBN100");
		book.setBookPrice(200.5);
		return  book;
	}
}
