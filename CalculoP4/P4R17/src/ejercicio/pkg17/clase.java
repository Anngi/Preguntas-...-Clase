package ejercicio.pkg17;

public class clase {

    int suma = 0, num = 1, n;

    int calcular(int n) {

        while (num <= n) {
            suma = suma + num;
            num = num + 1;
        }
        return suma;
    }

}
