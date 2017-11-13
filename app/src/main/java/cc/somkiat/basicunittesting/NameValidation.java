package cc.somkiat.basicunittesting;

class NameValidation {

    public String validate(String name) {
        String validateText = "Name validation is success";

        if (isNull(name) == false) {
            validateText = "Name is Null";
        } else if (isEmpty(name) == false) {
            validateText = "Name is empty";
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
}
