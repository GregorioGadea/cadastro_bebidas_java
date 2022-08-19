import java.util.ArrayList;

import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        
        ArrayList <bebida> bebidas = new ArrayList<>();

        boolean loop = true;
        while(loop){
        String menu =JOptionPane.showInputDialog(null,
        " 0) Cadastro de bebida \n"
        +" 1) Mostrar a quantidade de bebidas em estoque \n"
        +" 2) Mostrar o nome da bebida mais cara \n"
        +" 3) Mostrar a descrição e preço de venda da bebida mais cara \n"
        +" 4) Mostrar o nome eo preço de venda da bebida mais barata \n"
        +" 5) Mostrar o nome das bebidas com quantia superior a 30 \n"
        +" 6) Mostrar o nome da bebida com preço entre 4 e 5 reais \n"
        +" 7) mostrar todos os dados de todas as bebidas \n"
        +" 8) Exit ");        
        
        switch(menu){
            case "0" :
                bebida bebida = new bebida();

                String nome =JOptionPane.showInputDialog(null,"Nome:");
                bebida.setName(nome);
                
                String custo =JOptionPane.showInputDialog(null,"Custo:");
                Float novoCusto = Float.parseFloat(custo);
                bebida.setCusto(novoCusto);

                String descricao =JOptionPane.showInputDialog(null,"Descrição:");
                bebida.setDescricao(descricao);

                String estoque =JOptionPane.showInputDialog(null,"Estoque:");
                int novoEstoque = Integer.parseInt(estoque);
                bebida.setEstoque(novoEstoque);

                bebidas.add(bebida);


                break;

            case "1":
                
                int valor = 0;
                
                for (int i = 0; i < bebidas.size();i++){
                    
                    valor += bebidas.get(i).getEstoque(); // valor = valor + bebidas.get(i).getEstoque();
                    
                }
                
                JOptionPane.showMessageDialog(null, "Quantidade de bebidas em estoque: "+ valor);

                break;

            case "2":
                
                Float max = bebidas.get(0).getCusto();
                String nomeDaBebida = bebidas.get(0).getNome();

                for (int i =0; i < bebidas.size(); i++){

                    if (bebidas.get(i).getCusto() > max ) {
                        max = bebidas.get(i).getCusto();
                        nomeDaBebida = bebidas.get(i).getNome();
                    }

                }

                JOptionPane.showMessageDialog(null, "Bebida mais cara " + nomeDaBebida);

                break;
            
            case "3":

                Float max2 = bebidas.get(0).getCusto();
                String nomeDaBebida2 = bebidas.get(0).getNome();
                String descricaoDaBebida = bebidas.get(0).getDescricao();
                float precoDaBebida = bebidas.get(0).getPrecoVenda(); 

                for (int i =0; i < bebidas.size(); i++){
                    if (bebidas.get(i).getCusto() > max2 ) {
                        max2 = bebidas.get(i).getCusto();
                        nomeDaBebida2 = bebidas.get(i).getNome();
                        descricaoDaBebida = bebidas.get(i).getDescricao();
                        precoDaBebida = bebidas.get(i).getPrecoVenda();
                        
                    }
                }

                JOptionPane.showMessageDialog(null, "Descrição e preço de venda da bebida mais cara: \n" 
                + nomeDaBebida2 +"\n"
                +"Descrição: " + descricaoDaBebida +"\n"
                + "Preço de venda: " + precoDaBebida );                
                break;
            
                case "4":
                    String descricaoDaBebida4 = bebidas.get(0).getDescricao();
                    float min = bebidas.get(0).getPrecoVenda();
                    String nomeDaBebida4 = bebidas.get(0).getNome();

                    for (int i = 0; i < bebidas.size(); i++){

                        if (min > bebidas.get(i).getPrecoVenda()){
                            min = bebidas.get(i).getPrecoVenda();
                            nomeDaBebida4 = bebidas.get(i).getNome();
                        }

                    }

                    JOptionPane.showMessageDialog(null, "Descrição e preço de venda da bebida mais barata: \n" 
                    + nomeDaBebida4 +"\n"
                    +"Descrição: " + descricaoDaBebida4 +"\n"
                    + "Preço de venda: " + min );   

                    break;

                case "5":
                    
                    for (int i = 0 ; i < bebidas.size(); i++){
                        if (bebidas.get(i).getEstoque() >= 30)
                            JOptionPane.showMessageDialog(null, "Bebidas com quantia superior a 30: "+ bebidas.get(i).getNome());                                            
                    }
                    break;

                case "6":

                    String nomeBebida = bebidas.get(0).getNome();   
                    for (int i = 0 ; i < bebidas.size(); i++){

                        if (bebidas.get(i).getPrecoVenda() >= 4 && bebidas.get(i).getPrecoVenda() <= 5 ) {
                            
                            nomeBebida = bebidas.get(i).getNome();
                            JOptionPane.showMessageDialog( null, "Bebida: "+ nomeBebida);

                        }                                        
                    }
                    

                    break;

                case "7": // Mostrando os dados de todas as bebidas

                // Pedir ajuda para o professor para resolver o bug do aparecimento!
                
                String dadosBebidas = "";
                    for (int i = 0; i < bebidas.size(); i++){

                        dadosBebidas = dadosBebidas.concat(bebidas.get(i).getDadosFormatados()) + "\n";
                        JOptionPane.showMessageDialog(null, dadosBebidas);
                        
                    }
                    
                    break;

                case "8":
                    loop = false;
                    break;

            }
        }
    }
}
