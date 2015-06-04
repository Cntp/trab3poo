package trab3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Usuario extends Biblioteca {
	
	String Nome;
	int numEmprestimos; //Numero de Emprestimos feitos ate o momento
	int diasComLivro;
	boolean Atrasado;
	int ID; //Numero da pessoa dentro do Sistema
	int[] CodLivros; //Codigos dos livros emprestados
	String Tipo;
	
	
	int TMax;//Tempo maximo que o usuario pode ficar com o livro
	int NMax;//Numero maximo de emprestimos que o usuario pode fazer
	
	public void Cadastrar_Usuario(Usuario A) throws IOException{
		String [] Infos;
		Infos = new String[5];
		


		Infos = new String[5];
		
		String [] Prints;
		Prints = new String[4];
		
		Prints[0] = "Nome:" ;
		Prints[1] = "Tipo(Aluno, Professor, Comum):" ;
	

		BufferedReader BufTexto = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int j = 0; j < 2;j++){
			System.out.println(Prints[j]);
			Infos[j] = BufTexto.readLine();//Atrasado (Boolean)
		}
		
		A = new Usuario();
		A.Nome = Infos[0];
		A.Tipo = Infos[1];
		
		if(Infos[1] == "Professor") A.numEmprestimos =6;
		else if(Infos[1] == "Aluno") A.numEmprestimos =4;
		else  A.numEmprestimos = 2;
		
		A.ID = 0;
		
		if(Infos[1] == "Professor") A.diasComLivro = 60;
		else if(Infos[1] == "Aluno") A.diasComLivro = 15;
		else  A.diasComLivro = 15;
		
	} //Cadastra o usuario no Arq
	
	public static Usuario[] Load() throws Exception{
		
		Usuario[] A;
		A = new Usuario[3];
		String csvFilename = "USUARIO.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		String[] row = null;
	
		while((row = csvReader.readNext()) != null) {
			
			
			int i = 0;
		    A[i] = new Professores();
		    
		    A[i].Nome=row[0];
		  
		    A[i].Tipo=row[1];
		    A[i].numEmprestimos=Integer.parseInt(row[2]);
		    A[i].ID=Integer.parseInt(row[3]);
		    i++;
		    
		    
		}
		//...
		csvReader.close();
		
		
		return A;
	}
	
	public Usuario(){
		
	}
	

}
