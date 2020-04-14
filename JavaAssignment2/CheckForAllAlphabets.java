package JavaAssignment2;

public class CheckForAllAlphabets {
    public boolean checkString(String input) {
        String s = input.toLowerCase();
        boolean b = true;
        for (char c = 'a'; c <= 'z'; ++c) {
            if (!s.contains(String.valueOf(c))) {
                b = false;
                break;
            }
        }

        if (b)
            System.out.println("String contains all alphabets");
        else
            System.out.println("String  does not contains all alphabets");


        return b;
    }

    public static void main(String[] args) {
        CheckForAllAlphabets check = new CheckForAllAlphabets();
        check.checkString("The quick brown fox jumps over the lazy dog");
    }
}

//Time Complexity- O(n)
//Space Complexity-O(1)