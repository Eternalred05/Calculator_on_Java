package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JLabel lblCalculator;
	private JTextField Ingreso;
	private JButton btnInfo;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblCalculator());
		contentPane.add(getIngreso());
		contentPane.add(getBtnInfo());
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getButton_2());
		contentPane.add(getButton_3());
		contentPane.add(getButton_4());
		contentPane.add(getButton_5());
		contentPane.add(getButton_6());
		contentPane.add(getButton_7());
		contentPane.add(getButton_8());
		contentPane.add(getButton_9());
		contentPane.add(getButton_10());
		contentPane.add(getButton_11());
		contentPane.add(getButton_12());
		contentPane.add(getButton_13());
		contentPane.add(getButton_14());
	}
	private JLabel getLblCalculator() {
		if (lblCalculator == null) {
			lblCalculator = new JLabel("Calculator");
			lblCalculator.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
			lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
			lblCalculator.setBounds(144, 0, 135, 31);
		}
		return lblCalculator;
	}
	private JTextField getIngreso() {
		if (Ingreso == null) {
			Ingreso = new JTextField();
			Ingreso.setBounds(35, 24, 357, 20);
			Ingreso.setColumns(10);
		}
		return Ingreso;
	}
	private JButton getBtnInfo() {
		if (btnInfo == null) {
			btnInfo = new JButton("Info");
			btnInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String info = "Desarrollado por Alexandro Valdés Piñeda y Gloria Santos Rosado.";
					JOptionPane.showMessageDialog(null,info,"Informacion",JOptionPane.INFORMATION_MESSAGE);		
				}
			});
			btnInfo.setBounds(361, 227, 63, 23);
		}
		return btnInfo;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("1");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button.setBounds(10, 73, 45, 36);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("4");
			button_1.setBounds(10, 120, 45, 36);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("7");
			button_2.setBounds(10, 167, 45, 36);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("2");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_3.setBounds(71, 73, 45, 36);
		}
		return button_3;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("5");
			button_4.setBounds(71, 120, 45, 36);
		}
		return button_4;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("8");
			button_5.setBounds(71, 167, 45, 36);
		}
		return button_5;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("3");
			button_6.setBounds(126, 73, 45, 36);
		}
		return button_6;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("6");
			button_7.setBounds(126, 120, 45, 36);
		}
		return button_7;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("9");
			button_8.setBounds(126, 167, 45, 36);
		}
		return button_8;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("-");
			button_9.setBounds(267, 120, 45, 36);
		}
		return button_9;
	}
	private JButton getButton_10() {
		if (button_10 == null) {
			button_10 = new JButton("/");
			button_10.setBounds(335, 120, 45, 36);
		}
		return button_10;
	}
	private JButton getButton_11() {
		if (button_11 == null) {
			button_11 = new JButton("+");
			button_11.setBounds(267, 80, 45, 36);
		}
		return button_11;
	}
	private JButton getButton_12() {
		if (button_12 == null) {
			button_12 = new JButton("*");
			button_12.setBounds(335, 80, 45, 36);
		}
		return button_12;
	}
	private JButton getButton_13() {
		if (button_13 == null) {
			button_13 = new JButton("0");
			button_13.setBounds(71, 214, 45, 36);
		}
		return button_13;
	}
	private JButton getButton_14() {
		if (button_14 == null) {
			button_14 = new JButton(",");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_14.setBounds(126, 214, 45, 36);
		}
		return button_14;
	}
}
