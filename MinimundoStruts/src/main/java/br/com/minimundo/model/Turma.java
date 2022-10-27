package br.com.minimundo.model;

import java.util.List;

public class Turma {

	private String nomeTurma;
	private List<Aluno> aluno;
	
	public Turma(String nomeTurma, List<Aluno> alunos) {
		this.nomeTurma = nomeTurma;
		this.aluno = alunos;
	}

	public Turma criarTurma(List<Aluno> Alunos) {
		return null;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Turma [nomeTurma=" + nomeTurma + ", aluno=" + aluno + "]";
	}
	
	
}
