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
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class Calculator extends JFrame {
	// Variables propias
	double num1;
	double num2;
	String sign;
	String text;

	//Variables Interfaz
	private JPanel contentPane;
	private JLabel lblCalculator;
	private JLabel Ingreso;
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
	private JButton btnCalcular;
	private JButton btnC;
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setForeground(Color.WHITE);
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
		contentPane.add(getBtnCalcular());
		contentPane.add(getBtnC());
	}
	private JLabel getLblCalculator() {
		if (lblCalculator == null) {
			lblCalculator = new JLabel("Calculator");
			lblCalculator.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
			lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
			lblCalculator.setBounds(80, 0, 116, 31);
		}
		return lblCalculator;
	}
	private JLabel getIngreso() {
		if (Ingreso == null) {
			Ingreso = new JLabel();
			Ingreso.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			Ingreso.setHorizontalAlignment(SwingConstants.CENTER);
			Ingreso.setForeground(Color.BLACK);
			Ingreso.setBackground(Color.BLACK);
			Ingreso.setBounds(10, 34, 254, 20);
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
			btnInfo.setBounds(230, 0, 63, 23);
		}
		return btnInfo;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("1");
			button.setBackground(Color.LIGHT_GRAY);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"1");
				}
			});
			button.setBounds(10, 73, 45, 36);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("4");
			button_1.setBackground(Color.LIGHT_GRAY);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"4");
				}
			});
			button_1.setBounds(10, 120, 45, 36);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("7");
			button_2.setBackground(Color.LIGHT_GRAY);
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"7");
				}
			});
			button_2.setBounds(10, 167, 45, 36);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("2");
			button_3.setBackground(Color.LIGHT_GRAY);
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"2");
				}
			});
			button_3.setBounds(65, 73, 45, 36);
		}
		return button_3;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("5");
			button_4.setBackground(Color.LIGHT_GRAY);
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"5");
				}
			});
			button_4.setBounds(65, 120, 45, 36);
		}
		return button_4;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("8");
			button_5.setBackground(Color.LIGHT_GRAY);
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"8");
				}
			});
			button_5.setBounds(65, 167, 45, 36);
		}
		return button_5;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("3");
			button_6.setBackground(Color.LIGHT_GRAY);
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"3");
				}
			});
			button_6.setBounds(120, 73, 45, 36);
		}
		return button_6;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("6");
			button_7.setBackground(Color.LIGHT_GRAY);
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"6");
				}
			});
			button_7.setBounds(120, 120, 45, 36);
		}
		return button_7;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("9");
			button_8.setBackground(Color.LIGHT_GRAY);
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"9");
				}
			});
			button_8.setBounds(120, 167, 45, 36);
		}
		return button_8;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("-");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text = Ingreso.getText();
					if(text.isEmpty()){
						JOptionPane.showMessageDialog(null,"Ingrese un numero primero.", "Error",JOptionPane.ERROR_MESSAGE);
					}
					else {
						sign = "-";
						num1 = Double.parseDouble(text);
						Ingreso.setText("");

					}
				}
			});
			button_9.setBackground(Color.LIGHT_GRAY);
			button_9.setBounds(181, 214, 45, 36);
		}
		return button_9;
	}
	private JButton getButton_10() {
		if (button_10 == null) {
			button_10 = new JButton("/");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text = Ingreso.getText();
					if(text.isEmpty()){
						JOptionPane.showMessageDialog(null,"Ingrese un numero primero.", "Error",JOptionPane.ERROR_MESSAGE);
					}
					else {
						sign = "/";
						num1 = Double.parseDouble(text);
						Ingreso.setText("");

					}
				}
			});
			button_10.setBackground(Color.LIGHT_GRAY);
			button_10.setBounds(181, 167, 45, 36);
		}
		return button_10;
	}
	private JButton getButton_11() {
		if (button_11 == null) {
			button_11 = new JButton("+");
			button_11.setBackground(Color.LIGHT_GRAY);
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text = Ingreso.getText();
					if(text.isEmpty()){
						JOptionPane.showMessageDialog(null,"Ingrese un numero primero.", "Error",JOptionPane.ERROR_MESSAGE);
					}
					else {
						if (sign.isEmpty()) {
							sign = "+";
							num1 = Double.parseDouble(text);
							Ingreso.setText("");
						}
						else 
							JOptionPane.showMessageDialog(null,".", "Error",JOptionPane.ERROR_MESSAGE);	
					}
				}
			});
			button_11.setBounds(181, 73, 45, 36);
		}
		return button_11;
	}
	private JButton getButton_12() {
		if (button_12 == null) {
			button_12 = new JButton("*");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text = Ingreso.getText();
					if(text.isEmpty()){
						JOptionPane.showMessageDialog(null,"Ingrese un numero primero.", "Error",JOptionPane.ERROR_MESSAGE);
					}
					else {
						sign = "*";
						num1 = Double.parseDouble(text);
						Ingreso.setText("");

					}
				}
			});
			button_12.setBackground(Color.LIGHT_GRAY);
			button_12.setBounds(181, 120, 45, 36);
		}
		return button_12;
	}
	private JButton getButton_13() {
		if (button_13 == null) {
			button_13 = new JButton("0");
			button_13.setBackground(Color.LIGHT_GRAY);
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+"0");
				}
			});
			button_13.setBounds(65, 214, 45, 36);
		}
		return button_13;
	}
	private JButton getButton_14() {
		if (button_14 == null) {
			button_14 = new JButton(".");
			button_14.setBackground(Color.LIGHT_GRAY);
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText(Ingreso.getText()+".");
				}
			});
			button_14.setBounds(10, 214, 45, 36);
		}
		return button_14;
	}
	private JButton getBtnCalcular() {
		if (btnCalcular == null) {
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					text = Ingreso.getText();
					if(!text.isEmpty()){
						num2 = Double.parseDouble(text);
						switch(sign){
						case "+":
							Ingreso.setText(Double.toString(num1+num2));
							sign = "";
							break;
						case "-":
							Ingreso.setText(Double.toString(num1-num2));
							sign = "";
							break;
						case "/":
							Ingreso.setText(Double.toString(num1/num2));
							sign = "";
							break;
						case "*":
							Ingreso.setText(Double.toString(num1*num2));
							sign = "";
							break;	
						default:
							JOptionPane.showMessageDialog(null,"No se ha ingresado una operacion valida", "Error", JOptionPane.ERROR_MESSAGE);
						}
					}
					else
						JOptionPane.showMessageDialog(null,"Ingrese un numero primero.", "Error",JOptionPane.ERROR_MESSAGE);

				}
			}
					);
			btnCalcular.setBackground(Color.LIGHT_GRAY);
			btnCalcular.setBounds(65, 286, 89, 23);
		}
		return btnCalcular;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("C");
			btnC.setBackground(Color.LIGHT_GRAY);
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Ingreso.setText("");
				}
			});
			btnC.setBounds(120, 214, 45, 36);
		}
		return btnC;
	}
}
