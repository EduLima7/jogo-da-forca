/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Random;
/**
 *
 * @author Notebook
 */
public class Jogo {
    public static void main(String[] args) throws IOException {
        jogar jogo =new jogar();
        jogo.jogo(3,1);
    }
}
class jogar{
    String[] opcoes = {"Paises", "Marcas Famosas","Carros"};
    Object resposta;
    void jogando(){
        
    }
    String[] jogo(int classe,int dif)throws IOException{
        String s=palavraaleatoria(classealeatoria(classe));
        String palavra[]=s.split(" dica ");
        palavra[0]=palavra[0].toLowerCase();
        char vet[]=palavra[0].toCharArray();
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
        }
        System.out.println(" Dica: "+palavra[1]);
        return palavra;
    }
    String getDica(String[] palavra){
          return palavra[1];    
    }
    char[] tochar(String[] palavra){
        char vet[]=palavra[0].toCharArray();
        return vet;
    }
    void gravarnovodado()throws IOException{
        String s=JOptionPane.showInputDialog("Digite o nome do novo objeto");
        String c=Resposta();
        gravardado(s,c);
    }
    void gravardado(String nome,String Class) throws IOException{ 
        if(encontrarpalavra(nome,Class)){
                FileWriter arq = new FileWriter("C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\"+Class,true);
                BufferedWriter gravArq = new BufferedWriter(arq);
                gravArq.newLine();
                gravArq.write(nome);
                gravArq.close();
                arq.close();
            }
    }
    boolean encontrarpalavra(String nome,String Class)throws IOException{
        FileReader ler = new FileReader("C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\"+Class);
        BufferedReader ler2=new BufferedReader(ler);
        String linha = ler2.readLine();
        System.out.println("while");
        boolean a=true;
        while (linha!=null && a){
            if (linha.contains(nome)){
                System.out.println("No loop");
                a=false;
            }
            linha=ler2.readLine();
        }
        ler2.close();
        ler.close();
        return a;
    }
    String Resposta(){
        resposta = JOptionPane.showInputDialog(null, "Qual classe o objeto pertence?", "Escolha", JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
            if (resposta == "Paises") {
                return "Paises.txt";
            }
            return null;
    }
    String classealeatoria(int i){
        if(i==5){
            Random random = new Random();
            int num = random.nextInt(3)+1;
            switch(num){
                case 1:
                    return "Paises.txt";
                case 2:
                    return "Carros.txt";
                case 3:
                    return "Marcas Famosas.txt";
            }
        }
        else{
            switch(i){
                case 1:
                    return "Paises.txt";
                case 2:
                    return "Carros.txt";
                case 3:
                    return "Marcas Famosas.txt";
            }
        }
        return null;
    }
    String palavraaleatoria(String classe) throws IOException{
        File lerf = new File("C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\"+classe);
        LineNumberReader linhaLer = new LineNumberReader(new FileReader (lerf));
        linhaLer.skip(lerf.length());
        int qtdLinha = linhaLer.getLineNumber();
        Random random = new Random();
        int num = random.nextInt(qtdLinha)+1;
        BufferedReader ler=new BufferedReader(new FileReader (lerf));
        String linha = null;
        for (int i = 0; i < num; i++) {
            linha = ler.readLine();
        }
        ler.close();
        linhaLer.close();
        return linha;
    }
}