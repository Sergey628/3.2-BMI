public class main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 80; // масса тела в кг.
        double growth = 1.88;  // Рост в метрах
        double index = service.calculate(mass, growth);
        System.out.println("Ваш индекс массы тела:");
        System.out.println(index);
        if (index > 25) {
            System.out.println("Надо меньше есть");
        } else {
            System.out.println("Полный порядок");


        }

    }
}
