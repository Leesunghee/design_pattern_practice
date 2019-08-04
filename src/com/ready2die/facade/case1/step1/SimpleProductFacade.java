package facade.case1.step1;

public class SimpleProductFacade {
    ComplexProduct difficultProduct;

    public SimpleProductFacade() {
        difficultProduct = new ComplexProduct();
    }

    public void setName(String n) {
        char[] chars = n.toCharArray();

        if (chars.length > 0) {
            difficultProduct.setFirstNameChar(chars[0]);
        }
        if (chars.length > 1) {
            difficultProduct.setSecondNameChar(chars[1]);
        }
        if (chars.length > 2) {
            difficultProduct.setThirdNameChar(chars[2]);
        }
        if (chars.length > 3) {
            difficultProduct.setFourthNameChar(chars[3]);
        }
        if (chars.length > 4) {
            difficultProduct.setFifthtNameChar(chars[4]);
        }
        if (chars.length > 5) {
            difficultProduct.setSixthNameChar(chars[5]);
        }
        if (chars.length > 6) {
            difficultProduct.setSeventhNameChar(chars[6]);
        }
        if (chars.length > 7) {
            difficultProduct.setEighthNameChar(chars[7]);
        }
        if (chars.length > 8) {
            difficultProduct.setNinthNameChar(chars[8]);
        }
        if (chars.length > 9) {
            difficultProduct.setTenthNameChar(chars[9]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }
}
