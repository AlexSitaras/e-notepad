package teyteriwin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scroll extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scroll frame = new scroll();
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
	public scroll() {
		
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
            Collections.sort(sheetNames);
            final List<String> sheetNames1 = new ArrayList<String>();
            
            for (int o=0; o<workbook.getNumberOfSheets(); o++) {
                sheetNames1.add( workbook.getSheetName(o) );
            }
            double a=0;
            String[][] sh = new String [sheetNames.size()][3] ; 
            for (int q=0; q<sheetNames.size(); q++) {
            	  XSSFSheet sheet1 = workbook.getSheetAt(q);
      	        Iterator<Row> rowIterator1 = sheet1.iterator(); 
                  while (rowIterator1.hasNext()) { 
                      Row row = rowIterator1.next(); 
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
                  } 
                  file.close();
                  String a2 = Double.toString(a) ;
                  
                sh[q][0] = sheetNames.get(q);
                sh[q][2] = "€";

                for (int p=0; p<sheetNames.size(); p++) {
                if (sheetNames.get(p) == sheetNames1.get(q)) {
                sh[p][1] = a2;
                }}
            }
            
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 27, 564, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			sh,
			new String[] {
				"\u038C\u03BD\u03BF\u03BC\u03B1", "\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF", "M.M."
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(360);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setPreferredWidth(35);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Κλείσιμο");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(241, 319, 127, 23);
		contentPane.add(btnNewButton);
		
		
             
	
		} catch (IOException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		 
	}
}
