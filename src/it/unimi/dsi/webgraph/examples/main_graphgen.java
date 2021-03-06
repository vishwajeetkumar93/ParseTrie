/*
 * This is nothing but the main class for labelled_graphgen.java. For this to run the database has to be in a sorted
 * order in a file named Database_sorted.txt .To get your data sorted you can use the file (unfortunately in C++) a.cpp .
 * The details on how exactly to use this file can be found it the txt file ReadMe.txt. This creates a number of text files by
 * calling the make_triplets method of labelled_graphgen repeatedly. The method make_triplets returns an array of 3 integers
 * which are interpreted as
 * 
 * 1. First character of the last word coded.
 * 2. Second character of the last word coded.
 * 3. A zero or one to check if the complete database has been coded or we need to make another file.
 * 
 * The main approach that has been followed in making different files is that no 2 words having the 
 * same first 2 characters should be in different files. The text files generated by this main method are then
 * used by WebGraph_maker to generate final graphfiles, offset files, label files, labeloffset files and 2 properties files.
 * 
 * 
 */

package it.unimi.dsi.webgraph.examples;

/**
 *
 * @author SCARS Lapi
 */
public class main_graphgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        final String basename = "Database_sorted";
        boolean stop = false;
        int firstchar=0,secondchar=0;
        while(!stop){
            int[] endchars = labelled_graphgen.make_triplets(basename,firstchar,secondchar);
            firstchar = endchars[0];
            secondchar = endchars[1];
            if (endchars[2]==1)
                stop = true;
            //System.out.println("The last charint is "+a);
        }
    }
}
