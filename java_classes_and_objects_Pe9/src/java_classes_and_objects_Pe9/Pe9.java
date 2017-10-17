package java_classes_and_objects_Pe9;

import java.io.File;
import java.io.FilenameFilter;
 
public class Pe9 {
 
    public static void main(String a[]){
        File file = new File("/home/manda/Desktop/java practise exercise");
        String[] files = file.list(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".java")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}