package orientacao_a_objetos.heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        pessoa.idade = 30;
        // pesssoa.departamento = "RH"; // Erro: departamento não existe em Pessoa é da classe Funcionario

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Carlos";
        vendedor.idade = 30;
        vendedor.salario = 2000.0;
        vendedor.departamento = "Vendas";
        vendedor.comissao = 500.0;
        vendedor.numeroVendas = 20;

        System.out.println("Nome: " + vendedor.nome);
        System.out.println("Idade: " + vendedor.idade);
        System.out.println("Salário: " + vendedor.salario);
        System.out.println("Departamento: " + vendedor.departamento);
        System.out.println("Comissão: " + vendedor.comissao);
        System.out.println("Número de Vendas: " + vendedor.numeroVendas);
    }
}
