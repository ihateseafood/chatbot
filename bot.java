import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bot extends JFrame {
    public JTextArea ChatArea = new JTextArea();
    public JTextField chatbot = new JTextField();
    public bot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("ChatBot");
        frame.add(ChatArea);
        frame.add(chatbot);

        ChatArea.setSize(500, 400);
        ChatArea.setLocation(2,2);

        chatbot.setSize(500, 30);
        chatbot.setLocation(2,0);

        chatbot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gtext = chatbot.getText();
                ChatArea.append("You ->" + gtext + "\n");
                chatbot.setText("");
            }
        });
    }
    private void bot(String string){
        ChatArea.append();
    }


    public static void main (String args[]){
        new bot();
    }
}
