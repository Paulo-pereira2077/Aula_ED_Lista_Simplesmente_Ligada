package lista;

import modelo.Produto;

public class Lista {

    private No inicio, auxiliar, atual;

    public void inserir(Produto produto){
        // Quando a lista estiver vazia

        if(inicio == null){
            inicio = new No(produto, null);
            auxiliar = inicio;
        }
        else {
        // Quando a lista não estiver vazia
            atual = new No(produto, null);
            auxiliar.setProx(atual);
            auxiliar = atual;
        }
    }

}
