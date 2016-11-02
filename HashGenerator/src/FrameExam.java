import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameExam extends JFrame{
	private JButton b1 = new JButton("Generate!");
	private JTextField jt1 = new JTextField(10);
	private JTextField jt2 = new JTextField(10);
	private JTextArea ja1 = new JTextArea(30,10);
	private JLabel jl1 = new JLabel("password");
	private JLabel jl2 = new JLabel("salt");
	private generateHashPassword ghp = new generateHashPassword();
	
	public FrameExam(){
		super("hash value generator");
		
		this.setLayout(new FlowLayout());
		
		this.add(jl1);
		this.add(jt1);
		this.add(jl2);
		this.add(jt2);
		this.add(b1);
		this.add(ja1);
		
		b1.addActionListener(
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String password = jt1.getText();
					String salt = jt2.getText();
					
					ja1.setText(ghp.getPassword(password,salt.getBytes()));
				}
			}
		);
		
		this.setSize(600,400);
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}