import javax.swing.*;

public class Project0_1 {

    public static void main(String[]args) {

        int distance;
        double moneyDue=0;

        String name = JOptionPane.showInputDialog("Please enter your whole name");
        String distanceAsString = JOptionPane.showInputDialog("Please enter you distance you have travelled in KM");



        distance = Integer.parseInt(distanceAsString);

        if ( distance <=10)
        {

       moneyDue = (.07 * distance) ;

       JOptionPane.showMessageDialog(null,"The cylist's name is"  + " " + name +
                                    "\n" + "The money due to the cylist is" +
                                     String.format("%.2f", moneyDue   ));

        }

        else {
            moneyDue =  .70 + (.1 * (distance-10)) ;


        JOptionPane.showMessageDialog(null,"The cylist's name is" + " " + name +
                "\n" + "The money due to the cylist is" +
                String.format("%.2f", moneyDue   ));
       }
      }
    }