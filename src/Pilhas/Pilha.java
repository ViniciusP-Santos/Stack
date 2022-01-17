package Pilhas;

public class Pilha {
    public Object[] pilha; //Vetor Generico
    public int posicaoPilha; //Variavel para armazenar a posição atual da pilha

    public Pilha() {
        this.posicaoPilha = -1; //-1 Indica que a Lista está vazia, já que a posição 0 do array já armazena informação
        this.pilha = new Object[1000]; // criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
            //Aqui verifica se o atributo posicaoPilha é igual a-1
            //Se a pilha for igual a -1, significa que é nula e está vazia
            //retornando true
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0; //Aqui indica que não tem nenhum conteudo dentro da pilha
        }
        return this.posicaoPilha + 1;
        //Aqui indica quantos itens tem na pilha, o +1, é somente para facilitar o entedimento
        //logo que a pilha inicia em 0, se tivermos 3 itens na pilha, o atributo posicaoPilha vai mostrar 2
        //para saber quantos itens há, somamos +1
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
            //Aqui verificamos se a pilha está vazia
            //Se tiver vazia, não acontece nada
        }
        return this.pilha[this.posicaoPilha];
        //aqui retorna o que tem na ultima posição da lista
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
            //Aqui verificamos se a pilha está vazia
            //Se tiver vazia, não acontece nada
        }
        return this.pilha[this.posicaoPilha--];
        //aqui retorna o que tem na ultima posição da lista
        //e decrementa o atributo posicaoPilha
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            // verifica se a posicaoPilha é menor do que o tamanho da pilha,
            //se for, então é inserido o valor na pilha e ao mesmo tempo é feito
            //o incremento do atributo posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
    }
}
