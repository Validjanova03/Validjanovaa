public class Uchburchak {

   double a;
   double b;
   double c;

    public Uchburchak(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double hisoblashPerimeter() {
        return a + b + c;
    }

    public double hisoblashArea() {

        double s = hisoblashPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public String toString() {
        return "Uchburchak a=" + a + ", b=" + b + ", c=" + c ;
    }

    public static void main(String[] args) {
        Uchburchak uchburchak = new Uchburchak(3, 4, 5);

        System.out.println("A tomoni: " + uchburchak.getA());
        System.out.println("B tomoni: " + uchburchak.getB());
        System.out.println("C tomoni: " + uchburchak.getC());
        System.out.println("Perimetri: " + uchburchak.hisoblashPerimeter());
        System.out.println("Yuzasi: " + uchburchak.hisoblashArea());
        System.out.println(uchburchak);
    }
}

