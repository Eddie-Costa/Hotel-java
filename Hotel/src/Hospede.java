import javax.swing.JOptionPane;

public class Hospede {
    public String nome;
    public String cpf;
    public int idade;
    public int numdependentes;
    
    public void Cadastrar(String nome, String cpf,int idade ,int numdependentes ){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numdependentes = numdependentes; 
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!!");
        };
        
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome: " +this.nome+ "\nCPF:" +this.cpf+ "\nIdade" +this.idade+ "\nNumero de dependentes: " +this.numdependentes);
    };   
  
}
