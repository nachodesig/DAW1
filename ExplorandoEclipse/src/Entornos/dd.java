package Entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class dd {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dd window = new dd();
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
	public dd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 619, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(165, 29, 268, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(SystemColor.windowText);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(77, 107, 92, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setForeground(SystemColor.windowText);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(77, 158, 92, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Idioma:");
		lblNewLabel_1_2.setForeground(SystemColor.windowText);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(77, 210, 92, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo electrónico");
		lblNewLabel_1_3.setForeground(SystemColor.windowText);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(77, 255, 144, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Comunicación:");
		lblNewLabel_1_4.setForeground(SystemColor.windowText);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(77, 343, 128, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Teléfono");
		lblNewLabel_1_5.setForeground(SystemColor.windowText);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(77, 303, 92, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Observaciones:");
		lblNewLabel_1_6.setForeground(SystemColor.windowText);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(77, 393, 128, 14);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setBounds(285, 106, 207, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(285, 157, 207, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(285, 209, 207, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(285, 254, 207, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(285, 302, 207, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(285, 392, 268, 63);
		frame.getContentPane().add(textField_5);
	}
}
