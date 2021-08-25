import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setLocation(200,200);
        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton MyFirstButton = new JButton("Exit");
        ActionListener MyListener = new CloseActionListener();
        MyFirstButton.addActionListener(MyListener);


        JButton MySecondButton = new JButton("Really?");

        JPanel myPanel = new JPanel(new GridLayout(1, 2));
        myPanel.add(MyFirstButton);
        myPanel.add(MySecondButton);

        add(myPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
