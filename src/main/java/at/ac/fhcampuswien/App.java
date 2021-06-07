package at.ac.fhcampuswien;

public class App {
    public boolean checkPassword(String string){
        return string != null
                && checkLength(string)
                && checkUpperAndLowerCase(string)
                && checkNumbers(string)
                && checkSpecialChar(string)
                && checkContinuousNumbers(string)
                && checkNumbersInARow(string);
    }

    public boolean checkLength(String string) {
        return string.length() >= 8 && string.length() <= 25;
    }

    public boolean checkUpperAndLowerCase(String string){

        boolean upperCase = false;
        boolean lowerCase = false;

        for(int i=0;i < string.length();i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch))
                upperCase = true;
            if (Character.isLowerCase(ch))
                lowerCase = true;
            if(upperCase && lowerCase )
                return true;
        }
        return false;
    }

    public boolean checkNumbers(String string) {
        return string.matches(".*\\d.*");
    }

    public boolean checkSpecialChar(String string) {

        return string.matches(".*[()#$?!%/@].*");
    }

    public boolean checkContinuousNumbers(String pw){
        return !pw.contains("012") && !pw.contains("123") && !pw.contains("234") && !pw.contains("345") && !pw.contains("456") && !pw.contains("567") && !pw.contains("678") && !pw.contains("789");
    }
    public boolean checkNumbersInARow(String pw){
        return !pw.contains("0000") && !pw.contains("1111") && !pw.contains("2222") && !pw.contains("3333") && !pw.contains("4444") && !pw.contains("5555") && !pw.contains("6666") && !pw.contains("7777") && !pw.contains("8888") && !pw.contains("9999");
    }


}
