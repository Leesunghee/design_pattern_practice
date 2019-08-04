package facade.case1.step1;

public class ComplexProduct {

    private char nameChar[] = new char[10];

    public ComplexProduct() {
    }

    public void setFirstNameChar(char c) {
        this.nameChar[0] = c;
    }
    public void setSecondNameChar(char c) {
        this.nameChar[1] = c;
    }
    public void setThirdNameChar(char c) {
        this.nameChar[2] = c;
    }
    public void setFourthNameChar(char c) {
        this.nameChar[3] = c;
    }
    public void setFifthtNameChar(char c) {
        this.nameChar[4] = c;
    }
    public void setSixthNameChar(char c) {
        this.nameChar[5] = c;
    }
    public void setSeventhNameChar(char c) {
        this.nameChar[6] = c;
    }
    public void setEighthNameChar(char c) {
        this.nameChar[7] = c;
    }
    public void setNinthNameChar(char c) {
        this.nameChar[8] = c;
    }
    public void setTenthNameChar(char c) {
        this.nameChar[9] = c;
    }

    public String getName() {
        return new String(nameChar);
    }
}
