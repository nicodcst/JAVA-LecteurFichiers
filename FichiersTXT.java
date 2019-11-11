/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichiers;

/**
 *
 * @author licence
 */
public class FichiersTXT extends Fichiers {
    private final String name;
    public FichiersTXT(String name){
        super();
        this.name = name;
    }
    
    public void afficher(){
        boolean test = super.Open(name);
        if(test == true){
            super.LectureFile();
            for (int i=0;i<text.size();i++){
                System.out.println(text.get(i));
            }
        } else {
            System.out.println("Le fichier est vide");
        }
    }
}
