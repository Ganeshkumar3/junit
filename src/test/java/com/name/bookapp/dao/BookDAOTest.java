package com.name.bookapp.dao;

import java.util.List;

import org.junit.Test;

import com.name.bookapp.model.Book;

public class BookDAOTest {

	@Test
	public void testSave() {
		Book book=new Book();
		book.setName("java");
		book.setPrice(300f);
		BookDAO dao=new BookDAO();
		dao.save(book);
	}

	@Test
	public void testFindAll() {
		BookDAO dao=new BookDAO();
		List<Book> book=dao.findAll();
		
		for(Book b:book)
		{
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getPrice());
		}
	}

}
