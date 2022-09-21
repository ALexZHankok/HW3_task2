public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int imt = service.calculate(70, 180);
        System.out.println("Индекс массы тела " + imt);
    }
}
