import javax.swing.JOptionPane;

public class ex2_2_5 {
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog("Enter the first number:");
        double firstNumber = Double.parseDouble(firstInput); 
        
        String secondInput = JOptionPane.showInputDialog("Enter the second number:");
        double secondNumber = Double.parseDouble(secondInput); 
        
        // Thực hiện các phép tính
        double total = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        String division;
        
        // Kiểm tra chia cho 0
        if (secondNumber != 0) {
            division = String.valueOf(firstNumber / secondNumber);
        } else {
            division = "Cannot divide by zero.";
        }
        
        // Hiển thị kết quả
        String result = "Sum: " + total + "\n"
                      + "Difference: " + difference + "\n"
                      + "Product: " + multiplication + "\n"
                      + "Quotient: " + division;
        
        JOptionPane.showMessageDialog(null, result);
    }
}