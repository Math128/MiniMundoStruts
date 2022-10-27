package br.com.minimundo.model;

import java.util.List;

import br.com.minimundo.enums.SituacaoBoletimEnum;
import br.com.minimundo.enums.TipoProvaEnum;

public class Boletim {

	private double media;
	private SituacaoBoletimEnum situacao;

	public Boletim() {

	}

	public double calcularMedia(List<Prova> provas) {
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1) {
				this.media += prova.getNota();
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA2) {
				this.media += prova.getNota() * 1.2;
			}
			if (prova.getTipo() == TipoProvaEnum.PROVA3) {
				this.media = (this.media + prova.getNota() * 1.4) / 3.6;
			}
		}
		return this.media;
	}

	public SituacaoBoletimEnum verificarSituacao(double media) {
		if (media >= 6) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else if (media < 6 && media >= 4) {
			this.situacao = SituacaoBoletimEnum.RECUPERACAO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
		return this.situacao;
	}

	public void aplicarProvaFinal(SituacaoBoletimEnum situacao, Aluno aluno,
			double nota) {
		if (situacao.equals(SituacaoBoletimEnum.RECUPERACAO)) {
			double nota1 = Math.random() * (7 - 3) + 3;
			aluno.getProvas().get(3).setNota(nota1);
			this.media = (this.media + nota1) / 2;
		}
		if (this.media >= 5) {
			this.situacao = SituacaoBoletimEnum.APROVADO;
		} else {
			this.situacao = SituacaoBoletimEnum.REPROVADO;
		}
	}

	public double getNotaTotal(List<Prova> provas) {
		double notaTotal = 0.0;
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1
					|| prova.getTipo() == TipoProvaEnum.PROVA2
					|| prova.getTipo() == TipoProvaEnum.PROVA3
					|| prova.getTipo() == TipoProvaEnum.PROVAFINAL) {
				notaTotal += prova.getNota();
			}
			if (prova.getTipo() == TipoProvaEnum.PROVAESPECIAL) {
				notaTotal += prova.getNota() * 2.0;
				notaTotal = notaTotal / 5.0;
			}
		}
		return notaTotal;
	}

	public Boletim criarBoletim(Aluno aluno) {
		return null;
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

	@Override
	public String toString() {
		return "Boletim [media=" + media + "]";
	}

}
