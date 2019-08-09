package br.com.alessanderleite.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessanderleite.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
