package UI.Panel;

import UI.Buttons.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener{
    private Button[] btn = new Button[2];

    public ButtonPanel() {
        super();
    }

    public ButtonPanel(String firstButton, String secondButton){
        super();
        btn[0] = new Button( firstButton );
        btn[1] = new Button( secondButton );

        btn[0].setActionCommand( firstButton );
        btn[1].setActionCommand( secondButton );

        btn[0].addActionListener( this );
        btn[1].addActionListener( this );

        setLayout( new FlowLayout() );

        add(btn[0]);
        add(btn[1]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        if(e.getActionCommand().equals( "Delete Invoice" )) {
            System.out.println("clicked");
        }
    }
}
