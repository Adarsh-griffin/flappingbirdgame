import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardheight = 640;
        int boardwidth=360;
        JFrame frame = new JFrame("Flappy Bird");


       // frame.setVisible(true);
		frame.setSize(boardwidth, boardheight);//setting height and weidth
        frame.setLocationRelativeTo(null);//centres the screen 
        frame.setResizable(false);//cannot resize 
       
       
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esc to exit
        FlappyBird flappybird = new FlappyBird();
        frame.add(flappybird);

        frame.pack();
        flappybird.requestFocus(true);
        frame.setVisible(true);
    }
}
