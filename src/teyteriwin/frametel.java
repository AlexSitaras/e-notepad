package teyteriwin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class frametel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frametel frame = new frametel();
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
	public frametel() {
try {
			
	
			FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
			
			XSSFWorkbook  workbook = new XSSFWorkbook(file);
	        int msg= workbook.getNumberOfSheets();
	        
	        double a = 0 ; 
	        int i;
	       double tel = 0 ;
	        
           for (i=0 ; i<msg ; i++ ) {  XSSFSheet sheet = workbook.getSheetAt(i);
	        Iterator<Row> rowIterator = sheet.iterator();
        	   while (rowIterator.hasNext()) { 
                 Row row = rowIterator.next(); 
                // For each row, iterate through all the columns 
                Iterator<Cell> cellIterator = row.cellIterator(); 
  
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    // Check the cell type and format accordingly 
                    switch (cell.getCellType()) { 
                    case Cell.CELL_TYPE_NUMERIC: 
                         a = cell.getNumericCellValue() ; 
                        break; 
                    }  
                } 
                
                
                System.out.println(""); 
            } tel = tel + a ;
	        }
            file.close();   
            
            String t = Double.toString(tel) ; 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A4\u03BF \u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u0392\u03C1\u03AF\u03C3\u03BA\u03B5\u03C4\u03B5 \u03A3\u03C4\u03B1 :");
		lblNewLabel.setFont(new Font("Sitka Small", Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 22, 367, 28);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u20AC");
		label.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
		label.setBounds(354, 61, 35, 64);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\u039F\u039A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(151, 136, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(t);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 61, 324, 64);
		contentPane.add(lblNewLabel_1);
		}
		catch (Exception e) { 
			e.printStackTrace(); 
		}
	}
}
