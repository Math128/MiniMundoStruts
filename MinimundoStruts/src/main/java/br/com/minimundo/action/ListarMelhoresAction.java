package br.com.minimundo.action;

import java.util.List;

import br.com.minimundo.converter.Converter;
import br.com.minimundo.db.AlunoDB;
import br.com.minimundo.dto.AlunoDTO;
import br.com.minimundo.model.Aluno;
import br.com.minimundo.model.Competicao;

import com.opensymphony.xwork2.ActionSupport;

public class ListarMelhoresAction extends ActionSupport {

	private static final long serialVersionUID = 299389589246361826L;

	private List<AlunoDTO> alunosSelecionados = null;
	private AlunoDTO alunoDTO = null;
	private List<Aluno> alunos = AlunoDB.getAll();

	public AlunoDTO getAlunoDTO() {
		return alunoDTO;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void setAlunoDTO(AlunoDTO alunoDTO) {
		this.alunoDTO = alunoDTO;
	}

	public List<AlunoDTO> getAlunosSelecionados() {
		return alunosSelecionados;
	}

	public void setAlunosSelecionados(List<AlunoDTO> alunosSelecionados) {
		this.alunosSelecionados = alunosSelecionados;
	}

	public String execute() {
		this.alunos = Competicao.selecionarOsMelhores(alunos);
		this.alunosSelecionados = Converter.converterToListAlunoDTO(Competicao
				.aplicarProvaEspecial(alunos));
		return SUCCESS;
	}

	public String vencedor() {
		this.alunoDTO = Converter.converterToAlunoDTO(Competicao.verificarVencedor(alunos));
		return SUCCESS;
	}

}
