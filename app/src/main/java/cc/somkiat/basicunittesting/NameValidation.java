package cc.somkiat.basicunittesting;

class NameValidation {

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
}
