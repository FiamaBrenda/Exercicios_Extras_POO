/**
 *Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa que leia o valor do salário *mínimo e o valor do salário de uma pessoa.  Calcular e mostrar quantos salários mínimos ela ganha.
 * 
 */
import javax.swing.JOptionPane;
public class POO_aula_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salarioMinimo, salarioBase ;
        salarioMinimo = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor atual do salário Minímo"));
        salarioBase = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do salário da pessoa"));        JOptionPane.showMessageDialog(null, "Essa pessoa está ganhando "+salarioBase/salarioMinimo+" Salários Minímos");
    }
}


