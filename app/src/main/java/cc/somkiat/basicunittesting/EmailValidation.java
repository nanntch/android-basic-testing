package cc.somkiat.basicunittesting;

import java.lang.reflect.Array;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Nacha on 15-Nov-17.
 */

class EmailValidation {
    public String validate(String email) {
        String validateText = "Email validation is success";

        if (isNull(email) == false){
            validateText = "Email is null";
        } else if(isEmpty(email) == false){
            validateText = "Email is empty";
        } else if (isPatternAllow(email) == false){
            validateText = "Email is not allow";
        }
            return validateText;
    }

    public boolean isEmpty(String email) {
        if(email.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isNull(String email) {
        if (email == null){
            return false;
        }
        return true;
    }

    public boolean isPatternAllow(String email) {
        String ePattern = "[a-zA-Z0-9_.]*@[a-zA-Z]*.[a-zA-Z]*";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(email);
        boolean pair = m.matches();
        if(pair == true){
            return true;
        }
        return false;
    }
}
