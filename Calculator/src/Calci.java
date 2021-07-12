import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Font;

public class Calci {

	private JFrame frame;
	private JTextField Screen;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		Screen = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, Screen, 43, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Screen, 32, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, Screen, 87, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Screen, 376, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(Screen);
		Screen.setColumns(10);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnTwo.getText();
				Screen.setText(number);
			}
		});
		frame.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnThree.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnThree, 45, SpringLayout.EAST, btnTwo);
		springLayout.putConstraint(SpringLayout.NORTH, btnTwo, 0, SpringLayout.NORTH, btnThree);
		springLayout.putConstraint(SpringLayout.NORTH, btnThree, 84, SpringLayout.SOUTH, Screen);
		frame.getContentPane().add(btnThree);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnOne.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnTwo, 40, SpringLayout.EAST, btnOne);
		springLayout.putConstraint(SpringLayout.NORTH, btnOne, 84, SpringLayout.SOUTH, Screen);
		springLayout.putConstraint(SpringLayout.WEST, btnOne, 0, SpringLayout.WEST, Screen);
		frame.getContentPane().add(btnOne);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnFour.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnFour, 34, SpringLayout.SOUTH, btnOne);
		springLayout.putConstraint(SpringLayout.EAST, btnFour, 0, SpringLayout.EAST, btnOne);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnFive.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnFive, 0, SpringLayout.NORTH, btnFour);
		springLayout.putConstraint(SpringLayout.WEST, btnFive, 0, SpringLayout.WEST, btnTwo);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnSix.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnSix, 0, SpringLayout.NORTH, btnFour);
		springLayout.putConstraint(SpringLayout.WEST, btnSix, 0, SpringLayout.WEST, btnThree);
		frame.getContentPane().add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnSeven.getText();
				Screen.setText(number);}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnSeven, 28, SpringLayout.SOUTH, btnFour);
		springLayout.putConstraint(SpringLayout.EAST, btnSeven, 0, SpringLayout.EAST, btnOne);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnEight.getText();
				Screen.setText(number);}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnEight, 0, SpringLayout.NORTH, btnSeven);
		springLayout.putConstraint(SpringLayout.WEST, btnEight, 0, SpringLayout.WEST, btnTwo);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnNine.getText();
				Screen.setText(number);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNine, 0, SpringLayout.WEST, btnThree);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNine, 0, SpringLayout.SOUTH, btnSeven);
		frame.getContentPane().add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnZero.getText();
				Screen.setText(number);}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnZero, 24, SpringLayout.SOUTH, btnSeven);
		springLayout.putConstraint(SpringLayout.EAST, btnZero, 0, SpringLayout.EAST, btnOne);
		frame.getContentPane().add(btnZero);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(Screen.getText());
				Screen.setText("");
				operation = "+";
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 0, SpringLayout.NORTH, btnZero);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, 0, SpringLayout.EAST, btnTwo);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(Screen.getText());
				Screen.setText("");
				operation = "-";
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnMinus, 0, SpringLayout.NORTH, btnZero);
		springLayout.putConstraint(SpringLayout.EAST, btnMinus, 0, SpringLayout.EAST, btnThree);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(Screen.getText());
				Screen.setText("");
				operation = "*";}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiply, 0, SpringLayout.NORTH, btnTwo);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiply, 53, SpringLayout.EAST, btnThree);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(Screen.getText());
				Screen.setText("");
				operation = "/";}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnDivide, 0, SpringLayout.NORTH, btnFour);
		springLayout.putConstraint(SpringLayout.WEST, btnDivide, 0, SpringLayout.WEST, btnMultiply);
		frame.getContentPane().add(btnDivide);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.setText(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnClear, 0, SpringLayout.NORTH, btnSeven);
		springLayout.putConstraint(SpringLayout.EAST, btnClear, 0, SpringLayout.EAST, btnMultiply);
		frame.getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("D");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String btnBack=null;
			if(Screen.getText().length()>0) {
				StringBuilder str = new StringBuilder(Screen.getText());
				str.deleteCharAt(Screen.getText().length()-1);
				btnBack = str.toString();
				Screen.setText(btnBack);
				
			
			
			}
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBack, 0, SpringLayout.NORTH, btnZero);
		springLayout.putConstraint(SpringLayout.EAST, btnBack, 0, SpringLayout.EAST, btnMultiply);
		frame.getContentPane().add(btnBack);
		
		JButton btnDoublezero = new JButton("00");
		btnDoublezero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnDoublezero.getText();
				Screen.setText(number);}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnDoublezero, 36, SpringLayout.SOUTH, btnZero);
		springLayout.putConstraint(SpringLayout.WEST, btnDoublezero, 0, SpringLayout.WEST, Screen);
		frame.getContentPane().add(btnDoublezero);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(Screen.getText());
				Screen.setText("");
				operation = "%";}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnPercent, 0, SpringLayout.NORTH, btnDoublezero);
		springLayout.putConstraint(SpringLayout.WEST, btnPercent, 0, SpringLayout.WEST, btnTwo);
		frame.getContentPane().add(btnPercent);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Screen.getText()+btnDot.getText();
				Screen.setText(number);}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnDot, 0, SpringLayout.NORTH, btnDoublezero);
		springLayout.putConstraint(SpringLayout.EAST, btnDot, 0, SpringLayout.EAST, btnThree);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String answer;
			second = Double.parseDouble(Screen.getText());
			if(operation == "*") {
				result = first * second;
				answer = String.format("%.2f", result);
				Screen.setText(answer);
			}
			else if(operation == "+") {
				result = first + second;
				answer = String.format("%.2f", result);
				Screen.setText(answer);
			}
			else if(operation == "-") {
				result = first - second;
				answer = String.format("%.2f", result);
				Screen.setText(answer);
			}
			else if(operation == "/") {
				result = first / second;
				answer = String.format("%.2f", result);
				Screen.setText(answer);
			}
			else if(operation == "%") {
				result = (first) * second/100;
				answer = String.format("%.2f", result);
				Screen.setText(answer);
			}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnEqual, 0, SpringLayout.NORTH, btnDoublezero);
		springLayout.putConstraint(SpringLayout.WEST, btnEqual, 0, SpringLayout.WEST, btnMultiply);
		frame.getContentPane().add(btnEqual);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
