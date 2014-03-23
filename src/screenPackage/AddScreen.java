package screenPackage;

import hardCodePackage.EmployeeRegister;
import hardCodePackage.User;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class AddScreen extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textName, txtEmployNum, textEmpTitle, textDepartment,
			textContractDateStart, textContractLength;
	private JButton cancel, add;
	private JTextArea description;
	private JRadioButton genderMale, genderFemale;
	private EmployeeRegister EList;

	public AddScreen() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.RED);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 658, 756);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(76, 34, 507, 651);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.RED);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		textName = new JTextField();
		textName.setBackground(Color.WHITE);
		textName.setBounds(106, 105, 101, 20);
		panel.add(textName);
		textName.setColumns(10);

		JLabel lblEmployeeNo = new JLabel("Name:");
		lblEmployeeNo.setForeground(Color.BLACK);
		lblEmployeeNo.setBackground(Color.WHITE);
		lblEmployeeNo.setFont(new Font("Arial", Font.PLAIN, 13));
		lblEmployeeNo.setBounds(10, 104, 86, 20);
		panel.add(lblEmployeeNo);

		JLabel lblPassword = new JLabel("Emp.No:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(20, 134, 59, 30);
		panel.add(lblPassword);

		JLabel lblNewLabel = new JLabel("McRoched Industries");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 35, 181, 32);
		panel.add(lblNewLabel);

		genderMale = new JRadioButton("Male");
		genderMale.setBounds(109, 175, 54, 23);
		panel.add(genderMale);

		genderFemale = new JRadioButton("Female");
		genderFemale.setBounds(183, 175, 70, 23);
		panel.add(genderFemale);
		ButtonGroup b = new ButtonGroup();
		b.add(genderMale);
		b.add(genderFemale);
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGender.setBounds(10, 175, 72, 23);
		panel.add(lblGender);

		JLabel lblEmpTitle = new JLabel("Emp. Title:");
		lblEmpTitle.setForeground(Color.BLACK);
		lblEmpTitle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEmpTitle.setBounds(10, 209, 72, 23);
		panel.add(lblEmpTitle);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(Color.BLACK);
		lblDepartment.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDepartment.setBounds(10, 243, 72, 23);
		panel.add(lblDepartment);

		txtEmployNum = new JTextField();
		txtEmployNum.setText("autoGenerated");
		txtEmployNum.setEditable(false);
		txtEmployNum.setBackground(Color.WHITE);
		txtEmployNum.setBounds(105, 133, 102, 20);
		panel.add(txtEmployNum);
		txtEmployNum.setColumns(10);

		textEmpTitle = new JTextField();
		textEmpTitle.setBounds(106, 211, 136, 20);
		panel.add(textEmpTitle);
		textEmpTitle.setColumns(10);

		textDepartment = new JTextField();
		textDepartment.setBounds(105, 245, 137, 20);
		panel.add(textDepartment);
		textDepartment.setColumns(10);

		add = new JButton("Add");
		add.addActionListener(this);
		add.setBounds(10, 548, 101, 33);
		panel.add(add);

		cancel = new JButton("Cancel");
		cancel.setBounds(191, 548, 120, 33);
		panel.add(cancel);
		cancel.addActionListener(this);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_1.setBounds(10, 277, 301, 207);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblContractStartDate = new JLabel("Contract Start date");
		lblContractStartDate.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContractStartDate.setBounds(10, 11, 117, 24);
		panel_1.add(lblContractStartDate);

		textContractDateStart = new JTextField();
		textContractDateStart.setBounds(153, 14, 117, 20);
		panel_1.add(textContractDateStart);
		textContractDateStart.setColumns(10);

		JLabel lblContracg = new JLabel("Contract Length");
		lblContracg.setFont(new Font("Arial", Font.PLAIN, 13));
		lblContracg.setBounds(10, 51, 117, 24);
		panel_1.add(lblContracg);

		textContractLength = new JTextField();
		textContractLength.setBounds(153, 53, 117, 20);
		panel_1.add(textContractLength);
		textContractLength.setColumns(10);

		JLabel lblContractDescription = new JLabel("Contract Description");
		lblContractDescription.setFont(new Font("Arial", Font.PLAIN, 13));
		lblContractDescription.setBounds(10, 90, 135, 24);
		panel_1.add(lblContractDescription);

		description = new JTextArea();
		description.setBounds(10, 125, 281, 71);
		panel_1.add(description);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Account");
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Team");
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(Color.BLACK);
		menuBar.add(mnHelp);
		frame.setVisible(true);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == cancel) {
			frame.dispose();
			HomeScreen h = new HomeScreen(null, null);

		}

	}
}
