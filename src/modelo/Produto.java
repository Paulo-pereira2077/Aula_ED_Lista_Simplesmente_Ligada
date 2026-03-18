package modelo;

public class Produto {

    private String nome;
    private Double preco;
    private int id;
    private static int cont = 1;

    public Produto(int id){
        this.id= cont++;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }



    public String toString(){

        return "Produto{" + "Nome: " + nome + "; Preço: " + preco + "; Id: " + id + "; Contador: " + cont + "}";
    }
}
