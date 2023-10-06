package teyteriwin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class framedel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int msg = (Integer) null;
					framedel frame = new framedel(msg);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public framedel(final int msg) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03B4\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03C4\u03BF\u03C5 \u03C0\u03B5\u03BB\u03AC\u03C4\u03B7 ;");
		label.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 21, 424, 34);
		contentPane.add(label);
		
		JButton button = new JButton("\u0386\u03BA\u03C5\u03C1\u03BF");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame6 framesec = new frame6();
				framesec.setVisible(true); 
			}
		});
		button.setBounds(93, 111, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				try { 
					FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 

					    // Create Workbook instance holding reference to .xlsx file 
			            XSSFWorkbook workbook = new XSSFWorkbook(file); 
			  
			            // Get first/desired sheet from the workbook 
			            XSSFSheet sheet = workbook.getSheetAt(msg); 
  
					
				FileOutputStream out = new FileOutputStream(new File("teyteriwin.xlsx")); 
				workbook.setActiveSheet(msg);

		  
		            // Get first/desired sheet from the workbook 
		          workbook.removeSheetAt(msg);
		          workbook.write(out); 
		            out.close(); 
		           file.close();
		            // Create Work
				} catch (IOException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				dispose();
				frame6 framesec = new frame6();
				framesec.setVisible(true); 
			
				}
		});
		button_1.setBounds(257, 111, 101, 23);
		contentPane.add(button_1);
	}
}
