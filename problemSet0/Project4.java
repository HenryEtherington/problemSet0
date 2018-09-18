import javax.swing.*;

public class Project0_4 {
    public static void main(String[] args)

    {

        int i = 0, number=0, total=0;

        do

        {
            String numberAsString = JOptionPane.showInputDialog("Please enter a number");
            number = Integer.parseInt(numberAsString);
            i++;
            total  += number;


            JOptionPane.showMessageDialog(null,"The number of numbers is " + i +
                    "The total sum of the entries is " + total);



        }
        while (number !='q');

    }
}
