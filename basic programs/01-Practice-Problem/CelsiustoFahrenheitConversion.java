import java.util.*;
public class CelsiustoFahrenheitConversion {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
       double celsius = sc.nextDouble();
       double fahrenheit = (celsius * 9 / 5) + 32;
          System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit", celsius, fahrenheit);
         sc.close();
    }
    
}
