package consultacep;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class ConsultaCep {

    public static void main(String[] args) throws IOException {

        ViaCEPClient viaCEPClient = new ViaCEPClient();
        ViaCEPEndereco endereco = viaCEPClient.getEndereco("37775000");

        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("CEP : " + endereco.getCep());
        System.out.println("IBGE " + endereco.getIbge());
        System.out.println("Localidade " + endereco.getLocalidade());
        System.out.println("UF " + endereco.getUf());
    }
}
