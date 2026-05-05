import java.util.Scanner;
public class TesteABB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ABB<Integer> abb1 = new ABB<Integer>();
        System.out.println("\nSistema MackBemVindo\n");
        ABB<Funcionario> abb2 = new ABB<Funcionario>();
        
        int opc;
        do {
            System.out.println("\nOpcoes:");
            System.out.println("1. Cadastrar funcionario");
            System.out.println("2. mostrar dados de todos os funcionários cadastrados");
            System.out.println("3. Mostrar gastos com salários dos funcionários");
            System.out.println("4. mostrar total de funcionários de determinado sexo");
            System.out.println("5. mostrar quantidade de funcionários de certa categoria");
            System.out.println("6. Mostrar dados de funcionários a partir de certa idade");
            System.out.println("7. simular cadastro de funcionários");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opcao: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Funcionario func = cadastrar();
                    abb2.inserir(func);
                    break;
                case 2:
                    abb2.emOrdem2();
                    break;
                case 3:
                    double total = abb2.totalSalarios(abb2.getRaiz());
                    System.out.println("total gasto com salarios: " + total);
                    break;
                case 4:
                    System.out.print("informe o sexo (M/F): ");
                    char sexo = sc.next().charAt(0);

                    int totalSexo = abb2.contarPorSexo(abb2.getRaiz(), sexo);
                    System.out.println("total de funcionários do sexo " + sexo + ": " + totalSexo);
                    break;
                case 5:
                    System.out.print("Informe a categoria (P/O/H): ");
                    char categoria = sc.next().charAt(0);

                    int totalCat = abb2.contarPorCategoria(abb2.getRaiz(), categoria);
                    System.out.println("Total da categoria " + categoria + ": " + totalCat);
                    break;
                case 6:
                    System.out.print("Informe a idade mínima: ");
                    int idade = sc.nextInt();

                    System.out.println("\nFuncionários com idade >= " + idade + ":");
                    abb2.mostrarPorIdade(abb2.getRaiz(), idade);
                    break;
                case 7:
                    abb2.setRaiz(null);
                    simularCadastro(abb2);
                    System.out.println("\nfuncionários cadastradoss");
                    break;
                case 8:
                    System.out.print("Vai sair mesmo ?(S): ");
                    char resp = sc.next().charAt(0);

                    if (resp == 'S' || resp == 's') {
                        System.out.println("Tchau Tchau...");
                    }
                    break;
                default:
                    System.out.println("opcao invaldia");
                    break;
            }
        } while (opc != 8);
    }

    public static Funcionario cadastrar() {
        Scanner a = new Scanner(System.in);
        System.out.println("\n--- CADASTRO DE FUNCIONÁRIO ---");

        System.out.print("ID (Inteiro único): ");
        int id = a.nextInt();

        System.out.print("Categoria (P-Presencial, O-Home Office, H-Híbrido): ");
        char categoria = a.next().toUpperCase().charAt(0);
        a.nextLine();

        System.out.print("Nome: ");
        String nome = a.nextLine();

        System.out.print("Cargo: ");
        String cargo = a.nextLine();

        System.out.print("Sexo (F/M): ");
        char sexo = a.next().toUpperCase().charAt(0);

        System.out.print("Idade: ");
        int idade = a.nextInt();

        System.out.print("Salário: ");
        double salario = a.nextDouble();

        return new Funcionario(id, categoria, nome, cargo, sexo, idade, salario);
    }
    public static void simularCadastro(ABB<Funcionario> arvore) {
  
        arvore.inserir(new Funcionario(1, 'S', "Arthur", "Cloud Architect", 'M', 45, 12500.00));
        arvore.inserir(new Funcionario(2, 'D', "Helena", "UX Researcher", 'F', 29, 6500.00));
        arvore.inserir(new Funcionario(3, 'E', "Caio", "Fullstack Developer", 'M', 31, 8200.00));
        arvore.inserir(new Funcionario(4, 'S', "Isadora", "Agile Coach", 'F', 38, 9500.00));
        arvore.inserir(new Funcionario(5, 'D', "Bruno", "Site Reliability Engineer", 'M', 34, 11000.00));
        arvore.inserir(new Funcionario(6, 'E', "Lorena", "Engineering Manager", 'F', 40, 15000.00));
        arvore.inserir(new Funcionario(7, 'S', "Renato", "Cybersecurity Analyst", 'M', 33, 7800.00));
        arvore.inserir(new Funcionario(8, 'D', "Sophia", "Data Engineer", 'F', 27, 8900.00));
        arvore.inserir(new Funcionario(9, 'E', "Igor", "Blockchain Developer", 'M', 36, 13000.00));
        arvore.inserir(new Funcionario(10, 'S', "Gabriela", "Product Manager", 'F', 35, 11500.00));
        arvore.inserir(new Funcionario(11, 'D', "Samuel", "Android Specialist", 'M', 26, 5800.00));
        arvore.inserir(new Funcionario(12, 'E', "Maya", "AI Research Scientist", 'F', 30, 14200.00));
        arvore.inserir(new Funcionario(13, 'S', "Hugo", "Infrastructure Lead", 'M', 42, 10800.00));
        arvore.inserir(new Funcionario(14, 'D', "Clara", "Business Intelligence", 'F', 39, 7200.00));
        arvore.inserir(new Funcionario(15, 'E', "Nicolas", "Computer Vision Eng.", 'M', 32, 9800.00));
        arvore.inserir(new Funcionario(16, 'S', "Bia", "Visual Designer", 'F', 25, 4200.00));
        arvore.inserir(new Funcionario(17, 'D', "André", "Backend Engineer", 'M', 37, 8500.00));
        arvore.inserir(new Funcionario(18, 'E', "Larissa", "DevSecOps", 'F', 31, 9300.00));
        arvore.inserir(new Funcionario(19, 'S', "Vitor", "Solutions Architect", 'M', 44, 16000.00));
        arvore.inserir(new Funcionario(20, 'D', "Tati", "QA Automation", 'F', 28, 5500.00));
    
    }
}
    