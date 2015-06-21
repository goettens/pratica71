
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica71 {
    public static void main(String[] args) {
        List<Jogador> t1 = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        int numero;
        int qtd = -1;
        String nome;
        
        System.out.println("Quantos jogadores deseja inserir?");
        
        while(true){
            if(entrada.hasNextInt()){
                qtd = entrada.nextInt();
                break;
            }
            else{
                entrada.next();
                System.out.println("INVALIDO - DIGITE NOVAMENTE");
            }
        }
        
        for(int i = 0 ; i<qtd ; i++){
            System.out.println("Digite o numero do jogador:");
            if(entrada.hasNextInt()){
                numero = entrada.nextInt();
            }
            else{
                while(true){
                    System.out.println("INVALIDO - DIGITE NOVAMENTE");
                    entrada.next();
                    if(entrada.hasNextInt()){
                        numero = entrada.nextInt();
                        break;
                    }
                }
            }
            
            System.out.println("Digite o nome do jogador:");
            nome = entrada.next();
            t1.add(new Jogador(numero, nome));            
        }
        
        Collections.sort(t1, new JogadorComparator(true, true, false));
        
        for(Jogador j : t1){
            System.out.println(j.toString());
        }
        
        while(true){
            System.out.println("Digite o NUMERO do jogador caso queira inserir e 0 pra sair:");
            if (entrada.hasNextInt()){
                numero = entrada.nextInt();
                if(numero == 0){
                    break;
                }
                else{
                    System.out.println("Digite o NOME do jogador:");
                    nome = entrada.next();
                    t1.add(new Jogador(numero,nome));
                }
            }
            else{
                System.out.println("NUMERO INVALIODO");
                entrada.next();
            }
            
            Collections.sort(t1, new JogadorComparator(true,true,false));
            
            for(Jogador j : t1){
                System.out.println(j.toString());
            }
        }
    
    
    }
}
