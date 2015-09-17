package ejercicio.pkg19;

import java.util.ArrayList;

public class clase {
    int n = 0;
    double prom, suma = 0;

    double calcular(double Num) {
        while (Num > 0) {
            suma = suma + Num;
            n = n + 1;

        }
        return suma;
    }

    double promedio(double prom) {
        prom = suma / n;

        return prom;
    }
}
