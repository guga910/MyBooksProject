package com.estudos.MyBooksProject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class LivroVOV2 implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String titulo;
	private String autor;
	private String editora;
	private String categoria;
	private String subCategoria;
	private String notas;
	private String image;
	private Date compra;
	private Date registro;
	private String colecao;
	
	
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
	public Date getCompra() {
		return compra;
	}
	public void setCompra(Date compra) {
		this.compra = compra;
	}
	public Date getRegistro() {
		return registro;
	}
	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	public String getColecao() {
		return colecao;
	}
	public void setColecao(String colecao) {
		this.colecao = colecao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, categoria, colecao, compra, editora, id, image, notas, registro, subCategoria,
				titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroVOV2 other = (LivroVOV2) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(colecao, other.colecao) && Objects.equals(compra, other.compra)
				&& Objects.equals(editora, other.editora) && id == other.id && Objects.equals(image, other.image)
				&& Objects.equals(notas, other.notas) && Objects.equals(registro, other.registro)
				&& Objects.equals(subCategoria, other.subCategoria) && Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "LivroVOV2 [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora
				+ ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", notas=" + notas + ", image="
				+ image + ", compra=" + compra + ", registro=" + registro + ", colecao=" + colecao + "]";
	}
	
	

}