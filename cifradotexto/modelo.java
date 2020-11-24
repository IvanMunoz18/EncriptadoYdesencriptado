
package cifradotexto;

import java.io.*;

public class modelo{

	private String CTexto;
	private String NombreArchivo;
	final char s = (char) 3;
	final char d = (char) 1;

	public void setContenido(String texto) {CTexto = texto;}

	public String getCon(){return CTexto;}

	public void setFileName(String name) {NombreArchivo = name;}
        
        public String leerA(){
		String cad;
		String content = "";
		File file = new File(NombreArchivo);
		try {
			if (file.exists()) {
				BufferedReader b = new BufferedReader(new FileReader(file));
				while ((cad = b.readLine()) != null)
					content = content + cad + "\n";
				b.close();
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error al abrir el archivo .");
		} catch (IOException ioException) {
			System.err.println(" Error al abrir el archivo  .");
		}
		CTexto = content;
		return content;
	}

	public void escribir(){
		try {
			File archivo = new File("archivo");
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));;
			bw.write(CTexto);
			bw.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println(" Error al abrir el archivo .");
		} catch (IOException ioException) {
			System.err.println(" Error al abrir el archivo .");
		}
	}

	public String Encriptar(){
		String ctext = "";
		for (String line : CTexto.split("\n")) {
			StringBuilder chain = new StringBuilder();
			for (char w : line.toCharArray()) {
				if (Character.isLetter(w))
					w += s;
				chain.append(w);
			}
			
			StringBuilder shift_chain = new StringBuilder();
			String shifttext = chain.reverse().toString();
			int h = shifttext.length()/2;
			for (char c : shifttext.substring(h, shifttext.length()).toCharArray()) {
				if (Character.isLetter(c))
					c -= d;
				shift_chain.append(c);
			}
			ctext = ctext + shifttext.substring(0, h) + shift_chain.toString() + "\n";
		}
		CTexto = ctext;
		return ctext;
	}

	public String Desencriptar(){
	String text = "";
	for ( String ctext : CTexto.split ("\n")){
	int h = ctext.length()/2;
	StringBuilder shift_cadena = new StringBuilder(ctext.substring(0 ,h));
	for ( char ce : ctext.substring(h, ctext.length()).toCharArray()){
			if ( Character.isLetter(ce))
			ce += d ;
			shift_cadena.append(ce);
			}
	
			String shifttext = shift_cadena.reverse().toString();
			StringBuilder chain = new StringBuilder();
			for ( char x : shifttext.toCharArray()){
			if ( Character.isLetter(x -3))
			x -= s;
			chain . append(x);
			}
			text = text + chain . toString () + "\n";
			}
	
			CTexto = text;
			return text;
			}

	

}

    