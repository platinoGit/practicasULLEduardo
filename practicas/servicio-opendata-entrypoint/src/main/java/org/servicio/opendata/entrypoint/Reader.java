package org.servicio.opendata.entrypoint;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;

public class Reader  {
	public static void downloadFile(URL url, String outputFileName) throws IOException {
		try (InputStream in = url.openStream();
			ReadableByteChannel rbc = Channels.newChannel(in);
			FileOutputStream fos = new FileOutputStream(outputFileName)) {
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
	}
	
	public static void readFile(String csvFile) {
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
		try {
		    br = new BufferedReader(new FileReader(csvFile));
		    List<String[]> lineas = new ArrayList<String[]>();		
		    while ((line = br.readLine()) != null) {                
		        String[] fila = line.split(cvsSplitBy);
		        lineas.add(fila);
		        //Imprime datos.
		       //System.out.println(fila[0] + "; " + fila[1] + "; " + fila[2] + "; " + fila[3] + "; " + fila[4] + "; " + fila[5] + "; " + fila[6]);
		    }
		    String[][] miArray = new String[lineas.size()][19];
		    miArray = lineas.toArray(miArray);
		    System.out.println(miArray[1433][0]);
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    if (br != null) {
		        try {
		            br.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
	}
	
	public static void main(String[] args) throws Exception {
		String salida = "C:\\Users\\eduardo\\workspace\\practicasULLEduardo\\dataset.csv";
		URL ficheroURL = new URL("https://datos.canarias.es/catalogos/general/dataset/946cdcde-2118-48ef-a30a-f9dc812c82db/resource/10b71b12-fb77-47b7-88f6-ec46ebee1548/download/uweb-sicac-pdf-actuaciones-no-becas-premios-subvenciones-v1-0-10.csv");
		
		downloadFile(ficheroURL, salida);
		readFile(salida);
	}
}
	