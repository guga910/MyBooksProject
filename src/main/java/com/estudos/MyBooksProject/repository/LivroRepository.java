package com.estudos.MyBooksProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.MyBooksProject.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	

}
