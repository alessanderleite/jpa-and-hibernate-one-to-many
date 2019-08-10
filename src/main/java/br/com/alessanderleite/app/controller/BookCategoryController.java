package br.com.alessanderleite.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.app.model.BookCategory;
import br.com.alessanderleite.app.service.BookCategoryService;

@RestController
@RequestMapping("/api/v1")
public class BookCategoryController {

	@Autowired
	BookCategoryService bookCategoryService;
	
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	private List<BookCategory> findAllBookCategory() {
		return bookCategoryService.findAll();
	}
	
	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public BookCategory createBookCategory(@Valid @RequestBody BookCategory bookCategory) {
		return bookCategoryService.create(bookCategory);
	}
}
