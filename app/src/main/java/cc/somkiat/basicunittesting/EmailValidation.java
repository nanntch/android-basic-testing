package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation {
    public String validate(String email) {
        String validateText = "Email validation is success";

        if (isEmptyAndNull(email) == false){
            validateText = "Email is Empty or Null";
        } else if (isPatternAllow(email) == false){
            validateText = "Email is not allow";
        }
            return validateText;
    }

    public boolean isEmptyAndNull(String email) {
        if(email == null || email.isEmpty()){
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
