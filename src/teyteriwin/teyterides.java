package teyteriwin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.event.ChangeListener;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;

public class teyterides extends JFrame{


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teyterides window = new teyterides();
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
	public teyterides() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 473);
		
		JButton btnNewButton = new JButton("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u039D\u03AD\u03BF\u03C5 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		btnNewButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		btnNewButton.setBounds(65, 109, 309, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					frame2 framesec = new frame2();
					framesec.setVisible(true);

			}
		});
		frame.getContentPane().setLayout(null);
		btnNewButton.setBackground(new Color(102, 204, 204));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B7\u03C3\u03B7 \u03A0\u03B5\u03BB\u03B1\u03C4\u03CE\u03BD");
		btnNewButton_1.setBackground(new Color(102, 204, 204));
		btnNewButton_1.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame6 framesec = new frame6();
				framesec.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(65, 175, 309, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("\u03A4\u0395\u03A6\u03A4\u0395\u03A1\u0399 \u03A0\u0395\u039B\u0391\u03A4\u03A9\u039D");
		label.setBackground(new Color(135, 206, 250));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
		label.setBounds(88, 37, 253, 33);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u0394\u03B5\u03AF\u03C4\u03B5 \u0391\u03BD\u03B1\u03BB\u03C5\u03C4\u03B9\u03BA\u03AC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("teyteriwin.xlsx");
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.open(file);
				} catch (IOException e1){ }
			}
		});
		button.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		button.setBackground(new Color(102, 204, 204));
		button.setBounds(65, 305, 309, 33);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u03A0\u03B5\u03BB\u03B1\u03C4\u03CE\u03BD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frametel framesec = new frametel();
				framesec.setVisible(true);
			}
		});
		button_1.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		button_1.setBackground(new Color(102, 204, 204));
		button_1.setBounds(65, 242, 309, 33);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03B1 \u03A0\u03B5\u03BB\u03B1\u03C4\u03CE\u03BD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scroll framesec = new scroll();
				framesec.setVisible(true);
			}
		});
		button_2.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		button_2.setBackground(new Color(102, 204, 204));
		button_2.setBounds(65, 367, 309, 33);
		frame.getContentPane().add(button_2);
	}
}