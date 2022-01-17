package Pilhas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pilha p = new Pilha();

        Object n;
        /*As expressões devem conter literais de
        A a J, operadores (+ (adição), - (subtração), / (divisão), * (multiplicação), ^
        (potenciação)) e delimitadores de escopo ( “(“, ”)”, ”[“, ”]”, ”{“, ”}” ).*/

        int tm=0;
        int cont=0;
        System.out.println("Quantos Caracteres tem a expressão? ");
        tm = input.nextInt();

        while(cont<tm){
            System.out.println("Digite: ");
            n = input.next();
            p.empilhar(n);
            cont++;
        }


        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }

//        while (p.pilhaVazia() == false) {
//            System.out.println(p.desempilhar());
//        }
    }
}
