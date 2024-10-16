import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        String busca = leitura.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

       try {
           Endereco novoEndereco = consultaCep.buscaEndereco(busca);
           System.out.println(novoEndereco);
           GeradorDeArquivo gerador = new GeradorDeArquivo();
           gerador.salvaJson(novoEndereco);
       } catch (RuntimeException | IOException e){
           System.out.println(e.getMessage());
           System.out.println("Finalizando");
       }
    }
}