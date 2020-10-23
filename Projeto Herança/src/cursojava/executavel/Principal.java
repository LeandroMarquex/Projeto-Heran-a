package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classeauxiliar.FuncaoAutenticacao;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");
		
	//	FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
						
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro Marques");
		aluno.setIdade(26);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("12345");
		diretor.setIdade(50);
				
		Secretario secretario = new Secretario();
//		secretario.setLogin(login);
	//	secretario.setSenha(senha);
		
//		PermitirAcesso secretariopa = new Secretario(login, senha);
	
	
		
	//	if (secretariopa.autenticar(login, senha)) {
	//  if (new Secretario().autenticar(login, senha)) {
	//	if (secretariopa.autenticar(login, senha)) {
	//	if (autenticacao.autenticarCursoJava(secretariopa)) {
		if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar() ||
		 new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()){ // travou autentica��o secretario
			JOptionPane.showConfirmDialog(null, "Acesso efetuado com SUCESSO");
		}else {
			JOptionPane.showConfirmDialog(null, "LOGIN ou USUARIO inv�lidos");
		}
		secretario.setExperiencia("ti");
		secretario.setIdade(30);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println(" Salario Aluno: " + aluno.salario());
		System.out.println(" Salario Diretor: " + diretor.salario());
		System.out.println(" Salario Secretario: " + secretario.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
	}
	
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = "
				+ pessoa.getNome() + " e o salario � de = " + pessoa.salario());
	}

}
