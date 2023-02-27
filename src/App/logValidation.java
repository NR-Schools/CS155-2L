package App;


import javax.swing.JLabel;
import javax.swing.JTextField;


public class logValidation {
    public void val(JTextField userTF,JTextField passTF, JLabel E1, JLabel E2){
        if(userTF.getText().length()<3)
        {
            E1.setVisible(true);
        }
        if(userTF.getText().length()>=3)
        {
            //another conditional statement for the DB
            E1.setVisible(false);
        }
        if(passTF.getText().length()<8)
        {
            E2.setVisible(true);
        }
        if(passTF.getText().length()>=8)
        {
            //another conditional statement for the DB
            E2.setVisible(false);
        }
    }
}
