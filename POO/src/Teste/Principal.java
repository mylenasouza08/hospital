package Teste;

public class Principal {

	public static void main(String[] args) {
		Medico medico = new Medico();
		
		
		medico.nome = "Gabriel Medeiros";
		medico.especialidade = "Cardiologista";
		medico.codigo = "010203";
		
		
		
		System.out.printf("A especialidade do médico é " + medico.especialidade);

	}

}