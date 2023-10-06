package teyteriwin;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class frame4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int msg = (Integer) null;
					frame4 frame = new frame4(msg);
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
	public frame4(int msg) {
		try {
			
			FileInputStream file = new FileInputStream(new File("teyteriwin.xlsx")); 
			double a = 0 ; 
			XSSFWorkbook  workbook = new XSSFWorkbook(file);
	        XSSFWorkbook test = new XSSFWorkbook(); 
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
                        break; 
                    }  
                } 
                System.out.println(""); 
            } 
            file.close();   
            
            String a2 = Double.toString(a) ; 
            
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u03A4\u03BF \u03A4\u03B5\u03BB\u03B9\u03BA\u03CC \u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u03A4\u03BF\u03C5 " +workbook.getSheetName(msg));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		label.setBounds(10, 11, 399, 21);
		contentPane.add(label);
		
		JButton button = new JButton("\u0394\u03B5\u03AF\u03C4\u03B5 \u03B1\u03BD\u03B1\u03BB\u03C5\u03C4\u03B9\u03BA\u03AC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("teyteriwin.xlsx");
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.open(file);
				} catch (IOException e1){ }


			
			}
		});
		button.setBounds(258, 121, 134, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u039F\u039A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame6 framesec = new frame6();
				framesec.setVisible(true);
			
			}
		});
		button_1.setBounds(36, 121, 67, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel(a2);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
		label_1.setBounds(29, 62, 296, 29);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("€");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 30));
		lblNewLabel.setBounds(335, 62, 46, 28);
		contentPane.add(lblNewLabel);
		
		}
		catch (Exception e) { 
            e.printStackTrace(); 
        }
		}
}
