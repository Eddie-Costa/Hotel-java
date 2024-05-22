import javax.swing.JOptionPane;

public class Hospedagem {
    public int numdias;
    public double vlDiaria;
    public double vlConsumo;
    public double vlDiverso;
    
    public double CalcularTotal(){
        this.numdias = Integer.parseInt(JOptionPane.showInputDialog("digite o numero de dias: "));
        this.vlDiaria = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da diaria: "));
        this.vlConsumo = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do Consumo: "));
        this.vlDiverso = Double.parseDouble(JOptionPane.showInputDialog("digite os valores Diversos: "));
        double total=this.numdias*this.vlDiaria+this.vlConsumo+this.vlDiverso;
        return total; 
    }
    
    public void CalcularDesconto(double valor){
        if (this.numdias>=5){
            valor=valor-(valor*10/100);
            JOptionPane.showMessageDialog(null, "O valor atual é: " +valor);
        }
        else{
        JOptionPane.showMessageDialog(null, "o numero de diarias não ultrapassa 5 dias. ");
    }
        
    }
}
