/*
 * (produto, quantidade, armazen, prateleira…)

 */
package ZPROJETOPOO_CRUD;


public class Estoque {            //instaciar o estoque na main pra fazer conexão com produtos e adicionar no arraylist
   private String nomeProduto;
   private int quantidade;
   private String corredor;
   private String prateleira;
   private String validade;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
   
    
}
