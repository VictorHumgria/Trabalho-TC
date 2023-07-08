/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testexml;
import AutomatoG3.DocumentoXML;
import AutomatoG3.Automato;

/**
 *
 * @author Victor
 */

public class TesteXML {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
            Automato auto1 = new Automato(); //objeto da classe automato para identificar o autômato 1 do primeiro arquivo XML
            Automato auto2 = new Automato(); //objeto da classe automato para identificar o autômato 2 do segundo arquivo XML
            auto1.setLocalArquivo("C:\\Users\\Usuario\\Desktop\\Teste.jff"); //caminho definido para o primeiro arquivo contendo o primeiro autômato através do método "setLocalArquivo()"
            auto2.setLocalArquivo("C:\\Users\\Usuario\\Desktop\\Teste2.jff"); //caminho definido para o segundo arquivo contendo o segundo autômato "setLocalArquivo()"
            
            DocumentoXML doc = new DocumentoXML(); //objeto doc criado da classe "DocumentoXML"
            doc.concatenacao(auto1, auto2,"C:\\Users\\Usuario\\Desktop\\concatenacao.jff"); //chama o método concatenacao() passando os parâmetros de "auto1" e "auto2" e o caminho de saída para o novo arquivo já concatenado.        
    }    
}
 

 
