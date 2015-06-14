
import java.util.Collections;
import java.util.List;
import utfpr.ct.dainf.if62c.pratica.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
        Time time = new Time();
        
        time.addJogador("Meio Campo", new Jogador(8,"Bogado"));
        time.addJogador("Zagueiro", new Jogador(7,"Maziero"));
        time.addJogador("Atacante", new Jogador(11,"Nadia"));        
        time.addJogador("Zagueiro", new Jogador(1,"Bogdan"));
        time.addJogador("Meio Campo", new Jogador(9,"Borsato"));
        time.addJogador("Atacante", new Jogador(10,"Robson"));
        
        List<Jogador> ordenados = time.ordena(new JogadorComparator(true, true, false));
        
        System.out.println(ordenados);
        System.out.println(Collections.binarySearch(ordenados, new Jogador(8, "Bogdan")));
    }
}
