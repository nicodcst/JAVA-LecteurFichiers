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
public class FichiersInverse extends Fichiers{
    private final String name;
    
    public FichiersInverse(String name) {
        super();
        this.name = name;
    }
    
    public void afficher(){
        boolean test = super.Open(name);
        if(test == true){
            super.LectureFile();
            for(int i=text.size()-1; i>=0; i--){
                System.out.println(text.get(i));
            }
        } else {
            System.out.println("Fichier vide ou inexistant.");
        }
    }
}
