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
abstract class Fichiers implements Interface {
    protected ArrayList<String> text;
    File file;
    private String name;
    private String contenu;
    private String path;
    
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
    
    public String ContenuFile(){
        String contenu ="";
        try {
            InputStream ips = new FileInputStream(this.path);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            while((line=br.readLine())!=null){
                this.contenu += line + " ";
            }
            br.close();
        }
        catch (Exception e)
            return contenu;
    }
}
