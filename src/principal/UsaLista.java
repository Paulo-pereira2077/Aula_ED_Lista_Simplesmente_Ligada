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

        System.out.println("--- Lista Original ---");
        lista.exibir();

        // metodo pesquisar
        System.out.println("\n--- Testando Pesquisa (ID: 2) ---");
        Produto busco = lista.pesquisar(2);
        if (busco != null) {
            System.out.println("Encontrado: " + busco.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }

        //metodo exibir
        System.out.println("\n--- Testando Atualização de Preço (ID: 2 para 45) ---");
        boolean atualizou = lista.atualizar(2, 45f);
        if (atualizou) {
            System.out.println("Preço atualizado com sucesso!");
        } else {
            System.out.println("Falha ao atualizar: ID inexistente.");
        }

        System.out.println("\n--- Lista Após Atualização ---");
        lista.exibir();

        System.out.println("\n === Remoção ===");
        if(lista.remover(22)){
            lista.exibir();
        }
        else{
            System.out.println("Não achou o id pesquisado");
        }
    }

}
