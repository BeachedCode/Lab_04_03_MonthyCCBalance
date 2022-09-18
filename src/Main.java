public class Main {
    public static void main(String[] args)
    {
        double credBalance = 5000;
        double Interest = .17;
        double credMonth1 = (credBalance * Interest);
        double credMonth2 = (credMonth1 * Interest);

        System.out.println("Month 1 Interest: " + credMonth1);
        System.out.println("Month 2 Interest: " + credMonth2);

    }
}