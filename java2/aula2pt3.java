package aula2;

public class Principal {

    public static void main(String[] arges) {

        //CRIAR UM OBJETO DA CLASSE ALUNOS
        aula.Alunos aluno2 = new aula.alunos();
        
        aluno2.setRa(50);
        aluno2.setNome("Carlos");
        aluno2.setEmail("Carlos@gmail.com");
        aluno2.setStatus("Aprovado");

        aluno2.MostrarDados();
    }

}