package beans;

public class Exercicio {
	
	private Integer id;
	private String descricao;
	private Integer serie;
	private Integer repeticoes;
	private Integer carga;
	private String observacao;
	private GrupoMuscular grupoMuscular;
	
	public Exercicio() {
		
	}
	
	public Exercicio(Integer id, String descricao, Integer serie, Integer repeticoes, Integer carga, String observacao, GrupoMuscular grupoMuscular) {
		this.id = id;
		this.descricao = descricao;
		this.serie = serie;
		this.repeticoes = repeticoes;
		this.carga = carga;
		this.observacao = observacao;
		this.grupoMuscular = grupoMuscular;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getSerie() {
		return serie;
	}
	
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	
	public Integer getRepeticoes() {
		return repeticoes;
	}
	
	public void setRepeticoes(Integer repeticoes) {
		this.repeticoes = repeticoes;
	}
	
	public Integer getCarga() {
		return carga;
	}
	
	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}
	
	public String toString() {
		String message = "--- Exercício N° "+ this.id +" --- \n" +
				"Descrição: "+ this.descricao + "\n" +
				"Série: "+ this.serie + "\n" +
				"Repetições: "+ this.repeticoes + "\n" +
				"Carga: "+ this.carga + "\n" +
				"Observacao: "+ this.observacao + "\n" +
				this.grupoMuscular;
		
		return message;
	}
}