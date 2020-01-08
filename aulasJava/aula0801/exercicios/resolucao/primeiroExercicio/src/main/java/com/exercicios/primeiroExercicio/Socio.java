package com.exercicios.primeiroExercicio;



public class Socio {
	
	//Atributos 
	private String nome;
	private int cpf;
	private String rg;
	private int nascimento;
	private int tel;
	private String endereco;

	
	//Constructor
	public Socio(String nome, int cpf, String rg, int nascimento, int tel, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
		this.tel = tel;
		this.endereco = endereco;
	}

	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	//Métodos
	public void Cadastrar(String nome, int cpf){
		 this.getNome();
		 this.getCpf();
		 System.out.println("usuario: " + nome + " \nrg: " + rg + " foi cadastrado com sucesso.");
		
	}

	public void ConfirmarCadastro(){
		if (getNome()!=null && getRg()!=null) {
			System.out.println("usuario confirmado");
		}
		else {
			System.out.println("usuario nao confirmado");
		}
	}

	public void ValidarSocio(){
		System.out.println("socio validado ir pra proxima pagina");
	}

	public void Alterar(){
		this.setNome(nome);
		this.setRg(rg);
	}

}
