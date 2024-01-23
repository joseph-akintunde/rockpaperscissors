import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class ropasc extends JFrame implements ActionListener {
        JButton b1;
        JPanel newPanel;
        JLabel personMoveLabel;
        final JTextField textField2;

        ropasc() {
            personMoveLabel = new JLabel();
            personMoveLabel.setText("Player's Selection");

            textField2 = new JTextField(100);

            b1 = new JButton("CLICK TO SEE THE WINNER");

            newPanel = new JPanel(new GridLayout(3, 1));
            newPanel.add(personMoveLabel);
            newPanel.add(textField2);
            newPanel.add(b1);

            add(newPanel, BorderLayout.CENTER);

            b1.addActionListener(this);
            setTitle("JOSEPH'S ROCK, PAPER, SCISSORS");
        }
    public void actionPerformed(ActionEvent AE){
            String personMove = textField2.getText();
            String[] availableMoves = {"Rock", "Paper", "Scissors"};
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
            String ps = personMove;
                if(computerMove.equals(ps)){
                    System.out.println("computer chose " + computerMove);
                    System.out.println("TIE!");
                }else if(computerMove.equals("Rock")){
                    if(ps.equals("Paper")||ps.equals("paper")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You win. Congratulations!");
                    }
                    if(ps.equals("Scissors")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You lost. try better next time!");
                    }
                }else if(computerMove.equals("Paper")){
                    if(ps.equals("Rock")||ps.equals("rock")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You lost. try better next time!");
                    }
                    if(ps.equals("Scissors")||ps.equals("scissors")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You win. Congratulations!");
                    }
                }else if(computerMove.equals("Scissors")){
                    if(ps.equals("Rock")||ps.equals("rock")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You lost. try better next time!");
                    }
                    if(ps.equals("Paper")||ps.equals("paper")){
                        System.out.println("computer chose " + computerMove);
                        System.out.println("You win. Congratulations!");
                    }else{
                        System.out.println("Invalid Input. Please try again!");
                    }
                }
            }
        }
class rockpaperscissors {
    public static void main(String arg[]) {
        try {
            ropasc form = new ropasc();
            form.setSize(200, 100);
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}