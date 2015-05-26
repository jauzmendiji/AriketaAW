import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ariketa {

	private JFrame frmAriketaAppwindow;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ariketa window = new Ariketa();
					window.frmAriketaAppwindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ariketa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAriketaAppwindow = new JFrame();
		frmAriketaAppwindow.setTitle("Ariketa AppWindow");
		frmAriketaAppwindow.setBounds(100, 100, 450, 300);
		frmAriketaAppwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAriketaAppwindow.getContentPane().setLayout(null);
		
		JButton btnBidali = new JButton("Bidali");
		btnBidali.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String testua = textField.getText().toString();
	            System.out.println(testua);
			}
		});
		btnBidali.setBounds(36, 183, 139, 45);
		frmAriketaAppwindow.getContentPane().add(btnBidali);
		
		JButton btnEzeztatu = new JButton("Ezeztatu");
		btnEzeztatu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");

			}
		});
		btnEzeztatu.setBounds(274, 183, 139, 45);
		frmAriketaAppwindow.getContentPane().add(btnEzeztatu);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("Button.shadow"));
		textField.setBounds(93, 31, 253, 99);
		frmAriketaAppwindow.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
