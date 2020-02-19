/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomeinvertido;
import java.util.Scanner;

/**
 *
 * @author 082170029
 */
public class NomeInvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        System.out.println(Inverte(palavra));
    }
    
    private static String Inverte(String palavra){
        String resposta = "";
        
        for (int i = 0; i < palavra.length(); i++){
            resposta = palavra.charAt(i) + resposta;
        }
        
        return resposta;
    }
    
}
