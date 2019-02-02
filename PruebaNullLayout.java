import java.awt.*;
import javax.swing.*;

class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal(){
		//setLayout(new FlowLayout()); 
		//getContentPane().setLayout(new FlowLayout());
				getContentPane().setLayout(null);
				setSize(600, 470); //tamaño de la ventana
				setTitle("");
				setLocationRelativeTo(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
		
		JLabel t = new JLabel();
		t.setText("The Classic Form includes all visible fields for ");
		t.setFont( new Font("Arial0", Font.PLAIN, 13));
		t.setBounds(5, 5, 270, 20);
		add(t);
		
		JLabel t1 = new JLabel();
		t1.setText("this list.");
		t1.setFont( new Font("Arial0", Font.PLAIN, 13));
		t1.setBounds(5, 20, 50, 20);
		add(t1);
		
		JLabel t2 = new JLabel();
		t2.setText("Form options");
		t2.setFont( new Font("Arial0", Font.BOLD, 14));
		t2.setBounds(5, 50, 95, 20);
		add(t2);
		
		JLabel t3 = new JLabel();
		t3.setText("Include the following");
		t3.setFont( new Font("Arial0", Font.PLAIN, 13));
		t3.setBounds(5, 68, 120, 20);
		add(t3);
		
		JCheckBox c1 = new JCheckBox();
		c1.setText("a tittle for your form");
		c1.setFont( new Font("Arial0", Font.PLAIN, 13));
		c1.setBounds(5, 85, 150, 20);
		add(c1);
		
		JTextField ct1 = new JTextField();
		ct1.setText("Suscribe to out mailing list");
		ct1.setBounds(5,108,170,20);
		add(ct1);
		
		
		JRadioButton button1 = new JRadioButton();
		button1.setText("only required fields");
		button1.setFont( new Font("Arial0", Font.PLAIN, 13));
		button1.setBounds(5, 150, 150, 20);
		add(button1);
		
		JRadioButton button2 = new JRadioButton();
		button2.setText("all fields");
		button2.setFont( new Font("Arial0", Font.PLAIN, 13));
		button2.setBounds(5, 167, 150, 20);
		add(button2);
		
		JLabel t4 = new JLabel();
		t4.setText("(edit required fields in the form builder)");
		t4.setFont( new Font("Arial0", Font.PLAIN, 9));
		t4.setBounds(20, 180, 200, 20);
		add(t4);
		
		JCheckBox c2 = new JCheckBox();
		c2.setText("interest group fiels");
		c2.setFont( new Font("Arial0", Font.PLAIN, 13));
		c2.setBounds(5, 220, 150, 20);
		add(c2);
		
		JCheckBox c3 = new JCheckBox();
		c3.setText("required fiel indicators");
		c3.setFont( new Font("Arial0", Font.PLAIN, 13));
		c3.setBounds(5, 240, 160, 20);
		add(c3);
		
		JLabel t5 = new JLabel();
		t5.setText("Set form width");
		t5.setFont( new Font("Arial0", Font.PLAIN, 13));
		t5.setBounds(5, 270, 120, 20);
		add(t5);
		
		JTextField ct2 = new JTextField();
		ct2.setBounds(5,290,150,20);
		add(ct2);
		
		JLabel t6 = new JLabel();
		t6.setText("Enhance your form");
		t6.setFont( new Font("Arial0", Font.PLAIN, 13));
		t6.setBounds(5, 320, 120, 20);
		add(t6);
		
		JCheckBox c4 = new JCheckBox();
		c4.setText("enable evil popup mode");
		c4.setFont( new Font("Arial0", Font.PLAIN, 13));
		c4.setBounds(5, 340, 160, 20);
		add(c4);
		
		JCheckBox c5 = new JCheckBox();
		c5.setText("disable all JavaScript");
		c5.setFont( new Font("Arial0", Font.PLAIN, 13));
		c5.setBounds(5, 360, 160, 20);
		add(c5);
		
		JCheckBox c6 = new JCheckBox();
		c6.setText("include archive link");
		c6.setFont( new Font("Arial0", Font.PLAIN, 13));
		c6.setBounds(5, 380, 160, 20);
		add(c6);
		
		JCheckBox c7 = new JCheckBox();
		c7.setText("include MonkeyRewards link");
		c7.setFont( new Font("Arial0", Font.PLAIN, 13));
		c7.setBounds(5, 400, 200, 20);
		add(c7);
		
		JLabel t7 = new JLabel();
		t7.setText("Preview");
		t7.setFont( new Font("Arial0", Font.PLAIN, 13));
		t7.setBounds(280, 5, 200, 20);
		add(t7);
		
		
		JTextArea a = new JTextArea(20,0);
		JScrollPane p = new JScrollPane(a);
		p.setBounds(280, 20, 290, 150);
		add(p);
		
		
		
		JLabel t8 = new JLabel();
		t8.setText("Copy/paste onto your site");
		t8.setFont( new Font("Arial0", Font.PLAIN, 13));
		t8.setBounds(280, 240, 290, 20);
		add(t8);
		JTextArea a1 = new JTextArea(20,0);
		JScrollPane p1 = new JScrollPane(a1);
		p1.setBounds(280, 260, 290, 150);
		add(p1);
	}
}


public class PruebaNullLayout {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {  
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaPrincipal();
				
			}
		});

	}

}
