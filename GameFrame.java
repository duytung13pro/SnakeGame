import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());// Create a panel for the game
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Basically it means" What would happens if you close the frame?"
        this.setResizable(false);//Basically means the frame can't be resize by all means.
        this.pack();//When you add components into theJFram, this function will fit around our components
        this.setVisible(true);// Means you can see the frame
        this.setLocationRelativeTo(null);// It appears right in the middle of the screen. There are a lot of parameter options, check at Declaration.


    }
}
