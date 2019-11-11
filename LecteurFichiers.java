/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichiers;

import java.io.File;
import java.io.IOException;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/**
 *
 * @author licence
 */
public class LecteurFichiers {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Path path = Paths.get("E:\\Users\\Nicolas\\Documents\\Licence Pro\\JAVA\\NetBeansProjects\\LecteurFichiers\\src\\lecteurfichiers\\test.txt");
        String name = new File("E:\\Users\\Nicolas\\Documents\\Licence Pro\\JAVA\\NetBeansProjects\\LecteurFichiers\\src\\lecteurfichiers\\test.txt").getName();
        List<String> line = Files.readAllLines(path);
        
        System.out.println("Nom du fichier : " + name);
        System.out.println("Fichier lisible : " + Files.isReadable(path));
        System.out.println("Fichier modifiable : " + Files.isWritable(path));
        System.out.println("Fichier exécutable : " + Files.isExecutable(path));
    }
    
    FichiersTXT lecture1 = new FichiersTXT("E:\\Users\\Nicolas\\Documents\\Licence Pro\\JAVA\\NetBeansProjects\\LecteurFichiers\\src\\lecteurfichiers\\test.txt") {};
    lecture1.afficher();
}
