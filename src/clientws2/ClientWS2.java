/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientws2;

import java.io.StringReader;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author sergio
 */
public class ClientWS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("----------BEGINIG------");
        System.out.println("Opciones:\n"+
                "1. Obtener número Atómico\n"+
                "2. Obtener peso Atómico\n"+
                "3. Obtener Átomos\n"+
                "4. Obtener símbolo del elemento\n");
        System.out.println("Introduce el nombre del elemento: ");
        String input = "";
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        
        System.out.println("Introduce la opción deseada: ");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println(getAtomicNumber(input));
                break;
            case 2:
                System.out.println(getAtomicWeight(input));
                break;
            case 3:
                System.out.println(getAtoms());
                break;
            case 4:
                System.out.println(getElementSymbol(input));
                break;
            default:
                System.out.println("No coincide con ningún elemento");
        }
        
        Serializer serializer = new Persister();
        StringReader reader = new StringReader(getAtomicNumber(input));
        Atom data = serializer.read(Atom.class, reader);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
}
