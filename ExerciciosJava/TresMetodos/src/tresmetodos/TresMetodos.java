/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresmetodos;
import java.util.Scanner;

/**
 *
 * @author 082170029
 */
public class TresMetodos {

    /**
     * @param args the command line arguments
     * Criar três métodos, um para mostrar a última letra de um caractere,
     * outro para substituir um caractere por um outro informado e outro método 
     * para retornar as iniciais do texto
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        
        System.out.println("Informe o caractere que será substituído: ");
        String caractereOriginal = scanner.nextLine();
        
        System.out.println("Informe o caractere de substituição: ");
        String caractereSubstituicao = scanner.nextLine();
        
        UltimaLetra(texto);
        TrocarCaractere(texto, caractereOriginal, caractereSubstituicao);
        Iniciais(texto);
    }

    private static void UltimaLetra(String texto) {
        String retorno = "Ultima letra do texto: " + texto.charAt(texto.length() - 1);
        System.out.println(retorno);
    }

    private static void TrocarCaractere(String texto, String caractereOriginal, String caractereSubstituicao) {
        String troca = "";
        
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == caractereOriginal.charAt(0)){
                troca = troca + caractereSubstituicao.charAt(0);
            }
            else{
                troca = troca + texto.charAt(i);
            }
        }
        System.out.println("Texto trocando " + caractereOriginal.charAt(0) + " para " + caractereSubstituicao.charAt(0) + ": " + troca);
    }
    
    private static void Iniciais(String texto){
        
    }
}
