public class Linecomparison { 
    public static void check(int x1, int x2, int y1, int y2, 
                             int p1, int p2, int z1, int z2) 
    {  
       int a1 = (y2-y1)*p1 + (x1-x2)*z1 + (x2*y1-x1*y2); 
          if (a1 < 0) { 
            int a2 = (y2-y1)*p2 + (x1-x2)*z2 + (x2*y1-x1*y2); 
              if (a2 >= 0) 
                System.out.println("Unique"); 
              else if (a2 < 0) 
                System.out.println("Distinct"); 
        } 
        else if (a1 > 0) { 
            int a2 = (y2-y1)*p2 + (x1-x2)*z2  + (x2*y1- x1*y2); 
             if (a2 <= 0) 
                System.out.println("Unique"); 
             else if (a2 > 0) 
                System.out.println("Distinct"); 
        } 
        else
            System.out.println("points are lying on the line"); 
    } 
    public static void main(String args[]) 
    { 
        int x1 = 2, y1 = 3; 
        int x2 = 6, y2 = 4; 
        System.out.println("Equation 1: (" +(y2-y1)+ ")x + (" +(x1-x2)+ ")y + ("+(x2*y1-x1*y2)+ ") = 0"); 
        int p1 = 3, z1 = 4; 
        int p2 = 7, z2 = 1; 
        System.out.println("Equation 2: (" +(z2-z1)+ ")x + (" +(p1-p2)+ ")y + (" +(p2*z1-p1*z2)+ ") = 0"); 
        check(x1, x2, y1, y2, p1, p2, z1, z2); 
    } 
}
