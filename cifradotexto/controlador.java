
package cifradotexto;

import java.awt.event.*;
import javax.swing.*;
public class controlador implements ActionListener{
	private modelo model;
	private vista view;
	public controlador(modelo m,vista v){
	model = m;
	view = v;
	view.setControlador(this); 
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch (event.getActionCommand()) {
		case interfazvista.Abrir:
			model.setFileName(view.getFileName());
			view.setText(model.leerA());
			break;
		case interfazvista.Encriptar:
			model.setContenido(view.getText());
			view.setText(model.Encriptar());
			break;
		case interfazvista.Desencriptar:
			model.setContenido(view.getText());
			view.setText(model.Desencriptar());
			break;
		case interfazvista.Guardar:
			model.setFileName(view.getFileName());
			model.setContenido(view.getText());
			model.escribir();
			break;
		default:
			JOptionPane.showMessageDialog(null,"Error");
			break;
		}
	}

	public void arrancar(){ 
		view.setLocationRelativeTo(null);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(650,300);
		view.setVisible(true);
	}
}

    