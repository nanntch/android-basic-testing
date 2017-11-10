package cc.somkiat.basicunittesting;

class NameValidation {

    public String validate(String name){
        return name;
    }

    public boolean isEmpty(String name) {

        if(name.isEmpty()){
            return false;
        }
        return true;
    }
}
