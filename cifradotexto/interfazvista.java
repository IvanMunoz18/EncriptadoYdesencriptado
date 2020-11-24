
package cifradotexto;

public interface interfazvista {
	void setControlador(controlador c); 

	public String getFileName () ;

	public String getText();

	public void setText(String s); 

	static final String Abrir = "Abrir";
	static final String Encriptar = "Encriptar";
	static final String Desencriptar = "Desencriptar";
	static final String Guardar = "Guardar";
}
