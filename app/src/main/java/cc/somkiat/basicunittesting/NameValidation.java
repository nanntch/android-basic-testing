package cc.somkiat.basicunittesting;

import java.util.List;

class NameValidation {

    public String validate(String name) {
        String validateText = "Name validation is success";

        if (isNull(name) == false) {
            validateText = "Name is Null";
        } else if (isEmpty(name) == false) {
            validateText = "Name is empty";
        }
//        } else if (isSpecialChars(name) == false){
//            validateText = "Name have Special chars";
//        } else if (isNumber(name) == false){
//            validateText = "Name have numeric";
        else if (isTooShort(name) == false){
            validateText = "Name is too short";
        } else if (isTooLong(name) == false){
            validateText = "Name is too long";
        } else if (isNormal(name) == false){
            validateText = "Name is not normal";
        }
        return validateText;
}

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

//    public boolean isSpecialChars(String name) {
//        if (!name.matches("^[A-Z a-z1234567890]+$")){
//            return false;
//        }
//        return true;
//    }

//    public boolean isNumber(String name) {
//        if(name.matches("^[1234567890]+$")){
//            System.out.println(">>>>>>>>>>>>>>>>>>>");
//            return false;
//        }
//        System.out.println("<<<<<<<<<<<<<<<<<<");
//        return true;
//    }

    public boolean isTooShort(String name) {
        if(name.length() < 2){
            return false;
        }
        return true;
    }

    public boolean isTooLong(String name) {
        if (name.length() > 20){
            return false;
        }
        return true;
    }

    public boolean isNormal(String name) {
        if (name.matches("^[A-Z a-z]+$")){
            return true;
        }
        return false;
    }
}