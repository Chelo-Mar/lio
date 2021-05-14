
/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador
{
   public int contador(int n){
       int num1 = 1;
       System.out.print(num1 + "");
       int num2= 2;
       System.out.print(num1 + "");
       int num3 = 3;
       System.out.print(num1 + "");
       int contador = 0;
       for(int i = 1 ; i<= n;i++){
        contador= num1 + num2;
        System.out.print(contador + "");
        contador = num2 + num3;
        System.out.print(contador + "");
        num1= num2;
        num2= num3;
        num1= contador;
        num2= contador;
        num3= contador;
       
        }
    return contador;
    }
}
