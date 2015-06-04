package trab3;

import java.io.*;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Texto extends Livro  { //Este tipo de livro so pode ser emprestado por profs e alunos
	public void Cadastrar_Livro(Livro NovoLivro) throws Exception {
		// TODO Auto-generated method stub
		
		//NovoLivro = new Livro();
		
		String [] Infos;
		Infos = new String[5];
		
		String [] Prints;
		Prints = new String[4];
		
		Prints[0] = "Digite o título do livro" ;
		Prints[1] = "Digite o nome do autor" ;
		Prints[2] = "Digite a quantidade de exemplares, disponíveis e alugados, deste livro" ;
		Prints[3] = "Digite a quantidade de exemplares disponíveis" ;
		

		BufferedReader BufTexto = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int j = 0; j < 4;j++){
			System.out.println(Prints[j]);
			Infos[j] = BufTexto.readLine();//Atrasado (Boolean)
		}
		
		
		NovoLivro.Titulo = Infos[0];
		NovoLivro.Autor = Infos[1];
		NovoLivro.Quantidade = Integer.parseInt(Infos[2]);
		NovoLivro.Disponiveis = Integer.parseInt(Infos[3]);
		
		System.out.println(NovoLivro.Titulo);
		System.out.println(NovoLivro.Autor);
		System.out.println(NovoLivro.Quantidade);
		System.out.println(NovoLivro.Disponiveis);

		
		
	}
	
	public Texto(){
		//super(Titulo, Autor, Quantidade, Disponiveis);
		
	}
}