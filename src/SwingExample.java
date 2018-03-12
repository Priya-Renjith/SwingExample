import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExample {
  JFrame frame;
  private int numclicks;

  public static void main(String[] args) {
    SwingExample example = new SwingExample();
    example.go();
  }

  public void go() {
    frame = new JFrame();
    JButton button = new JButton("Should I do it");
    button.addActionListener(new DevilListener());
    button.addActionListener(new AngelListener());
    frame.getContentPane().add(BorderLayout.CENTER, button);
    frame.setSize(100, 100);
    frame.setVisible(true);
  }

  class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println("Don't do it. You might regret it");
    }
  }
  class DevilListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println("Come on. Do it");
    }
  }
}
