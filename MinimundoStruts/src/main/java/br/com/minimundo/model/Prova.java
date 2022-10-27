package br.com.minimundo.model;

import br.com.minimundo.enums.TipoProvaEnum;

public class Prova {

	private double nota;
	private TipoProvaEnum tipo;

	public Prova(double nota, TipoProvaEnum tipo) {
		this.nota = nota;
		this.tipo = tipo;
	}
	
	public Prova criarProva() {
		return null;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public TipoProvaEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoProvaEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Prova [nota=" + nota + ", tipo=" + tipo + "]";
	}
	
	

}
