/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradotexto;
import javax.swing.*;
import java.awt.*;


    
    public class vista extends JFrame implements interfazvista{

	private final JTextArea texto; 
	private final JButton encriptarJButton;
	private final JButton desencriptarJButton;
	private final JButton guardarJButton;
	private final JButton abrirJButton;
	private final JTextField fileName; 
	
	public vista(){
	JPanel fileJPanel ;
	JLabel lblFile ;
	JPanel buttonJPanel ;
	BorderLayout layout ;
	
	layout = new BorderLayout(30, 25) ;
	setLayout(layout );
	fileJPanel = new JPanel() ;
	fileJPanel.setLayout(new FlowLayout () ) ;
	lblFile = new JLabel("Nombre del archivo:");
	lblFile.setToolTipText("File name");
	fileJPanel.add(lblFile);
	fileName = new JTextField(40) ;
	fileJPanel.add(fileName);
	add(fileJPanel, BorderLayout.NORTH);
	texto = new JTextArea(10,15);
	add (new JScrollPane(texto), BorderLayout.CENTER);
	buttonJPanel = new JPanel();
	buttonJPanel.setLayout(new GridLayout(4, 1));
	abrirJButton = new JButton( Abrir ) ;
	buttonJPanel.add(abrirJButton);
	encriptarJButton = new JButton(Encriptar);
	buttonJPanel.add(encriptarJButton) ;
	desencriptarJButton = new JButton(Desencriptar);
	buttonJPanel.add( desencriptarJButton );
	guardarJButton = new JButton (Guardar);
	buttonJPanel.add(guardarJButton);
	add(buttonJPanel,BorderLayout.EAST);
	}
	
	public String getFileName(){return fileName.getText();}
	public String getText(){return texto.getText();}
	public void setText(String s){texto.setText(s);}
	public void setControlador(controlador C){
	abrirJButton.addActionListener(C);
	guardarJButton.addActionListener(C);
	encriptarJButton.addActionListener(C);
	desencriptarJButton.addActionListener(C);
	}


}
