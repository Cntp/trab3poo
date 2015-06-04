package trab3;

import java.io.FileWriter;
import java.io.*;
import com.opencsv.CSVWriter;

public class Geral extends Livro{//este tipo de livro pode ser emprestado por todos
	public void Cadastrar_Livro(Livro NovoLivro) throws Exception {
		// TODO Auto-generated method stub
		
		NovoLivro = new Livro();
		
		String [] Infos;
		Infos = new String[5];
		
		String [] Prints;
		Prints = new String[4];
		
		Prints[0] = "Digite o título do livro" ;
		Prints[1] = "Digite o nome do autor" ;
		Prints[2] = "Digite a quantidade de exemplares, disponíveis e alugados, deste livro" ;
		Prints[3] = "Digite a quantidade de exemplares disponíveis" ;
		
		BufferedReader BufGeral = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int j = 0; j < 4;j++){
			System.out.println(Prints[j]);
			Infos[j] = BufGeral.readLine();//Atrasado (Boolean)
		}
		
		
		NovoLivro.Titulo = Infos[0];
		NovoLivro.Autor = Infos[1];
		NovoLivro.Quantidade = Integer.parseInt(Infos[2]);
		NovoLivro.Disponiveis = Integer.parseInt(Infos[3]);
		Infos[4] = "Texto";
		//Inputs

		
		
	}
	
	public Geral(){
		//super(Titulo, Autor, Quantidade, Disponiveis);
		
	}

}
