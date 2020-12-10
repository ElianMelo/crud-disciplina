package principal.cruddisciplina.dominio;

public class Disciplina {
	private Integer id;
	private String nome;
	private String professor;
	private Integer periodo;
	private String codigo;
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(Integer id, String nome, String professor, Integer periodo, String codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.professor = professor;
		this.periodo = periodo;
		this.codigo = codigo;
	}
	
	public Disciplina(String nome, String professor, Integer periodo, String codigo) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.periodo = periodo;
		this.codigo = codigo;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public Integer getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
