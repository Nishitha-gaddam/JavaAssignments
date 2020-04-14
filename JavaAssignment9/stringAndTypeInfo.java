package JavaAssignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class stringAndTypeInfo {

    public void startsWithCapitalChar(String input){
        Pattern pattern =Pattern.compile("^[A-Z].*[.]$");
        Matcher match =pattern.matcher(input);
        if (match.matches()) {
           System.out.println("pattern matched");
        } else {
            System.out.println("pattern did not match");
        }


    }

    public static void main(String[] args){
        stringAndTypeInfo st=new stringAndTypeInfo();
        st.startsWithCapitalChar("Hi my name is Nishitha.");
        st.startsWithCapitalChar("hi my name is nishitha.");
    }


}
