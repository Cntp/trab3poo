package trab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Livro extends Biblioteca {
	String Titulo;
	String Autor; 
	int Quantidade; //Qntd disponivel desse livro
	int Disponiveis;
	int Cod; //Codigo para identificacao
	
	public void Cadastrar_Livro(Livro NovoLivro) throws Exception {
		// TODO Auto-generated method stub
		
		
		
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
		Infos[4] = "Texto";

		
		
	}
	
	
	public Livro(){}
	
}
