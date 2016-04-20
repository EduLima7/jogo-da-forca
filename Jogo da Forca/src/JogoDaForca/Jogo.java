/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;


import javax.swing.JOptionPane;
import java.io.*;
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
    
    //Função que verifica se o jogador ganhou ou não
    boolean checarVitoria(){
        
        //Inicializa as variaveis
        boolean a=false;
        int b=0;
        
        //Varre uma String do tipo bolleana, incrementando a variavel b quando for '1'.
        for (int i = 0; i < acertos.length; i++) {
            if (acertos[i]) {
                b++;
            }
        }
        
        //Verifica se o jogador já terminou o jogo, se sim 'a' passa a ser true
        if (b==acertos.length) {
            a=true;
        }
        return a;
    }
    
    String jogando(char letra,char[] palavra){
        boolean s=true;
        if (lifes!=0){//Se ainda tiver vidas passa
            
            //Loop que verifica se a letra escolhida esta na String que representa a palavra e seta para true caso verdadeiro
            for (int i = 0; i < palavra.length; i++) {
                if (letra==palavra[i]) {
                    acertos[i]=true;
                    s=false;
                }
            }
            
            //Se ele tiver errado perde uma vida.
            if(s){
                    System.out.println(lifes);
                    lifes--;
            }
            //Reporna uma string de bolleans com as possições acertadas e a palavra
            return palavraatualizada(acertos, palavra);
        }
        //?????
        return "Você esta trapaceando?";
    }
    
    
    String palavraatualizada(boolean[] hits,char[] palavra){
        String newword="";
        //Novo tipo char com o tamanho da palavra
        char palavraatualizada[] = new char [palavra.length];
        
        //Neste loop, ele verifica a possição do acerto e substitui pela letra correspondente, caso contrario coloca um '_'
        for (int i = 0; i < palavra.length; i++) {
            if(hits[i]){
                newword=newword+" "+palavra[i];
            }
            else{
                newword=newword+"_ ";
            }
        }
        //Quando termina o loop envia a nova palavra com suas substituições
        return newword;
    }
    
    
    String[] jogo(int classe,int dif)throws IOException{
        
        //Pega uma palavra aleatoria
        String s=palavraaleatoria(classealeatoria(classe));
        
        //Divide a palavra e a dica pela divisão "dica"
        String palavra[]=s.split(" dica ");
        
        //Verifica a dificuldade
        dificuldade=dif;
        
        //Se dificuldade 1 -> 5 vidas
        if(dif==1){
            lifes=5;
        }
        //Se dificuldade 2 -> Não tem a dica da palavra e tem 5 vidas
        if(dif==2){
            palavra[1]="Dica não acessivel nessa dificuldade";
            lifes=5;
        }
        
        //Se dificuldade 3 -> Não tem dica da palavra e tem 3 vidas
        if(dif==3){
            palavra[1]="Dica não acessivel nessa dificuldade";
            lifes=3;
        }
        
        //Tratamento das palavras
        palavra[0]=palavra[0].toLowerCase(); // deixa a palavra com caixa baixa
        palavra[0]=Normalizer.normalize(palavra[0],Normalizer.Form.NFD); // retira os acentos da palavra
        
        //Converte a string em um array do tipo char
        char vet[]=palavra[0].toCharArray();
        
        //Printa no console a palavra
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i]);
        }
        
        //Printa no console as dicas e vidas
        System.out.println(" Dica: "+palavra[1]);
        System.out.println(lifes);
        return palavra;
    }
    
    String getDica(String[] palavra){
          return palavra[1];    
    }
    
    //Retorna a palavra selecionada como um array do tipo char
    char[] tochar(String[] palavra){
        char vet[]=palavra[0].toCharArray();
        return vet;
    }
    
    //Pega a palavra a ser gravada em um arquivo
    void gravarnovodado()throws IOException{
        String s=JOptionPane.showInputDialog("Digite o nome do novo objeto");
        String c=Resposta();
        String d=JOptionPane.showInputDialog("Dica da nova palavra(Ex: É inglesa,fabrica roupas,...)");
        gravardado(s,c,d);
    }
    
    String diretorio() {
        String director = "";
		try {
			//System.out.println("/  -> " + new File("/").getCanonicalPath());
			//System.out.println(".. -> " + new File("..").getCanonicalPath());
			director =  (new File(".").getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
        return director;
    }
    
    String diretorio = (diretorio()+"/Banco/");
    //String diretorio = "C:\\Users\\Notebook\\Documents\\NetBeansProjects\\Jogo da Forca\\Banco\\";

    //Pega a palavra e guarda no arquivo
    void gravardado(String nome,String Class,String dica) throws IOException{ 
        if(encontrarpalavra(nome,Class)){
                FileWriter arq = new FileWriter(diretorio+Class,true);
                BufferedWriter gravArq = new BufferedWriter(arq);
                gravArq.newLine();
                gravArq.write(nome+" dica "+dica);
                gravArq.close();
                arq.close();
                JOptionPane.showMessageDialog(null, "Palavra "+nome+" adicionada com sucesso em "+Class);
            }else{
            JOptionPane.showMessageDialog(null, "Palavra "+nome+" ja foi adicionada em "+Class);
        }
    }
    
    boolean encontrarpalavra(String nome,String Class)throws IOException{
        FileReader ler = new FileReader(diretorio+Class);
        BufferedReader ler2=new BufferedReader(ler);
        String linha = ler2.readLine();
        boolean a=true;
        
        //Loop que verifica de linha em linha se já existe a palavra no aruqivo
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
    
    //Retorna a categoria das palavras
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
    
    //Escolhe uma categoria aleatoria caso 5 ou escolhe sua categoria de 1 a 4
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
    
    //????
    String palavraaleatoria(String classe) throws IOException{
        File lerf = new File(diretorio+classe);
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
    
    //???
    int[] novamente(){
        int[] dados=new int [2];
        String[] options = {"Paises", "Marcas Famosas","Carros","Times de Futebol","Aleatorio"};
        Object resp = JOptionPane.showInputDialog(null, "Qual classe o objeto pertence?", "Escolha", JOptionPane.QUESTION_MESSAGE, null, options, null);
            if (resp == "Paises") {
                dados[0]=1;
            }
            if (resp == "Carros") {
                dados[0]=2;
            }
            if (resp == "Times de Futebol") {
                dados[0]=4;
            }
            if (resp == "Marcas Famosas") {
                dados[0]=3;
            }
            if(resp=="Aleatorio"){
                dados[0]=5;
            }
            String[] options1 = {"Facil", "Medio","Dificil"};
            resp = JOptionPane.showInputDialog(null, "Qual classe o objeto pertence?", "Escolha", JOptionPane.QUESTION_MESSAGE, null, options1, null);
            if (resp == "Facil") {
                dados[1]=1;
            }
            if (resp == "Medio") {
                dados[1]=2;
            }
            if (resp == "Dificil") {
                dados[1]=3;
            }
            return dados;
    }
}