package br.com.alessanderleite.app.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alessanderleite.app.model.BookCategory;
import br.com.alessanderleite.app.repository.BookCategoryRepository;
import javassist.NotFoundException;


@Service
public class BookCategoryServiceImpl implements BookCategoryService{

	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	@Override
	public List<BookCategory> findAll() {
		List<BookCategory> bookCategory = bookCategoryRepository.findAll();
		return bookCategory;
	}

	@Override
	public Optional<BookCategory> findById(Long id) throws IOException {
		Optional<BookCategory> bookCategory = bookCategoryRepository.findById(id);
		if (!bookCategory.isPresent()) {
			throw new RuntimeException("Not found this id : " + id);
		}
		return bookCategory;
	}

	@Override
	public BookCategory create(BookCategory bookCategory) {
		return bookCategoryRepository.save(bookCategory);
	}

	@Override
	public void update(BookCategory bookCategory) {
		bookCategoryRepository.save(bookCategory);
	}

	@Override
	public void deleteById(Long id) throws IOException {
		Optional<BookCategory> bCategory = bookCategoryRepository.findById(id);
		try {
			bCategory.orElseThrow(() -> new NotFoundException("Not found this id : " + id));
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		bookCategoryRepository.deleteById(id);
	}

	




}
