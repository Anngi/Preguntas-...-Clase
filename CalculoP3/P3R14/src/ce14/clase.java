package ce14;

public class clase {

    double salario, totve, vd1, vd2, vd3;
    double porven, salario1, salario2, salario3;

    double salario1(double vd1, double salario) {

        totve = vd1 + vd2 + vd3;
        porven = 0.33 * totve;
        if (vd1 > porven) {
            salario1 = salario + 0.2 * salario;
        } else {
            salario1 = salario;
        }
        return salario1;
    }

    double salario2(double vd2, double salario) {
        if (vd2 > porven) {
            salario2 = salario + 0.2 * salario;
        } else {
            salario2 = salario;
        }

        return salario2;
    }

    double salario3(double vd3, double salario) {

        if (vd3 > porven) {
            salario3 = salario + 0.2 * salario;
        } else {
            salario3 = salario;
        }

        return salario2;
    }
}
