package Teste;

public class Medico {

	String nome;
	String especialidade;
	String codigo;

	}
	
class Enfermeiro extends Medico {
    String setor;
    String nome;
    String codigo;
        
    }

class Paciente extends Medico {
    String sintoma;
    String nome;
    String idade;
}

class Consulta extends Medico {
    Paciente paciente;
    String data;
    String exame;
}