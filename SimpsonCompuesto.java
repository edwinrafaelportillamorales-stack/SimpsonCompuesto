package dif_e_Integracion;

public class SimpsonCompuesto {

    private static double calcularSimpson(double a, double b, int n) {
        double h = TrapecioCompuesto.calcularH(a, b, n);
        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++) {
            double xk = a + k * h;

            // Los puntos con índice impar tienen coeficiente 4
            if (k % 2 != 0) {
                sumaImpares += TrapecioCompuesto.funcion(xk);
            }

            // Los puntos con índice par tienen coeficiente 2
            else {
                sumaPares += TrapecioCompuesto.funcion(xk);
            }
        }

        double sumaTotal = TrapecioCompuesto.funcion(a) + 4 * sumaImpares
                + 2 * sumaPares + TrapecioCompuesto.funcion(b);
        return (h / 3) * sumaTotal;
    }

    public static double integrarConTolerancia(double a, double b, double tolerancia) {
        int n = 2;
        double integralAnterior = calcularSimpson(a, b, n);
        double errorAbsoluto = 999.0;

        System.out.println("--- ITERACIONES (SIMPSON 1/3 COMPUESTO) ---");
        System.out.println("n = " + n + " | Integral = " + integralAnterior);

        while (errorAbsoluto > tolerancia) {
            n *= 2;
            double integralNueva = calcularSimpson(a, b, n);
            errorAbsoluto = Math.abs(integralNueva - integralAnterior);

            System.out.println("n = " + n
                    + " | Integral = " + integralNueva
                    + " | Error = " + errorAbsoluto);
            integralAnterior = integralNueva;
        }
        return integralAnterior;
    }
}