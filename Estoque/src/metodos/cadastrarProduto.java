package metodos;
import Classes.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class cadastrarProduto {
      
    public static Produto cadastrar(ArrayList<Produto> estoque){
        Produto produto = new Produto();
        boolean teste = false;
            while(teste == false){
                teste = true;
                produto.setNomeProduto(showInputDialog(null, "Digite o nome do Produto a ser cadastrado", "CADASTRO", INFORMATION_MESSAGE));
                    for(Produto produtoTeste : estoque){
                        if(produto.getNomeProduto().equalsIgnoreCase(produtoTeste.getNomeProduto())){
                            showMessageDialog(null, "Produto já cadastrado ", "Cadastro", ERROR_MESSAGE);
                            teste = false;
                            break;
                        }
                    }
            }
            produto.setUnidadeDeMedida(showInputDialog(null, "Digite a unidade de medida do produto", "CADASTRO", INFORMATION_MESSAGE));
            teste = false;
            while(teste == false){
                try {
                    produto.setQuantidadeProduto(parseInt(showInputDialog(null, "Digite a quantidade disponível no estoque", "Cadastro", INFORMATION_MESSAGE)));
                } catch (Exception e) {
                    showMessageDialog(null, "ERRO: " + e + "\nTente o processo novamente", "Cadastro", ERROR_MESSAGE);            
                }
                teste = true;
            }
        return produto;
    }

}
