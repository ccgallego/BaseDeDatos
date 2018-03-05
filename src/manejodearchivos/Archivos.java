package manejodearchivos;

import VariableTexto.BuscarRegistro;
import VariableTexto.Principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Gallego
 */
public class Archivos {

    public void crearArchivo(Persona persona) throws IOException {
        File crear = new File("registrosTextos.txt");

        if (!crear.exists()) {
            crear.createNewFile();
        }

        //Si el archivo existe procedemos a escribir sobre el archivo
        try {
            //Instanciamos un objeto de la clase PrintWriter, le pasamos el archivo y el formato
            FileWriter archivo = new FileWriter(crear, true);
            PrintWriter escribir = new PrintWriter(archivo);
            if (archivo != null) {
                //Escribimos el contenido del archivo.
                escribir.println(persona.toString());
                JOptionPane.showMessageDialog(null, "Registro Agregado Correctamente");
                //Cerramos el archivo.
                escribir.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EliminarRegistro(String lineaRemover) {
        try {
            File doc = new File("registrosTextos.txt");
            //Verificamos si el archivo existe o no
            if (!doc.isFile()) {
                JOptionPane.showMessageDialog(null, "No se encontro el archivo");
                return;
            }
            //Construimos un archivo temporal para guardar los cambios y renombrar el archivo anterior 
            File tempFile = new File(doc.getAbsolutePath() + ".tmp");
            // Leemos el 
            BufferedReader br = new BufferedReader(new FileReader("registrosTextos.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            //Leemos el archivo original y lo escribimos en el nuevo
            while ((line = br.readLine()) != null) {
                if (line.indexOf(lineaRemover) != 0) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Eliminamos el archivo original
            if (!doc.delete()) {
                System.out.println("No se pudo eliminar el archivo");
                return;
            }
            //Renombramos el nuevo archivo con el nombre del archivo original
            if (!tempFile.renameTo(doc)) {
                System.out.println("No se pudo renombrar el archivo");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void crearArchivoBinario(Persona persona) throws IOException {
        File crear = new File("registrosBinarios.txt");

        if (!crear.exists()) {
            crear.createNewFile();
        }

        //Si el archivo existe procedemos a escribir sobre el archivo
        try {
            //Instanciamos un objeto de la clase PrintWriter, le pasamos el archivo y el formato
            FileWriter archivo = new FileWriter(crear, true);
            PrintWriter escribir = new PrintWriter(archivo);
            if (archivo != null) {
                //Escribimos el contenido del archivo.                    
                escribir.println(persona.getNombre() + "|" + persona.getCedula() + "|" + persona.getDiaBinario() + "|" + persona.getMesBinario() + "|" + persona.getAnoNacimiento() + "|" + persona.getTelefono());

                JOptionPane.showMessageDialog(null, "Registro Agregado Correctamente");
                //Cerramos el archivo.
                escribir.close();
            } else {
                System.out.println("no hace el if");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EliminarBinario(String dato) {
        try {
            File doc = new File("registrosBinarios.txt");
            //Verificamos si el archivo existe o no
            if (!doc.isFile()) {
                JOptionPane.showMessageDialog(null, "No se encontro el archivo");
                return;
            }
            //Construimos un archivo temporal para guardar los cambios y renombrar el archivo anterior 
            File tempFile = new File(doc.getAbsolutePath() + ".tmp");
            // Leemos el 
            BufferedReader br = new BufferedReader(new FileReader("registrosBinarios.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            //Leemos el archivo original y lo escribimos en el nuevo
            while ((line = br.readLine()) != null) {
                if (line.indexOf(dato) != 0) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            br.close();

            //Eliminamos el archivo original
            if (!doc.delete()) {
                System.out.println("No se pudo eliminar el archivo");
                return;
            }
            //Renombramos el nuevo archivo con el nombre del archivo original
            if (!tempFile.renameTo(doc)) {
                System.out.println("No se pudo renombrar el archivo");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
     
    public String calcularBinario(int nun) {
        String salida = "";
        if (nun > 0) {
            salida = calcularBinario(nun / 2) + (nun % 2);
        }
        return salida;
    }

   
}
