package br.com.minimundo.dto;

import java.io.Serializable;
import java.util.List;

import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.model.Aluno;
import br.com.minimundo.model.Boletim;
import br.com.minimundo.model.Prova;

public class AlunoDTO implements Serializable {

	private static final long serialVersionUID = 4583948591934028502L;

	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double provaFinal;
	private double provaEspecial;
	private double media;
	private double notaVencedor;
	private SituacaoBoletimEnum situacao;
	private List<Prova> provas;
	private Boletim boletim;

	public AlunoDTO(Aluno aluno) {
		this.nome = aluno.getNome();
		this.nota1 = aluno.getProvas().get(0).getNota();
		this.nota2 = aluno.getProvas().get(1).getNota();
		this.nota3 = aluno.getProvas().get(2).getNota();
		this.provaFinal = aluno.getProvas().get(3).getNota();
		this.provaEspecial = aluno.getProvas().get(4).getNota();
		this.media = aluno.getBoletim().getMedia();
		this.situacao = aluno.getBoletim().getSituacao();
		this.provas = aluno.getProvas();
		this.boletim = aluno.getBoletim();
		this.notaVencedor = aluno.getBoletim()
				.getNotaTotal(aluno.getProvas());
	}

	public List<Prova> getProvas() {
		return provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getProvaFinal() {
		return provaFinal;
	}

	public void setProvaFinal(double provaFinal) {
		this.provaFinal = provaFinal;
	}

	public double getProvaEspecial() {
		return provaEspecial;
	}

	public void setProvaEspecial(double provaEspecial) {
		this.provaEspecial = provaEspecial;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public SituacaoBoletimEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBoletimEnum situacao) {
		this.situacao = situacao;
	}

	public Boletim getBoletim() {
		return boletim;
	}

	public void setBoletim(Boletim boletim) {
		this.boletim = boletim;
	}

	public double getNotaVencedor() {
		return notaVencedor;
	}

	public void setNotaVencedor(double notaVencedor) {
		this.notaVencedor = notaVencedor;
	}

	@Override
	public String toString() {
		return "AlunoDTO [nome=" + nome + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", nota3=" + nota3 + ", provaFinal=" + provaFinal
				+ ", provaEspecial=" + provaEspecial + ", media=" + media
				+ ", situacao=" + situacao + "]";
	}

}
