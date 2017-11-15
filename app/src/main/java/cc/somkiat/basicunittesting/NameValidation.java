package cc.somkiat.basicunittesting;

class NameValidation {

    public String validate(String name) {
        String validateText = "Name validation is success";

        if (isEmptyAndNull(name) == false) {
            validateText = "Name is Empty or Null";
        } else if (isWrongLength(name) == false) {
            validateText = "Name is wrong length";
        } else if (isNormal(name) == false) {
            validateText = "Name is not normal";
        }
        return validateText;
    }

    public boolean isEmptyAndNull(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isWrongLength(String name){
        if(name.length() < 2 || name.length() > 20){
            return false;
        }
        return true;
    }

    public boolean isNormal(String name) {
        //dont have numeric & special chars
        if (name.matches("^[A-Z a-z]+$")) {
            return true;
        }
        return false;
    }
}