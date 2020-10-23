import java.util.Scanner;

public class Curso {
	public Scanner Leitor = new Scanner(System.in);
	public String NomeDoCurso;
	public float Nota1;
	public float Nota2;
	public float Nota3;
	public float Nota4;
	public float Media;

	public void GravaNomeCurso() {
		System.out.println("Digite Nota1: ");
		NomeDoCurso = Leitor.next();
	}

	public void RecebeNotas() {
		System.out.println("Digite Nota1: ");
		Nota1 = (float) Leitor.nextDouble();
		System.out.println("Digite Nota2: ");
		Nota2 = (float) Leitor.nextDouble();
		System.out.println("Digite Nota3: ");
		Nota3 = (float) Leitor.nextDouble();
		System.out.println("Digite Nota4: ");
		Nota4 = (float) Leitor.nextDouble();
	}

	public void CalculaMedia() {
		Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		System.out.println("Sua média é: " + Media);
	}

}
