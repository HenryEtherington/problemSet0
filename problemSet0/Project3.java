import javax.swing.*;

public class Project3 {
    public static void main(String[] args) {

        double taxDue;
        int  taxableIncome;

        String name = JOptionPane.showInputDialog("Please enter your name");
        String taxableIncomeAsString = JOptionPane.showInputDialog("Please enter your taxable ammount <q to exit>");

        taxableIncome = Integer.parseInt(taxableIncomeAsString);

        if(taxableIncome >20000 && taxableIncome<=36000)
        {
            taxDue = ((taxableIncome-20000) * .2);


            JOptionPane.showMessageDialog(null,"The tax due is " + taxDue  + "EURO");
        }

    else if (taxableIncome >36000 )
        {
            taxDue = 3199.98 + ((taxableIncome-36000) * .41);
            JOptionPane.showMessageDialog(null,"The tax due is " + taxDue  + "EURO");
        }

        else
            JOptionPane.showMessageDialog(null,"The tax due is 0 EURO");
    }
}