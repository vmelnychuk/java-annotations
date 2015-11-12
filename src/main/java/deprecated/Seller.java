package deprecated;

public class Seller {
    public void postAd(String text, int days) {
        System.out.println(text);
    }
    @Deprecated
    public void postInMagazine(String text, int issueNumber) {
        System.out.println(text);
    }
}
