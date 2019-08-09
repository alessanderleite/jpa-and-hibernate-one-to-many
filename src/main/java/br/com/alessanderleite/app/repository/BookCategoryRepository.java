package br.com.alessanderleite.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessanderleite.app.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
