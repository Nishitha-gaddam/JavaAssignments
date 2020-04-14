package JavaAssignment11;

import java.io.*;
import java.util.HashMap;

public class CharOccurrencesInString {
    HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
    public void countChar(String input){
            char[] str = input.toCharArray();
            for (char c : str) {
                if (!countMap.containsKey(c)) {
                    countMap.put(c, 1);
                } else {
                    countMap.put(c, countMap.get(c) + 1);
                }
            }
        }

        public static void main(String[] args) throws IOException {
            File  inputFile=new File("input.txt");
            BufferedReader br=new BufferedReader(new FileReader(inputFile));
            CharOccurrencesInString occurences=new CharOccurrencesInString();
            File outputFile=new File("output.txt");
            BufferedWriter bw=new BufferedWriter(new FileWriter(outputFile));
            String input;
            //reading the input content from the file
            while((input=br.readLine())!=null){
                occurences.countChar(input);
                System.out.println(input);
            }
            //writing the output into the file
            for(Character c:occurences.countMap.keySet()){
                bw.write(c+" "+occurences.countMap.get(c));
                bw.newLine();
                System.out.println(c+" "+occurences.countMap.get(c));
            }
            bw.close();
        }
}
