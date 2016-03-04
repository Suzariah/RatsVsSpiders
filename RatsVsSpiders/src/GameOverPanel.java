
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class GameOverPanel extends JFrame {


    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private JButton againButton;
    private JButton quitButton;
    private JButton spiderbutton;
    private JTextField GameOverTextField;
    Font font2 = new Font("Comic Sans MS",Font.BOLD,50);
    private ImageIcon image;
    private Image sillyspider;
    
    public GameOverPanel() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        image = new ImageIcon("src/images/spiders.png");
        sillyspider = image.getImage();
    }

    private void createComponents() {
        this.createButtons();
        this.createTextField();
    }

     private void createButtons() {
        class AgainQuitListener implements ActionListener {
  
  
            private String action;

            public AgainQuitListener(String action) {
                this.action = action.toLowerCase();
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (action.equals("again")) {
                   Frame f1 = new Frame();
                   dispose(); 
                   
                }
                if (action.equals("quit")) {
                    System.exit(0);
                }
            }
        }
        againButton = new JButton("again");
        againButton.setFont(font2);
        againButton.setForeground(Color.RED);
        ActionListener againListener = new AgainQuitListener("again");
        againButton.addActionListener(againListener);
        quitButton = new JButton("Quit");
        quitButton.setFont(font2);
        quitButton.setForeground(Color.RED);
        ActionListener quitListener = new AgainQuitListener("Quit");
        quitButton.addActionListener(quitListener);
        
       
    }

    private void createTextField() {
        final int FIELD_WIDTH = 40;
        Font font1 = new Font("SansSerif",Font.BOLD, 80);
        GameOverTextField = new JTextField(FIELD_WIDTH);
        GameOverTextField.setText("Git Gud Kiddo!");
        GameOverTextField.setLocation(50,50);
        GameOverTextField.setFont(font1);
        GameOverTextField.setForeground(Color.BLUE);
        GameOverTextField.setHorizontalAlignment(JTextField.CENTER);
        GameOverTextField.setEditable(false);
    }

    private void createPanel() {
        JPanel panel = new JPanel(); 
        panel.add(this.GameOverTextField);
        panel.add(this.againButton);
        panel.add(this.quitButton);
        
        this.add(panel);
       
    }
}
