package classes;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	private String disicplina;
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatricula() {
		return serieMatricula;
	}
	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}
	public String getDisicplina() {
		return disicplina;
	}
	public void setDisicplina(String disicplina) {
		this.disicplina = disicplina;
	}
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
				+ serieMatricula + ", disicplina=" + disicplina + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + "]";
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba aluno é maior de idade" : "vish vc é menor de idade";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.00;
	}

}
