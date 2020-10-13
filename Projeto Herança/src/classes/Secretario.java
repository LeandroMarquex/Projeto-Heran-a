package classes;

public class Secretario extends Pessoa {
	
	private String reistro;
	private String nivelCargo;
	private String experiencia;
	
	public String getReistro() {
		return reistro;
	}
	public void setReistro(String reistro) {
		this.reistro = reistro;
	}
	
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [reistro=" + reistro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroCpf="
				+ numeroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	
	

}
