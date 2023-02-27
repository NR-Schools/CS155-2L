package App;


import javax.swing.JLabel;
import javax.swing.JTextField;

public class createAccountValidation {
    static int x; //for counting accounts


    
    public void val(JTextField userTF, JTextField passTF, JTextField conpassTF, JLabel E1, JLabel E2, JLabel E3){    
        if(userTF.getText().length()<3)
        {
            E1.setVisible(true);
        }
        if(userTF.getText().length()>=3)
        {
            E1.setVisible(false);
        }
        if(passTF.getText().length()<8)
        {
            E2.setVisible(true);
        }
        if(passTF.getText().length()>=8)
        {
            E2.setVisible(false);
        }
        if(!(conpassTF.getText().equals(passTF.getText())))
        {
            E3.setVisible(true);
        }
        if((conpassTF.getText().equals(passTF.getText())))
        {
            E3.setVisible(false);
        }
        
        if(conpassTF.getText().length()<8)
        {
            E3.setVisible(true);
        }
         
    }
    
    //getter
    public static int getX() 
    {
        return x;
    }

}
