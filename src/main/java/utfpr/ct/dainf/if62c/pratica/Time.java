/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Time {
    private HashMap <String,Jogador> jogadores;

    public Time() {
        jogadores = new HashMap<>();
    }
    

    public HashMap<String, Jogador> getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String s, Jogador j){
        this.jogadores.put(s, j);
    }
    
    public List<Jogador> ordena(JogadorComparator o1){
        List<Jogador> ordenada = new LinkedList<>(this.getJogadores().values());
        
        Collections.sort(ordenada, o1);
        return ordenada;
    }

    
}
