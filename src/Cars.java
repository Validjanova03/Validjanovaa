public class Cars {
    public static void main(String[] args) {
        MainCars.getModel("Mercedes");
        MainCars.getColor("Black");
        MainCars.setPrice("250000$");
        MainCars.useType("Avtomat");
        System.out.println("---------------");

        MainCars.getModel("BMW");
        MainCars.getColor("White");
        MainCars.setPrice("50000$");
        MainCars.useType("Mexanik");
        System.out.println("---------------");

        MainCars.getModel("Ferrari");
        MainCars.getColor("Red");
        MainCars.setPrice("25000$");
        MainCars.useType("Avtomat");

    }
}
