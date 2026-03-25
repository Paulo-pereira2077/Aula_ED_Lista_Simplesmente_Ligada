package principal;

import lista.Lista;
import modelo.Produto;

import java.util.List;

public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Produto("Café", 25.34f));
        lista.inserir(new Produto("Azeite", 38.67f));
        lista.inserir(new Produto("Arroz", 25.78f));
        lista.inserir(new Produto("Celular", 1234.56f));

        lista.exibir();
    }

}
