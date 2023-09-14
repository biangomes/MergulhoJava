public class CalculoCortisal {
    public static void main(String[] args) {

        double cortisol = 20.2;

        boolean resultadoNormal = (cortisol >= 6.0) && (cortisol <= 18.4);
        // boolean resultadoAnormal = !resultadoNormal;
        boolean resultadoAnormal = (cortisol < 6.0) || (cortisol > 18.4);

        System.out.println("Cortisol normal: " + resultadoNormal);
        System.out.println("Cortisol anormal: " + resultadoAnormal);
    }
}
