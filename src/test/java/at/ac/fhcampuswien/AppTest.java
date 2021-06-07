package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AppTest{

    @Test //password too short
    public void tooShort(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("Pw@sho1");
        assertFalse(passwordIsValid);
    }
    @Test //longer than 25 characters
    public void tooLong(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("Passw00rrrrrrrttttttttttttttttttttttttttttttttttttttttttttt@@");
        assertFalse(passwordIsValid);
    }
    @Test //no upper case letter
    public void onlyLowerCase(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("onlylowercase@1");
        assertFalse(passwordIsValid);
    }

    @Test //no lower case letter
    public void onlyUpperCase(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("onlyuppercase@1");
        assertFalse(passwordIsValid);
    }
    @Test // no numbers
    public void noNumbers(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("N@numbers");
        assertFalse(passwordIsValid);
    }
    @Test // no special character
    public void noSpecialCharacters(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("Nospecialcharacters3");
        assertFalse(passwordIsValid);
    }
    @Test // is consecutive
    public void consecutiveNumbers(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("P@sswort12345");
        assertFalse(passwordIsValid);
    }
    @Test // more than 3 same numbers
    public void repeatNumbers(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("P@$$word1111");
        assertFalse(passwordIsValid);
    }



    @Test // between 8 & 25 digits
    public void validLength(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("(RightLength1@");
        assertTrue(passwordIsValid);
    }

    @Test // upper and lower case letters must exist
    public void upperLowerCase(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("(Password1)");
        assertTrue(passwordIsValid);
    }

    @Test // numbers must exist
    public void existingNumbers(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("(Password1298)");
        assertTrue(passwordIsValid);
    }
    @Test // Special character must exist: ()#$?!%/@
    public void specialChars(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("@Password1");
        assertTrue(passwordIsValid);
    }
    @Test // not more than 2 numbers continuous (e.g. 1,2,3)
    public void continuousNumbers(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("Password(12)");
        assertTrue(passwordIsValid);
    }
    @Test // not more than 3 same numbers
    public void numbersInARow(){
        App app = new App();
        boolean passwordIsValid = app.checkPassword("Password@111222111333@");
        assertTrue(passwordIsValid);
    }


}