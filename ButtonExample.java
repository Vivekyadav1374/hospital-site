import java.awt.*;  
import java.awt.event.*;  
public class ButtonExample {  
public static void main(String[] args) {  
    Frame f=new Frame("Button Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    final TextField tf1=new TextField();  
    final TextField tf2=new TextField();  
    tf1.setBounds(50,150, 180,50);  
    tf2.setBounds(50,170, 190,50);
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
    int a=Integer.parseInt(tf.getText());
    int b=Integer.parseInt(tf1.getText());
    int c=a+b;
    String x=Integer.toString(c);   
         tf.setText(x);  
        }  
    });  
    f.add(b);f.add(tf);  f.add(tf1);f.add(tf2);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  