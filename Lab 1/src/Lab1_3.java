import java.util.Date;
import java.util.Random;

public class Lab1_3 {
    
    public static int NUM_RECTANGLES = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rectangle r1 = new Rectangle(10,20);
        
        System.out.println("Rectangle r1 ("+r1.getLength()+","+r1.getWidth()+")");
        System.out.println("\tArea = " + r1.area());
          // Notice the use of the tab character \t
          
        // Task 1 : On the next line, print out the perimeter, similarly tabbed
        System.out.println("\tPerimeter = " + r1.perimeter());
        
        // Task 2: Create a second rectangle called r2 with length = 20, width=10.
        Rectangle r2 = new Rectangle(20,10);
                
        
        //  DO NOT CHANGE THE FOLLOWING CODE
        
        Rectangle rectangles[] = new Rectangle[NUM_RECTANGLES];
        Random randomGenerator = new Random();
        int width, length;
        for (int i=0; i< rectangles.length; i++)
        {
            width = randomGenerator.nextInt(49) + 1;
            length = randomGenerator.nextInt(49) + 1;
            rectangles[i] = new Rectangle(length, width);
        }
        
        // Task 3 : Print out all randomly generated rectangles, one per line.
        //   Each line should print EXACTLY: r[i] = (w,l)
        for (int i=0; i< rectangles.length; i++){
        	System.out.println("r[" + i + "] = " + "("+rectangles[i].getLength()+","+rectangles[i].getWidth()+")");
        }
        // Task 4 : Search and print out the information for the rectangle with
        //   the largest area
        Rectangle maxArea = rectangles[0];
        for (int i=0; i< rectangles.length; i++){
        	if (rectangles[i].area()>maxArea.area()) maxArea = rectangles[i]; 
        }
        System.out.println("largest area: ("+maxArea.getLength()+","+maxArea.getWidth()+")");
        // Task 5 : Search and print out the information for the rectangle with
        //   the shortest perimeter
        Rectangle minPerimeter = rectangles[0];
        for (int i=0; i< rectangles.length; i++){
        	if (rectangles[i].perimeter()<minPerimeter.perimeter()) minPerimeter = rectangles[i]; 
        }
        System.out.println("Shortest perimeter: ("+minPerimeter.getLength()+","+minPerimeter.getWidth()+")");
        
        //Part B:
        Random myRandomGenerator = new Random(3*15*1999);
        int[] randomNum = new int[2000];
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i=0; i<randomNum.length; i++){
        	randomNum[i] = myRandomGenerator.nextInt(26)+65;
        	if(i==0) {
        		min = randomNum[i];
        		max = randomNum[i];
        		sum = randomNum[i];
        	}
        	if (randomNum[i]<min) min=randomNum[i];
        	if (randomNum[i]>max) max=randomNum[i];
        	sum+=randomNum[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + sum/randomNum.length);
        
        int stringLength = myRandomGenerator.nextInt(100)+1;
        byte myBytes[] = new byte[stringLength];
        for (int i=0; i<myBytes.length; i++){
        	myBytes[i] = (byte) (myRandomGenerator.nextInt(26)+65);
        }
        String s1 = new String(myBytes);
        System.out.println("s1: " + s1);
        System.out.println("lowercase s1: " + s1.toLowerCase());
        
        Date today = new Date();
        System.out.println("time: " + today.getTime());
        
    }
   
}
