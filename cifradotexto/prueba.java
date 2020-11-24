
package cifradotexto;


import javax.swing.JOptionPane;

public class prueba {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"TOPICOS AVANZADOS DE PROGRAMACION ITLEON");
        JOptionPane.showMessageDialog(null,"Este es un programa que ejemplifica la forma en que "
                + "trabaja el encriptado y desencriptado mediante las reglas ascii");
		modelo m = new modelo();
		vista v = new vista () ;
		controlador c = new controlador(m, v) ;
		c. arrancar () ; 		
}

}
    