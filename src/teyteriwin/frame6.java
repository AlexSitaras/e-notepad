package teyteriwin;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame6 frame = new frame6();
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
	public frame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try { 
            FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
  
            // Create Workbook instance holding reference to .xlsx file 
            XSSFWorkbook workbook = new XSSFWorkbook(file); 
  
            // Get first/desired sheet from the workbook 
            XSSFSheet sheet = workbook.getSheetAt(0); 
  
            // Iterate through each rows one by one 
            Iterator<Row> rowIterator = sheet.iterator();    
             

          final List<String> sheetNames = new ArrayList<String>();
            for (int i=0; i<workbook.getNumberOfSheets(); i++) {
                sheetNames.add( workbook.getSheetName(i) );
            }
            
            String[] sh = new String [sheetNames.size()] ; 
            for (int q=0; q<sheetNames.size(); q++) {
                sh[q] = sheetNames.get(q);
            }
            
            Arrays.sort(sh);
		final JComboBox comboBox = new JComboBox(sh);
		comboBox.setEditable(true);
		comboBox.setBounds(28, 89, 273, 25);
		contentPane.add(comboBox);
		
		AutoCompleteDecorator.decorate(comboBox);
		String s=String.valueOf(comboBox.getSelectedItem()); 
		int msg = 0;

		for (int p=0; p<sheetNames.size(); p++) {
			if( s == sheetNames.get(p)) {
				msg = p ;
			}
   
		}
		
		JButton btnOk = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u0395\u03BD\u03AD\u03C1\u03B3\u03B5\u03B9\u03B1\u03C2");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s=String.valueOf(comboBox.getSelectedItem()); 
						int msg = 0;
		
						for (int p=0; p<sheetNames.size(); p++) {
							if( s == sheetNames.get(p)) {
								msg = p ;
							}
	               
						}
						
				
									
					dispose();
					feelarisma framesec = new feelarisma(msg);
					framesec.setVisible(true); 
				
				}
		});
		btnOk.setBounds(260, 165, 182, 23);
		contentPane.add(btnOk);
		
		JLabel label = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Small", Font.BOLD, 20));
		label.setBounds(100, 29, 273, 25);
		contentPane.add(label);
		
		JButton button = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s=String.valueOf(comboBox.getSelectedItem()); 
				int msg = 0;

				for (int p=0; p<sheetNames.size(); p++) {
					if( s == sheetNames.get(p)) {
						msg = p ;
					}
           
				}
				
			
				
				dispose();
				framedel framesec = new framedel(msg);
				framesec.setVisible(true); 
			
				
			}
		});
		button.setBounds(28, 165, 182, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
		            FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
		  
		            // Create Workbook instance holding reference to .xlsx file 
		            XSSFWorkbook workbook = new XSSFWorkbook(file);		
				
				
				String s=String.valueOf(comboBox.getSelectedItem()); 
				int msg = 0;

				for (int p=0; p<sheetNames.size(); p++) {
					if( s == sheetNames.get(p)) {
						msg = p ;
					}
           
				}
				
				FileOutputStream out = new FileOutputStream(new File("teyteriwin.xlsx")); 
		        workbook.setActiveSheet(msg);

			 workbook.write(out); 
		    out.close(); 
		   file.close();
				dispose();
				frame4 framesec = new frame4(msg);
				framesec.setVisible(true); 
			} catch (IOException e1) {
			    // TODO Auto-generated catch block
			    e1.printStackTrace();
			}
			}
			
		});
		btnNewButton.setBounds(322, 90, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(188, 238, 89, 23);
		contentPane.add(btnNewButton_1);
	
		} catch (IOException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		
		}
}
