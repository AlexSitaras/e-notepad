package teyteriwin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class frame2 extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame2 frame = new frame2();
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
	public frame2()  {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNewLabel.setBounds(34, 11, 199, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(34, 47, 357, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
				JButton btnNewButton = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnNewButton.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
						try {
						 FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
						  
				            // Create Workbook instance holding reference to .xlsx file 
				            XSSFWorkbook workbook = new XSSFWorkbook(file); 
				  
				            // Get first/desired sheet from the workbook 
				  
				            // Iterate through each rows one by one 
				            
				            
						String pel = textField.getText();
											
							double xr = Double.parseDouble(textField_1.getText()) ; 
							XSSFSheet sheet1 = workbook.createSheet(pel);
							
							Iterator<Row> rowIterator = sheet1.iterator(); 
							Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
					        data.put("1", new Object[]{ "Ημ/νια", "Περιγραφή", "Ποσό","Είσπραξη/Πίστωση", "Υπόλοιπο" }); 
					        data.put("2", new Object[]{ "", "", "", "", xr }); 
					       int s = workbook.getNumberOfSheets();
					        sheet1.setColumnWidth(0, 5000);
					        sheet1.setColumnWidth(1, 15000);
					        sheet1.setColumnWidth(2, 4000);
					        sheet1.setColumnWidth(3, 4500);
					        sheet1.setColumnWidth(4, 4000);

					        Set<String> keyset = data.keySet(); 
					        int rownum = 0; 
					        int i=0;
					        for (String key : keyset) { 
					            // this creates a new row in the sheet 
					            Object[] objArr = data.get(key); 
					            
					           Row row = sheet1.createRow(rownum++); 

					            int cellnum = 0; 
					            for (Object obj : objArr) { 
					                // this line creates a cell in the next column of that row 
					               Cell cell = row.createCell(cellnum++); 
					                if (obj instanceof String) 
					                    cell.setCellValue((String)obj); 
					                
					                else if (obj instanceof Integer) 
					                    cell.setCellValue((Integer)obj);

					                else if (obj instanceof Double) 
					                    cell.setCellValue((Double)obj); 
					            } 
					        } 
						
					      
					        
					       
						    FileOutputStream outputStream = new FileOutputStream("teyteriwin.xlsx") ;
						    workbook.write(outputStream);
						    workbook.close();
				            System.out.println("xlsx written successfully on disk.");
						} catch (IOException e1) {
						    // TODO Auto-generated catch block
						    e1.printStackTrace();
						}
						dispose();
						frame2 framesec = new frame2();
						framesec.setVisible(true);
					}
						
					
				});
				
				
				
				btnNewButton.setBounds(103, 181, 213, 25);
				contentPane.add(btnNewButton);
				
				JButton button = new JButton("\u03A4\u03AD\u03BB\u03BF\u03C2");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();		
								
						}
				});
				button.setBounds(325, 226, 89, 23);
				contentPane.add(button);
				
				JLabel label = new JLabel("Οφειλή");
				label.setFont(new Font("Sitka Small", Font.BOLD, 20));
				label.setBounds(34, 98, 239, 25);
				contentPane.add(label);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(34, 134, 357, 25);
				contentPane.add(textField_1);
				
				
				 
				
				
				
	}
	
	public static void excelWrite(XSSFWorkbook workbook, ArrayList<Object> Prints, int indexSelect) {

	    XSSFSheet sheet = workbook.createSheet("Achievers"+indexSelect);
	    System.out.println("Getting sheet at ..:" +indexSelect);
	    int rowCount = 0;

	    int columnCount = indexSelect;

	    for (Object field :Prints) {
	        Row row = sheet.createRow(++rowCount);
	        Cell cell = row.createCell(columnCount);
	        if (field instanceof String) {
	            cell.setCellValue((String) field);
	        } else if (field instanceof Integer) {
	            cell.setCellValue((Integer) field);
	        }
	    }

	    System.out.println("Current indexSelect is: "+indexSelect);
	}
}
