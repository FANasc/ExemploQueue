package one.innovation.digital;

import java.util.LinkedList;
import java.util.Queue;

/********************************************************************************
 *
 * Objetivo:  1) Criar uma fila.
 *            2) Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
 *            3) Navegue na lista exibindo cada nome no console.
 *            4) Retorne o primeiro item da fila sem removê-lo.
 *            5) Retorne o primeiro item da fila removendo o mesmo.
 *            6) Adicione o nome Daniel. Verifique a posição que o mesmo
 *               assumiu na fila.
 *            7) Retorne o tamanho da fila.
 *            8) Verifique se a lista está vazia.
 *            9) Verifique se o nome Carlos está na fila.
 * Autor   : Fernando Aguiar
 * Data    : 01.08.2021
 *
 ********************************************************************************/

public class Main {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>(); // (1) - Criação de fila.
        String primeiroDaFila;

        // (2) - Incluir na fila: Juliana, Pedro, Carlos, Larissa e João.
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        // (3) - Navegar na fila e exibir os elementos.
                System.out.println("Elementos da fila");
        for (String elementoFila: filaBanco){
            System.out.println(elementoFila);
        }

        // (4) - Retornar o primeiro item da fila sem removê-lo.
        primeiroDaFila = filaBanco.peek();

        System.out.println("Primeira pessoa da fila: " + primeiroDaFila);
        System.out.println("Fila completa: " + filaBanco);

        // (5) Retorne o primeiro item da fila removendo o mesmo.
        primeiroDaFila = filaBanco.poll();

        System.out.println("Primeira pessoa da fila: " + primeiroDaFila);
        System.out.println("Fila com a retirada da primeira pessoa: " + filaBanco);

        // (6) Adicione o nome Daniel. Verifique a posição que o mesmo assumiu na fila.
        filaBanco.add("Daniel");
        System.out.println("Fila com nova pessoa: " + filaBanco);

        // (7) Retorne o tamanho da fila.
        System.out.println("O tamanho da fila é: " + filaBanco.size());

        int indice = 1;
        for (String elementoFila: filaBanco){
            if (elementoFila.equals("Daniel")) {
                System.out.println("Posição de Daniel na fila: " + indice);
            }
            indice++;
        }

        System.out.println("O tamanho da fila é de : " +filaBanco.size() + " elemento(s).");

        boolean filaVazia = filaBanco.isEmpty();

        if (filaVazia) {
            System.out.println("Ninguém na fila!");
        } else {
            System.out.println("Há pessoas na fila!");
        }

        boolean temCarlos = filaBanco.contains("Carlos");

        if (temCarlos) {
            System.out.println("O Carlos está na fila!");
        } else {
            System.out.println("O Carlos não está na fila!");
        }
    }
}