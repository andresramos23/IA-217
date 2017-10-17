package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    // Ruta del archivo
    static String fileName = "/Users/CompuAndres/Desktop/words.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mismosChars("confesar");
        //partePalabra("auto");
        //mismasVocales("aeiou");
    }
    
    // #1: Contar cuantas palabras tienen los mismos chars en otras palabras: ejemplo casa esta contenida en carrosa
    public static void mismosChars(String palabra){
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter((String line) -> Arrays.asList(line.split("")).containsAll(Arrays.asList(palabra.split("")))).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // #2: Cuente cuantas palabras, son parte de otra palabra: ejemplo casa esta en carcasa
    public static void partePalabra(String palabra){
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter(line -> line.contains(palabra)).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // #3: Cuente cuantas plabras tienen igual sus silabas: ejemplo hola con ola = 2
    public static void mismasVocales(String palabra){
        final String palabra2 = extraerVocales(palabra);
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> result = stream.filter((String line) -> Arrays.asList((extraerVocales(line)).split("")).containsAll(Arrays.asList(palabra2.split("")))).collect(Collectors.toList());
            System.out.println(result.size());

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static String extraerVocales(String palabra){
        return palabra.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
    }
    
}
