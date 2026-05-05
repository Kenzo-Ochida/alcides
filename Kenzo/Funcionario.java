// public class Funcionario implements Comparable<Funcionario>  {

//     private int id;
//     private char categoria;
//     private String nome;
//     private String cargo;
//     private char sexo;
//     private int idade;
//     private float salario;

//     public Funcionario(int id, char categoria, String nome, String cargo, char sexo, int idade, float salario) {
//         this.id = id;
//         this.categoria = categoria;
//         this.nome = nome;
//         this.cargo = cargo;
//         this.sexo = sexo;
//         this.idade = idade;
//         this.salario = salario;
//     }



//     public int getId() {
//         return id;
//     }

//     public char getCategoria() {
//         return categoria;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public String getCargo() {
//         return cargo;
//     }

//     public char getSexo() {
//         return sexo;
//     }

//     public int getIdade() {
//         return idade;
//     }

//     public float getSalario() {
//         return salario;
//     }



//     public void setId(int id) {
//         this.id = id;
//     }

//     public void setCategoria(char categoria) {
//         this.categoria = categoria;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }

//     public void setCargo(String cargo) {
//         this.cargo = cargo;
//     }

//     public void setSexo(char sexo) {
//         this.sexo = sexo;
//     }

//     public void setIdade(int idade) {
//         this.idade = idade;
//     }

//     public void setSalario(float salario) {
//         this.salario = salario;
//     }
// }



public class Funcionario implements Comparable<Funcionario> {

    private int id;
    private char categoria;
    private String nome;
    private String cargo;
    private char sexo;
    private int idade;
    private float salario;

    public Funcionario(int id, char categoria, String nome, String cargo, char sexo, int idade, float salario) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.cargo = cargo;
        this.sexo = sexo;
        this.idade = idade;
        this.salario = salario;
    }

    // Método OBRIGATÓRIO para a classe ABB funcionar
    @Override
    public int compareTo(Funcionario outro) {
        return Integer.compare(this.id, outro.id);
    }

    @Override
    public String toString() {
        return String.format("ID: %-5d | Nome: %-15s | Cargo: %-15s | Salário: R$ %8.2f", 
                              id, nome, cargo, salario);
    }

    // --- GETTERS ---
    public int getId() { return id; }
    public char getCategoria() { return categoria; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public char getSexo() { return sexo; }
    public int getIdade() { return idade; }
    public float getSalario() { return salario; }

    // --- SETTERS ---
    public void setId(int id) { this.id = id; }
    public void setCategoria(char categoria) { this.categoria = categoria; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setSalario(float salario) { this.salario = salario; }
}