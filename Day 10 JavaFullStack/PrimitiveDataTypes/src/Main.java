
public class Main {
    public static void main(String[] args) {

        int max = 2147483647; // 4 byte
        int min = -2147483648;
        short shortMax = 32767; //2 byte
        short shortMin = -32768;
        long longMax = 9223372036854775807L; // 8 byte
        long longMin = -9223372036854775808L;
        byte byteMax = 127; // 1 byte
        byte byteMin = -128;

        System.out.println("Int Type Output");


        System.out.println("integer max: "+max);

        // float data type
        float fmax = 3.40282346638528860e+38f;  // 4 byte
        float fmin = 1.40129846432481707e-45f;
        double fdoubleMax = 1.79769313486231570e+308d;  // 8 byte
        double fdoubleMin = 4.94065645841246544e-324d;

        System.out.println("Float and Double Type Output");


        float x = 1.0f;

        System.out.println(9/2d);


        System.out.println(fdoubleMax);
        System.out.printf("%.2f",fdoubleMax);

        // boolean type in java

        System.out.println("Boolean Type Output");

        boolean var;
        var = true;
        System.out.println(var);

        char var2 = '\u00A7';
        System.out.println(var2);




        //

    }
}