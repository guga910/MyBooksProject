package com.estudos.MyBooksProject.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.estudos.MyBooksProject.builder.LivroBuilder;
import com.estudos.MyBooksProject.entity.Livro;
import com.estudos.MyBooksProject.entity.LivroVO;
import com.estudos.MyBooksProject.exceptions.IsbnExceptions;
import com.estudos.MyBooksProject.exceptions.LivroSemPaginaException;
import com.estudos.MyBooksProject.service.LivroServiceVO;

@RunWith(SpringRunner.class)
@DataJpaTest // anotação para criar  tests no repository
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test") 
public class LivroRepositoryTest {
	private LivroBuilder builder = new LivroBuilder();

	private LivroVO livroVO = new LivroVO();

	private LivroServiceVO service = new LivroServiceVO();
	@Autowired
	private LivroRepository repository;
	@Autowired
	private TestEntityManager em;

	@Before
	public void before() {
		livroVO = builder.umLivroVO(1777);

	}

	@After
	public void after() {
//		service.delete(livroVO.getKey());

	}

	@Test
	public void deveriaSalvarUmLivro() throws IsbnExceptions, LivroSemPaginaException {
		
		em.persist(livroVO);
		List<Livro> titulos= repository.findByTitulo(livroVO.getTitulo());
		Assert.assertNotNull(titulos);
		
		
		// Cenario:

//		List<LivroVO> antes = service.findAll();
//		System.out.println("antes: " + antes.size());
//
//		// Ação:
//		service.create(livroVO);
//		List<LivroVO> depois = service.findAll();
//		System.out.println("depois: " + depois.size());
//
//		// Verificação:
//		Assert.assertEquals((antes.size() + 1), depois.size());

	}
	
//	@Test
	public void deveEncontarLivroPeloId() throws IsbnExceptions, LivroSemPaginaException {
		service.create(livroVO);
	LivroVO lt=	service.findById(livroVO.getKey());
		
		assertEquals("Autor: 1777",lt.getAutor() );
		
		
//		service.findById(0)
		
	}

}
