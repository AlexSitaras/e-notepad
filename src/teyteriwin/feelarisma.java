package teyteriwin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class feelarisma extends JFrame {

	private JPanel contentPane;
	private JTextField txtEeeee;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					int msg = (Integer) null;
					feelarisma frame = new feelarisma(msg);
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
	public feelarisma(int msg) {
		
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		try {
			FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
			double a = 0 ; 
			XSSFWorkbook  workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(msg);
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
                        System.out.print(a);
                        break; 
                    }  
                } 
                System.out.println(""); 
            } 
            file.close(); 
	       
		
		JLabel label = new JLabel("\u039A\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03AF\u03C3\u03C4\u03B5 \u03B5\u03BD\u03AD\u03C1\u03B3\u03B5\u03B9\u03B1 \u03B3\u03B9\u03B1 \u03C4\u03BF\u03BD \u03C0\u03B5\u03BB\u03AC\u03C4\u03B7 " +workbook.getSheetName(msg));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		label.setBounds(10, 27, 637, 26);
		contentPane.add(label);
		
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = dateFormat.format(date);	
		 
		txtEeeee = new JTextField();
		txtEeeee.setText(strDate);
		txtEeeee.setBounds(133, 91, 514, 26);
		contentPane.add(txtEeeee);
		txtEeeee.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 148, 514, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 209, 514, 26);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1 :");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(10, 91, 113, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE :");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(10, 148, 113, 26);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u03A0\u03BF\u03C3\u03CC :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(10, 209, 113, 26);
		contentPane.add(label_3);
		final int i = msg;
		final double a2 = a;
		
		final JRadioButton radioButton = new JRadioButton("\u0395\u03AF\u03C3\u03C0\u03C1\u03B1\u03BE\u03B7");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton.setBounds(133, 242, 109, 23);
		contentPane.add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("Πίστωση");
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton_1.setBounds(244, 242, 109, 23);
		contentPane.add(radioButton_1);
		
		JButton btnNewButton = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
				
				  
	            // Create Workbook instance holding reference to .xlsx file 
	            XSSFWorkbook workbook = new XSSFWorkbook(file); 
	  
	            // Get first/desired sheet from the workbook 
	            XSSFSheet sheet = workbook.getSheetAt(i); 

	            // Iterate through each rows one by one 
				Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
		        int rownum = sheet.getLastRowNum(); 
		        System.out.print(rownum);
		        String t = txtEeeee.getText();
		        String t1 = textField_1.getText();
		        double t2 = Double.parseDouble(textField_2.getText());
		        double end = 0 ;	
		        String ener = null;
		        if(radioButton_1.isSelected()) {
		        	end = a2 + t2 ;
		        	ener = "Πίστωση(+)";}
		        else if(radioButton.isSelected()){
		        	end = a2 - t2 ; 
		        	ener = "Είσπραξη(-)" ;
		        }
		        

		        data.put("2", new Object[]{ t, t1, t2, ener, end}); 

		        rownum = rownum + 1 ;
		        Set<String> keyset = data.keySet(); 
		        for (String key : keyset) { 
		            // this creates a new row in the sheet 
		            Row row1 = sheet.createRow(rownum++); 
		            Object[] objArr = data.get(key); 
		            int cellnum = 0; 
		            for (Object obj : objArr) { 
		                // this line creates a cell in the next column of that row 
		                Cell cell1 = row1.createCell(cellnum++); 
		                if (obj instanceof String) 
		                    cell1.setCellValue((String)obj); 
		                else if (obj instanceof Integer) 
		                    cell1.setCellValue((Integer)obj); 
		                else if (obj instanceof Double ) 
		                    cell1.setCellValue((Double)obj);
		            } 
		        } 
				
				if ((radioButton_1.isSelected() || radioButton.isSelected()) && !(radioButton_1.isSelected() && radioButton.isSelected()) ) {
					 FileOutputStream out = new FileOutputStream(new File("teyteriwin.xlsx")); 
				        workbook.setActiveSheet(i);

					 workbook.write(out); 
		            out.close(); 
		           file.close();
		           dispose();
					frame4 framesec = new frame4(i);
					framesec.setVisible(true);
				}
				else {
					frame5 framesec = new frame5();
					framesec.setVisible(true);
				}
				
				
		           
				}catch (Exception e1) { 
		            e1.printStackTrace(); 
		        }
				
				}

		});
		
		btnNewButton.setBounds(223, 295, 213, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame6 framesec = new frame6();
				framesec.setVisible(true); 
			}
		
			
		});
		
		
		btnNewButton_1.setBounds(558, 337, 89, 23);
		contentPane.add(btnNewButton_1);
		

		}
		catch (Exception e) { 
            e.printStackTrace(); 
        }
	}
}
