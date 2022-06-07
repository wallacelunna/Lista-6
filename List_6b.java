package List_6;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class List_6b {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//Path dir = Paths.get("C:", "teste");
	
		String nome= "";
		int i,op=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
		
		System.out.println("1- Definir caminho e nome de Arquivo TXT para gravação");
		System.out.println("2- Cadastrar Projeto 2- Cadastrar Projeto");
		System.out.println("3- Abrir Arquivo do Projeto");
		System.out.println("4- Sair");
		op=ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Informe nome e caminho do arquivo para gravação.");
				nome=ler.next();
			break;
			case 2:
				List_6a.escritor(nome);
			break;	
			case 3:
				List_6a.leitor(nome);
			break;	
			case 4:
				
			break;	
		}
		
		
		}while(op!=4);
		//String path = "AulaLP.txt";
		Path dir = Paths.get("C:", "teste");

		
		Path path = dir.resolve("AulaLP.doc");
		
		System.out.println(path);
		//ManipuladorArquivo.escritor(path.toString());
		List_6a.leitor(path.toString());

	}

}
