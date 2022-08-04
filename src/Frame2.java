import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame implements ActionListener {
    JButton ok;
    Frame2(){
        ok=new JButton("OK");
        ok.setBounds(80,70,100,30);
        add(ok);
        ok.addActionListener(this);
        JLabel labelM = new JLabel("YOU WON!");
        labelM.setBounds(90, 10, 200, 30);
        add(labelM);
        setSize(300,150);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.setForeground(Color.black);
        ok.setBackground(Color.WHITE);
        setResizable(false);
        setLocation(100,100);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==ok)dispose();
    }
}
