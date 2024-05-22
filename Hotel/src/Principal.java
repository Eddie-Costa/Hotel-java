
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        Hospede h1 = new Hospede();
        Hospedagem ho1 = new Hospedagem();
        double Valor=0;
        
        int op=0;
        String menu="1-Cadastrar Hospede \n2-Exibir Hospede \n3-Calcular Total \n4-Calcular Desconto \n0-Sair";
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
                    switch(op){
                        case 1:
                            String nome = JOptionPane.showInputDialog("Digite o nome: ");
                            String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                            int numdependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes: "));
                            h1.Cadastrar(nome, cpf,idade ,numdependentes );
                            break;
                        case 2:
                            h1.Exibir();
                            break;
                        case 3:
                            Valor=ho1.CalcularTotal();
                            JOptionPane.showMessageDialog(null, "O valor atual é: " +Valor);
                            break;
                        case 4:
                            ho1.CalcularDesconto(Valor);
                            break;
                    }
        }
        while(op!=0);

    }
    }
