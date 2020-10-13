package classes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro Marques");
		aluno.setIdade(26);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("12345");
		diretor.setIdade(50);
				
		Secretario secretario = new Secretario();
		secretario.setExperiencia("ti");
		secretario.setIdade(30);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

	}

}
