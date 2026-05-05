import java.util.Scanner;

public class TesteABB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Criacao de uma ABB de obj da class func (Chave: id)");

        ABB<Funcionario> abb2 = new ABB<Funcionario>();
        int opc;

        do {
            System.out.println("\n Menu de opcao: \n" +
                    "1. cadastrar funcionario\n" +
                    "2. mostrar dados de todos os funcionarios cadastrados\n" +
                    "3. Mostrar gastos com salarios dos funcionarios\n" +
                    "4. Mostrar total de funcionarios de determinado ano\n" +
                    "5. Mostrar quantidade de funcionarios de determinado sexo\n" +
                    "6. Mostrar dados de funcionarios a partir de certa idade\n" +
                    "7. Simular cadastro de funcionario\n" +
                    "8. sair");

            System.out.println("Escolha uma opcao: ");
            opc = sc.nextInt();

            if (opc == 1) {
        

                System.out.println("--- Cadastro de Funcionário ---");
                
                System.out.print("ID: ");
                int id = sc.nextInt();
                
                System.out.print("Categoria (um caractere): ");
                char categoria = sc.next().charAt(0);
                
                sc.nextLine();
                
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                
                System.out.print("Cargo: ");
                String cargo = sc.nextLine();
                
                System.out.print("Sexo (M/F): ");
                char sexo = sc.next().charAt(0);
                
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                
                System.out.print("Salário: ");
                float salario = sc.nextFloat();

                
                Funcionario novoFunc = new Funcionario(id, categoria, nome, cargo, sexo, idade, salario);
                
        
                abb2.inserir(novoFunc);
                
                System.out.println("Funcionário cadastrado com sucesso!");
            } 
            else if (opc == 2) {

                System.out.println("       LISTA DE FUNCIONÁRIOS CADASTRADOS (ORDEM DE ID)        ");

                
                if (abb2.isEmpty()) {
                    System.out.println("A árvore está vazia! Cadastre funcionários primeiro.");
                } else {
                    // Chama o método emOrdem2 da sua classe ABB fornecida
                    abb2.emOrdem2(); 
                }
                

            }
            else if (opc == 7) {
                abb2.inserir(new Funcionario(106, 'H', "Fernanda Lima", "Engenheira DevOps", 'F', 28, 8900.00f));
                abb2.inserir(new Funcionario(107, 'P', "Gabriel Santos", "Desenvolvedor Mobile", 'M', 22, 4500.00f));
                abb2.inserir(new Funcionario(108, 'P', "Helena Souza", "Product Owner", 'F', 34, 12500.00f));
                abb2.inserir(new Funcionario(109, 'H', "Igor Oliveira", "Analista de Segurança", 'M', 30, 7200.00f));
                abb2.inserir(new Funcionario(110, 'P', "Juliana Paes", "Arquiteta de Software", 'F', 38, 15000.00f));
                abb2.inserir(new Funcionario(111, 'P', "Kevin Lopes", "Estagiário de QA", 'M', 20, 2100.00f));
                abb2.inserir(new Funcionario(112, 'P', "Larissa Manoela", "Scrum Master", 'F', 27, 9800.00f));
                abb2.inserir(new Funcionario(113, 'H', "Marcos Frota", "Suporte Nível 2", 'M', 45, 5000.00f));
                abb2.inserir(new Funcionario(114, 'H', "Natália Guimarães", "Engenheira de Dados", 'F', 32, 11200.00f));
                abb2.inserir(new Funcionario(115, 'H', "Otávio Mesquita", "Administrador de Redes", 'M', 41, 6800.00f));

                System.out.println("Mais 10 funcionários simulados inseridos com sucesso!");
            }

        } while (opc != 8);

        sc.close();
    }
}