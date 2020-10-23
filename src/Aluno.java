import java.util.Scanner;

public class Aluno extends Curso {
	public Scanner Leitor = new Scanner(System.in);
	public String Nome;
	public int Idade;

	public Aluno() {
		RecebeNome();
		RecebeIdade();
		GravaNomeCurso();
		RecebeNotas();
		CalculaMedia();
	}

	public void RecebeNome() {
		System.out.println("Nome do Aluno: ");
		Nome = Leitor.next();
	}

	public void RecebeIdade() {
		System.out.println("Idade: ");
		Idade = (int) Leitor.nextInt();
	}

}
