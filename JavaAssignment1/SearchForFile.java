package JavaAssignment1;

import java.io.File;

public class SearchForFile {

    public static void getFile(String pattern, File f){
        if(f.isDirectory()){
            File file[]=f.listFiles();
            for(File file1:file){
                if(file1.isDirectory())
                    getFile(pattern,file1);
                else {
                    if (file1.getName().matches(pattern))
                        System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }
    public static void main(String[] args){
        File dir=new File("/home/nishitha");
        getFile("[a-z][A-Z]+.txt",dir);

    }


}
