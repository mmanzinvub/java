package ZAD1;

public class Kompas implements FromDegreeToRadian {
    double otklonIgle;

    //setter
    public void setOtklonIgle(double otklonIgle) {
        this.otklonIgle = otklonIgle;
    }

    //getter
    public double getOtklonIgle() {
        return otklonIgle;
    }

    //metoda
    public void pokaziSmjer() {
        /* otklonIgle == null error
        if(otklonIgle == null) {
            System.out.println("Otklon igle nije postavljen!");
            return;
        }
        */

        Smjerovi smjer;
        if(otklonIgle > 0 && otklonIgle < 180) {
            smjer = Smjerovi.ISTOK;
        } else if (otklonIgle == 180) {
            smjer = Smjerovi.JUG;
        } else if (otklonIgle > 180 && otklonIgle < 360) {
            smjer = Smjerovi.ZAPAD;
        } else if (otklonIgle == 0 || otklonIgle == 360) {
            smjer = Smjerovi.SJEVER;
        } else {
            System.out.println("Neispravan otklon igle.");
            return;
        }

        System.out.println("Smjer: " + smjer.name() + "(" + smjer.getKratica() + ")");
        System.out.println("Otklon igle (DEG): " + getOtklonIgle() + "°");
        System.out.println("Otklon igle (RAD): " + fromDegreeToRadian(getOtklonIgle()));
    }

    public double fromDegreeToRadian(Double degree) {
        return (getOtklonIgle() * 3.14) / 180;
    }
}
