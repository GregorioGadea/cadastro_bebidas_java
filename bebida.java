
public class bebida {
    
    private String nome;
    private float custo;
    private float precovenda;    
    private String descricao;
    private int estoque;
    
    public void setName(String nome){ this.nome = nome;}
    public String getNome(){ return this.nome;}
    
    public void setCusto(float custo){this.custo = custo;}
    public float getCusto(){ return this.custo;}  


    public void setDescricao(String descricao){ this.descricao = descricao;}
    public String getDescricao(){return this.descricao;}

    public void setEstoque(int estoque){ this.estoque = estoque;}
    public int getEstoque(){ return this.estoque;}
        

    public float getPrecoVenda(){ this.precovenda = custo +(float) (this.custo * 0.3);return this.precovenda; }
    
    String getDadosFormatados() {
        return this.nome + "\n" + 
        "Custo: R$ "+Float.toString(this.custo) + "\n" +
        "Descrição: "+this.descricao + "\n" +
        "Estoque: "+Integer.toString(this.estoque)+"\n";
    }

}
 