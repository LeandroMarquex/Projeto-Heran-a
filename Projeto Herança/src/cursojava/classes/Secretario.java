package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String reistro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	
	private String senha;
	
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
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Secretario [reistro=" + reistro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroCpf="
				+ numeroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.80 * 0.5;
	}
	
	/*Esse é o metodo do contrato de autenticação*/
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}
	
	

}
