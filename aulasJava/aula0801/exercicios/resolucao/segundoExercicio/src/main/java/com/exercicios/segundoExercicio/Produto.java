package com.exercicios.segundoExercicio;

public class Produto {
	
	//Atributos
	private int codigo;
	private String nome;
	private String descricao;
	private float precoVenda;
	private int quantEstoque;
	private boolean ativo;
	private String dataCad;
	


	//Constructor
	public Produto(int codigo, String nome, String descricao, float precoVenda, int quantEstoque, boolean ativo,
			String dataCad) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.precoVenda = precoVenda;
		this.quantEstoque = quantEstoque;
		this.ativo = ativo;
		this.dataCad = dataCad;
	}

	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getDataCad() {
		return dataCad;
	}

	public void setDataCad(String dataCad) {
		this.dataCad = dataCad;
	}

	//Methods
	public void inserirProd(int codigo, String nome, String descricao, float precoVenda, int quantEstoque, boolean ativo,
			String dataCad){
		System.out.println(this.nome + "foi cadastrado com sucesso!");
		
	}

	public void alterar(){

	}

	public void excluir(){

	}

	public void pesquisar(){

	}

}
