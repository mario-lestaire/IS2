/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plato;

/**
 *
 * @author jesus
 */
import java.io.*;

import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;



public class Plato {
	
	String getTipo (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[3];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getId (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[0];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getDescripcion (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[2];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getPais (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[4];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getGusto (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[5];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getCalificacion (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[6];
				encontrado = true;
			}
		}
		
		csvReader.close();
		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	String getN_valoraciones (String archivo, String nombre) throws CsvValidationException, IOException {
		boolean encontrado = false;
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
		String[] fila = null;
		while((fila = csvReader.readNext()) != null && !encontrado) {
			if (fila[1].equals(nombre)) {
				res = fila[7];
				encontrado = true;
			}
		}
		
		csvReader.close();
	  		if (res==null)
			res="Plato no encontrado";
		return res;
	}
	
        String getUltimoId(String archivo) throws CsvValidationException, IOException {
		int contador=0;
		Reader archCSV1 = new FileReader(archivo);
		CSVParser conPuntoYComa1 = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader1 = new CSVReaderBuilder(archCSV1).withCSVParser(conPuntoYComa1).build();
		while(csvReader1.readNext() != null) {
			contador++;
		}
		
		
		String res = null;
		Reader archCSV = new FileReader(archivo);
		CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
		CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).withSkipLines(contador-1).build();
		String[] fila = null;
		fila = csvReader.readNext();
		res=fila[0];
		csvReader.close();
		return res;
	}
	
	
	public static void nuevaLinea (String archivo, String id, String nombre, String descripcion, String tipo, String pais, String gusto, String calificacion, String n_valoraciones) throws CsvValidationException
	{
		
	    // first create file object for file placed at location
	    // specified by filepath
	    File file = new File(archivo);
	  
	    try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file,true);
	  
	        // create CSVWriter with '|' as separator
	        CSVWriter writer = new CSVWriter(outputfile, ';',
	                                         CSVWriter.NO_QUOTE_CHARACTER,
	                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                                         CSVWriter.DEFAULT_LINE_END);
	        
	        Plato p = new Plato();
	        int proximo_id= Integer.parseInt(p.getUltimoId(archivo))+1;
	        String[] data = { String.valueOf(proximo_id), nombre, descripcion, tipo, pais, gusto,calificacion, n_valoraciones };
	        writer.writeNext(data);
	  
	        // closing writer connection
	        writer.close();
	    }
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) throws CsvValidationException, IOException{
		
		String archivo = "src/Datos/Platos.csv";
		Plato p = new Plato();
		System.out.println(p.getId(archivo, "Tortilla de Patatas"));
		System.out.println(p.getTipo(archivo, "Tortilla de Patatas"));
		System.out.println(p.getDescripcion(archivo, "Sushi"));
		System.out.println(p.getGusto(archivo, "Tortilla de Patatas"));
		System.out.println(p.getCalificacion(archivo, "Tortilla de Patatas"));
		System.out.println(p.getPais(archivo, "Tortilla de Patatas"));
		System.out.println(p.getN_valoraciones(archivo, "Tortilla de Patatas"));
		System.out.println(p.getUltimoId(archivo));
		//p.nuevaLinea(archivo, "2", "calamares", "ricas", "hortaliza", "francia", "salao","3","2");
	}

}