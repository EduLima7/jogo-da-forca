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
import java.text.Normalizer;
import java.util.Arrays;
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
    String[] opcoes = {"Paises", "Marcas Famosas","Carros","Times de Futebol"};
    boolean[] acertos;
    Object resposta;
    int dificuldade=1,lifes=5;
    void verificarvida(){
        if(lifes==0){
            
        }
    }
    String jogando(char letra,char[] palavra){
        boolean s=true;
        if (lifes!=0){
            for (int i = 0; i < palavra.length; i++) {
                if (letra==palavra[i]) {
                    acertos[i]=true;
                    s=false;
                }
                if(s){
                    lifes--;
                }
            }
            return palavraatualizada(acertos, palavra);
        }
        return "Você esta trapaceando?";
    }
    String palavraatualizada(boolean[] hits,char[] palavra){
        String newword;
        char palavraatualizada[] = new char [palavra.length];
        for (int i = 0; i < palavra.length; i++) {
            if(hits[i]){
                palavraatualizada[i]=palavra[i];
            }
            else{
                palavraatualizada[i]='_';
            }
        }
        newword=Arrays.toString(palavraatualizada);
        return newword;
    }
    String[] jogo(int classe,int dif)throws IOException{
        String s=palavraaleatoria(classealeatoria(classe));
        String palavra[]=s.split(" dica ");
        dificuldade=dif;
        if(dif==2){
            palavra[1]="Dica não acessivel nessa dificuldade";
        }
        if(dif==3){
            palavra[1]="Dica não acessivel nessa dificuldade";
            lifes=3;
        }
        palavra[0]=palavra[0].toLowerCase(); // deixa a palavra com caixa baixa
        palavra[0]=Normalizer.normalize(palavra[0],Normalizer.Form.NFD); // retira os acentos da palavra
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
        String d=JOptionPane.showInputDialog("Dica da nova palavra(Ex: É inglesa,fabrica roupas,...)");
        gravardado(s,c,d);
    }
    void gravardado(String nome,String Class,String dica) throws IOException{ 
        if(encontrarpalavra(nome,Class)){
                FileWriter arq = new FileWriter("C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\"+Class,true);
                BufferedWriter gravArq = new BufferedWriter(arq);
                gravArq.newLine();
                gravArq.write(nome+" dica "+dica);
                gravArq.close();
                arq.close();
            }
    }
    boolean encontrarpalavra(String nome,String Class)throws IOException{
        FileReader ler = new FileReader("C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\"+Class);
        BufferedReader ler2=new BufferedReader(ler);
        String linha = ler2.readLine();
        boolean a=true;
        while (linha!=null && a){
            if (linha.contains(nome)){
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
            if (resposta == "Carros") {
                return "Carros.txt";
            }
            if (resposta == "Times de Futebol") {
                return "Times de Futebol.txt";
            }
            if (resposta == "Marcas Famosas") {
                return "Marcas Famosas.txt";
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
                case 4:
                    return "Times de Futebol.txt";
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
                case 4:
                    return "Times de Futebol.txt";
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