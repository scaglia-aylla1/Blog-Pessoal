package com.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogPessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
