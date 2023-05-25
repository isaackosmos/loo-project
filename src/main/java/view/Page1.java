package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.RegisterManager;
import model.Employee;

//public class Page1 extends JPanel implements VisualComponent{

//	JTextField jtfName;
//	JButton btName;
//    RegisterManager registerM;
//	
//	public Page1() {
//		setLayouts();
//		setComponents();
//		setEvents();
//	}
//	
//	
//	public void setLayouts() {
//		setLayout(null);
//		setBackground(Color.GREEN);
//		setSize(800, 600);
//		setVisible(true);
//		
//	}
//
//	public void setComponents() {
//		jtfName = new JTextField(150);
//		jtfName.setBounds(350, 100, 200, 50);
//		btName = new JButton("-- OK --");
//	    btName.setBounds(400, 10, 100, 50);
//	    // adicionando os componentes no Jpanel (Page1)
//	    add(btName);
//	    add(jtfName);
//	    
//	    registerM = new RegisterManager();
//	    
//	}
//
//	public void setEvents() {
//		btName.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				Employee employee = registerM.getNewEmployee();
//				employee.setName(jtfName.getText());
//				registerM.saveEmployee(employee);
//			}
//		});
//		
//	}

}
