
package fiboccini;

public class Fiboccini {

    public static void main(String[] args) {
        
        int s = 0;
        int w = 1;
        int t2;
        
        for(int i = 0; i<20;i++)
        {
            t2 = s;
            s = w + s;
            w = t2;
            System.out.println(s);
        }
        
        
        
    }
    
}
