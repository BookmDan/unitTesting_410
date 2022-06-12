public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if(getString().equals(getString().toUpperCase()))
        {
            return true;
        } else if (getString().equals(getString().toLowerCase())) {
            return true;
        } else (getString().equals(getString().substring(0,1).toUpperCase() + getString().substring(1))) {
            return true;
        }
        return false;
    }

}

