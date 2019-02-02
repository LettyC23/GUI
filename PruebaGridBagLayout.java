import javax.swing.*;
import java.awt.*;




public class PruebaGridBagLayout  extends JFrame{

	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public PruebaGridBagLayout() {
		crearComponentes();
		
	}
	public void crearComponentes() {
		getContentPane().setLayout(gbl/* no objeto anonimo -->new GridBagLayout()*/);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo GridBagLayout");
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		JLabel jl = new JLabel("The Classic Form includes all visible fields for this list.");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(jl, 0,0, 1, 2);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		JCheckBox c2 = new JCheckBox("interest group fiels");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c2, 0,2, 1, 1);
		
		JTextField ct1 = new JTextField("Suscribe to out mailing list");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(ct1, 0,3, 1, 1);
		
		JRadioButton button1 = new JRadioButton("only required fields");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(button1, 0,4, 1, 1);
		
		JRadioButton button2 = new JRadioButton("all fields");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(button2, 0,5, 1, 1);
		
		JLabel t4 = new JLabel("(edit required fields in the form builder)");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(t4, 0,6, 1, 1);
		
		JCheckBox c3 = new JCheckBox("interest group fiels");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c3, 0,8, 1, 1);
		
		JCheckBox c4 = new JCheckBox("required fiel indicators");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c4, 0,9, 1, 1);
		
		JLabel t5 = new JLabel("Set form width");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(t5, 0,10, 1, 1);
		
		JTextField ct2 = new JTextField();
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(ct2, 0,11, 1, 1);
		
		JLabel t6 = new JLabel("Enhance your form");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(t6, 0,12, 1, 1);
		
		JCheckBox c1 = new JCheckBox("enable evil popup mode");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c1, 0,13, 1, 1);
		
		JCheckBox c5 = new JCheckBox("disable all JavaScript");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c5, 0,14, 1, 1);
		
		JCheckBox c6 = new JCheckBox("include archive link");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c6, 0,15, 1, 1);
		
		JCheckBox c7 = new JCheckBox("include MonkeyRewards link");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(c7, 0,16, 1, 1);
		
		JLabel t7 = new JLabel("Preview");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(t7, 1,0, 1, 1);
		
		JTextArea a2 = new JTextArea ("                                     ");
		gbc.fill = GridBagConstraints.VERTICAL;
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(a2, 1,1, 3, 6);
		
		JLabel t8 = new JLabel("Copy/paste onto your site");
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(t8, 1,6, 1, 6);
		
		JTextArea a1 = new JTextArea("                                ");
		gbc.fill = GridBagConstraints.VERTICAL;
		metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(a1, 1,10, 3, 6);
		}
	
	public void metodoMagicoQueAgregueComponentesYMeHaglaVidaMasFacil(JComponent area2,int gx, int gy, int gw, int gh) {
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridwidth =gw;
		gbc.gridheight = gh;
		
		gbl.setConstraints(area2, gbc);  // esta instanciado para poder usarse aqui 
		ButtonGroup bg = new ButtonGroup();
		
		add(area2);
		
		
		
		pack();	
	}


	
	
	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {  
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new PruebaGridBagLayout();
				
			}
		});
	}

}
