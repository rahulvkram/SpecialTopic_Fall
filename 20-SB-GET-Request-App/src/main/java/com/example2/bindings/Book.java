package com.example2.bindings;

//import javax.xml.bind.annotation.XmlRootElement;


//@XmlRoootElement
public class Book {
	
	private Integer bookId;
	private String isbn;
	private String bookName;
	private double bookPrice;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", isbn=" + isbn + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ "]";
	}
	
	
}
