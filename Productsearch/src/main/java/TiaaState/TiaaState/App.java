package TiaaState.TiaaState;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.module.process.ProcessInput;
import com.module.process.ProcessOutput;
import com.module.process.ProcessorService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        System.out.println( "Hello World!" ); 
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Bolt no -");  
        int bolt = scanner.nextInt(); 
        System.out.print("Enter Machine no -");  
        int machine = scanner.nextInt(); 
        System.out.print("Enter Product Time in sec -");  
        int sec = scanner.nextInt(); 
        System.out.print("Enter Employee no -");  
        int emp = scanner.nextInt(); 
       ProcessOutput output= new ProcessorService(new ProcessInput(sec, bolt, machine, emp)).process();;
        

        System.out.println("Total Product " + output.getProduct());
        System.out.println("Total Timetaken " + output.getTimetaken());
 
    }
}
