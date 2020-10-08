
package kosinski_practiceobjects;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class Kosinski_PracticeObjects {

    /*  Scott Kosinski
     *  ITDEV-110-004
     *  Assignment #5
     */
    
    public static void main(String[] args) {
        //  instaniate new Admin object and then display intro
        Admin getReady = new Admin();
        getReady.intro();
        
        //  instantiate new two MathFun objects
        MathFun calc1= new MathFun(12,3);
        MathFun calc2= new MathFun(5,8);
        
        //  display the values that are stored in each MathFun object
        System.out.println("\ncalc1: ("+calc1.getNumber1()+", "+calc1.getNumber2()+")");
        System.out.println("\ncalc2: ("+calc2.getNumber1()+", "+calc2.getNumber2()+")");
        
        System.out.println("\nProduct 1: "+calc1.multiplyThem());
        System.out.println("\nProduct 2: "+calc2.multiplyThem());
        
        System.out.println("\nSum 1: "+calc1.addThem());
        System.out.println("\nSum 2: "+calc2.addThem());
        
        getReady.goodbye();

    }
    
}
