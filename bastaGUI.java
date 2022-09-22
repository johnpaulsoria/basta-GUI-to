import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIPractice extends JFrame implements ActionListener{
	// Create your frame and put all the details such buttons and labels		
	// Setting the size of the frame. 

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		ArrayList<Double> array = new ArrayList<>();
		
		frame.setSize(400, 230);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setTitle("Final Exam");
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		
		//Create number label.
		JLabel lbl = new JLabel ("Numbers: ");
		lbl.setBounds(10, 20, 150, 25);
		panel.add(lbl);
		
		//Create *Display array Here* label.
		JLabel lbl2 = new JLabel ("*Display array Here*");
		lbl2.setBounds(100, 20, 550, 25);
		panel.add(lbl2);
		
		//Create text field. 
		JTextField txt = new JTextField();
		txt.setBounds(10, 50, 170, 25);
		panel.add(txt);
		
		
		//Create a button that inserts a number.
		JButton button1 = new JButton("Insert");
		button1.setBounds(10, 80, 80, 25);
		panel.add(button1);
		//Insert command
		button1.addActionListener(new ActionListener () {
		public void actionPerformed(ActionEvent event) {
		//Input
		double num = Double.parseDouble(txt.getText());
		//Looping 
		if (array.size() < 10) {
			array.add(num);
			lbl2.setText("" + array);
			txt.setText("");
			}
		else {
			//Maximum error
			JOptionPane.showMessageDialog(frame, "Numbers reached maximum capacity.");
			}
			for (int i = 0; i < array.size(); i++) {
			for (int r = i+1; r < array.size(); r++ ) {
				if (array.get(i).equals(array.get(r))) {
					//Number already exists error
					array.remove(num);
					lbl2.setText("" + array);
					JOptionPane.showMessageDialog(frame, "Number already exits.");
					}
				}
			}
						
		}
	});
		
		//Create a button that deletes one element in the array.
		JButton button2 = new JButton("Delete");
		button2.setBounds(100, 80, 80, 25);
		panel.add(button2);
		//Delete action.
		button2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent event) {
				if(array.size() > 0) {
					array.remove(array.size() - 1);
					lbl2.setText("" + array);
				}
				
			}
		});
		
		//Create a button that clears only the text field. 
		JButton button3 = new JButton("Clear");
		button3.setBounds(10, 120, 80, 25);
		panel.add(button3);
		//Clear action.
		button3.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		        txt.setText("");
		        
		    }
		});
		
		//Create a button that exits the window.
		JButton button4 = new JButton("Exit");
		button4.setBounds(100, 120, 80, 25);
		frame.add(button4);
		panel.add(button4);
		//Exit action.
		button4.addActionListener (new ActionListener () {
			 public void actionPerformed (ActionEvent e) {
			  System.exit(0);
			 }
			});
		
		//Create a button that calculates only the last 3 elements you have input.
		JButton button5 = new JButton("Calculate");
		button5.setBounds(200, 80, 120, 68);
		panel.add(button5);
		//Calculate action that find the sum of last 3 elements. 
		button5.addActionListener(new ActionListener () {

			public void actionPerformed(ActionEvent event) {
				double sum;
				if (array.size() < 3) {
					JOptionPane.showMessageDialog(frame, "Numbers less than 3 items");
				}else {
					sum = array.get(array.size()-1) + array.get(array.size()-2) + array.get(array.size()-3);
					txt.setText("" + sum);
				}
				
			}
			
			
		});
				
			}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	}
	
}