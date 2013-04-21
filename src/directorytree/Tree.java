/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package directorytree;
import java.io.*;
/**
 *
 * @author mike
 */
public class Tree
{
    File file;
    String output;
    
    public Tree (String filename)
    {
        this.file = new File(filename);
        if (file.exists())
            this.output = "";
        else
            this.output = "ERROR";
    }
    
    private void list (File file)
    {
        if (file.isDirectory())
 //           System.out.println (file.getPath());
        for (File f : file.listFiles())
            if (f.isDirectory())
                list(f);
            else
               // System.out.println (f.getPath());
                this.output += f.getPath() + "\n";
    }
    public String showTree ()
    {
        if (output.compareTo("ERROR") == 0) return output;
        this.list(this.file);
        return output;
    }
}
