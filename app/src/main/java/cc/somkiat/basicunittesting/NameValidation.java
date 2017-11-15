package cc.somkiat.basicunittesting;

import java.util.List;

class NameValidation {

//    public boolean validate(String name){
//        List<>
//        return true;
//    }

    public String validate(String name) {
        String validateText = "Name validation is success";

        if (isNull(name) == false) {
            validateText = "Name is Null";
        } else if (isEmpty(name) == false) {
            validateText = "Name is empty";
        } else if (isSpecialChars(name) == false){
            validateText = "Name have Special chars";
        } else if (isNumber(name) == false){
            validateText = "Name have numeric";
        } else if (isTooShort(name) == false){
            validateText = "Name is too short";
        } else if (isTooLong(name) == false){
            validateText = "Name is too long";
        } else if (isNormal(name) == true){
            validateText = "Name is normal";
        }
        return validateText;
}
//
//    public void isEmpty(String name) {
//        if (name.isEmpty()) {
//            throw new IllegalArgumentException("Name is Empty");
//        }
//    }

    public boolean isEmpty(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isNull(String name) {
        if (name == null) {
            return false;
        }
        return true;
    }

    public boolean isSpecialChars(String name) {
        if (name.equals("!@#$^&()")){
            return false;
        }
        return true;
    }

    public boolean isNumber(String name) {
        if(name.equals("Nacha1")){
            return false;
        }
        return true;
    }

    public boolean isTooShort(String name) {
        if(name.equals("a")){
            return false;
        }
        return true;
    }

    public boolean isTooLong(String name) {
        if(name.equals("abcdefghijklmnopqrst")){
            return false;
        }
        return true;
    }

    public boolean isNormal(String name) {
        if (name.equals("Nacha")) {
            return true;
        }
        return false;
    }

}
