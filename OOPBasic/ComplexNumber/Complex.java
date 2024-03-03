package OOPBasic.ComplexNumber;

public class Complex {
    private double realPart;
    private double imgPart;

    public Complex(double realPart, double imgPart) {
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    public Complex add(Complex other) {
        return new Complex(this.realPart + other.realPart, this.imgPart + other.imgPart);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.realPart-other.realPart, this.imgPart - other.imgPart);
    }

    @Override
    public String toString() {
        String str = "";
        if(imgPart == 0) {
            return realPart + "";
        }
        else if(realPart == 0) {
            return imgPart + "i";
        }
        else if(imgPart < 0) {
            return realPart + " - " + (-imgPart) + "i";
        }
        else {
            return realPart + " + " + imgPart + "i";
        }
    }

    public static void main(String[] args) {
        System.out.println("Complex Number Operations");

        Complex z1 = new Complex(5.0, 6.0);
        Complex z2 = new Complex(-3, 4);
        System.out.println(" a          " + z1);
        System.out.println(" b          " + z2);
        System.out.println(" a+b =       " + z1.add(z2));
      
        System.out.println(" a-b =        " + z1.subtract(z2));
    }
}
