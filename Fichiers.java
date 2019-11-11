/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecteurfichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author licence
 */
abstract class Fichiers {
    protected ArrayList<String> text;
    File file;
    private String name;
    
    public Fichiers(){
        this.text = new ArrayList<>();
        this.file = null;
    }
    
    public boolean Open(String name){
        file = new File(name);
        if(file.isFile()){
            if(file.canRead()){
                return true;
            }
        }
        return false;
    }
    
    public void LectureFile(){
        try {
            InputStream ips = new FileInputStream(file);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;
            while ((line = br.readLine())!= null){
                text.add(line);
            }
        }
        catch (IOException e) {
        }
    }
    
    public abstract void afficher();
}
