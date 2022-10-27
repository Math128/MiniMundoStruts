package br.com.minimundo.model;

import java.util.List;

public class Aluno {

	private String nome;
	private List<Prova> provas;
	private Boletim boletim;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno criarAluno(String nome) {
		return null;
	}

	public List<Aluno> listarAlunos() {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Prova> getProvas() {
		return provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public Boletim getBoletim() {
		return boletim;
	}
	
	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", provas=" + provas + ", boletim="
				+ boletim + "]";
	}
	
	
}
