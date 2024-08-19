package Hheranca.test;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Vandusch", "75298-021");

        Pessoa pessoa = new Pessoa("Clare");
        pessoa.setCpf("010001010011");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Miria");
        funcionario.setCpf("010001110011");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(23400.00);

        pessoa.imprime();
        funcionario.imprime();
    }
}
