import javax.swing.*;

public class MyTextField extends JTextField{
    
    public MyTextField() {
        super();
        setColumns(40);
        setBounds(0, 400, 400, 40);
        setEditable(false);
    }
}
