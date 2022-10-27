package br.com.minimundo.comparator;

import java.util.Comparator;

import br.com.minimundo.model.Aluno;

public class NotaComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a2.getBoletim().getMedia(), a1.getBoletim().getMedia());
	}

}
