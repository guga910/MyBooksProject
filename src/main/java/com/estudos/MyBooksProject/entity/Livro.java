package com.estudos.MyBooksProject.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "livros")
public class Livro {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String titulo;
	@Column(nullable = false)
	private String autor;
	@Column(nullable = false)
	private String editora;
	@Column(nullable = false)
	private String categoria;
	@Column
	private String subCategoria;
	@Column
	private String notas;
	@Column
	private String image;
	@Column(nullable = false)
	private Date criacao;
	@Column
	private Date registro;
	
//	@RequestMapping("/test")
//	public String test() {
//	 String test= "tu é o bichao mermo em!!!";
//	 return test;
//	}
	
	public Livro() {}
	
	
	public Livro(String titulo, String autor, String editora, String categoria, String subCategoria, String notas,
			String image, Date criacao, Date registro) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.notas = notas;
		this.image = image;
		this.criacao = criacao;
		this.registro = registro;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCriacao() {
		return criacao;
	}
	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, categoria, criacao, editora, id, image, notas, registro, subCategoria, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(criacao, other.criacao) && Objects.equals(editora, other.editora) && id == other.id
				&& Objects.equals(image, other.image) && Objects.equals(notas, other.notas)
				&& Objects.equals(registro, other.registro) && Objects.equals(subCategoria, other.subCategoria)
				&& Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", categoria="
				+ categoria + ", subCategoria=" + subCategoria + ", notas=" + notas + ", image=" + image + ", criacao="
				+ criacao + ", registro=" + registro + "]";
	}
	
	
	

}
