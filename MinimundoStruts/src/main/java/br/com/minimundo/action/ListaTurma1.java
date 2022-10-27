package br.com.minimundo.action;

import java.util.List;

import br.com.minimundo.converter.Converter;
import br.com.minimundo.db.AlunoDB;
import br.com.minimundo.dto.AlunoDTO;

import com.opensymphony.xwork2.ActionSupport;

public class ListaTurma1 extends ActionSupport {

	private static final long serialVersionUID = 1789134549018038140L;
	
	List<AlunoDTO> alunosDTO = null;

	public List<AlunoDTO> getAlunosDTO() {
		return alunosDTO;
	}

	public void setAlunosDTO(List<AlunoDTO> alunosDTO) {
		this.alunosDTO = alunosDTO;
	}

	public String execute() {
		this.alunosDTO = Converter.converterToListAlunoDTO(AlunoDB.getAlunos1());
		return SUCCESS;
	}
}
