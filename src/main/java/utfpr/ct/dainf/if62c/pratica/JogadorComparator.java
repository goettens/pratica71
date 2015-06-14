/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Guilherme
 */
public class JogadorComparator implements Comparator<Jogador>{

    public boolean crescente;
    public boolean alfa_cres;
    public boolean num_cres;

    public JogadorComparator() {
        this.crescente = true;
        this.alfa_cres = true;
        this.num_cres = true;
    }

    public JogadorComparator(boolean crescente, boolean alfabetico, boolean numerico) {
        this.crescente = crescente;
        this.alfa_cres = alfabetico;
        this.num_cres = numerico;
    }
    private int comparaNumeros(Jogador o1, Jogador o2){
        if (o1.compareTo(o2) < 0){
            if(!num_cres){
                return 1;
            }
            else{
                return -1;
            }           
        }
        else if(o1.compareTo(o2) > 0){
            if(num_cres){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return 0;
        } 
    }
    private int comparaString(Jogador o1, Jogador o2){
        if (o1.nome.compareTo(o2.nome) < 0){
            if(!alfa_cres){
                return 1;
            }
            else{
                return -1;
            }           
        }
        else if(o1.nome.compareTo(o2.nome) > 0){
            if(alfa_cres){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return 0;
        } 
    }
    
    @Override
    public int compare(Jogador o1, Jogador o2) {
        if(o1.nome.equals(o2.nome) && o1.compareTo(o2) == 0){
            return 0;
        }
        else if(crescente == true){
            if (o1.compareTo(o2)!=0){
                return comparaNumeros(o1, o2);
            }
            else{
                return comparaString(o1, o2);
            }
        }
        else{
            if (o1.nome.equals(o2.nome)){
                return comparaNumeros(o1, o2);
            }
            else{
                return comparaString(o1, o2);
            }
        }
    }
}
