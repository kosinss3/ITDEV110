/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosinski_practiceobjects;

/**
 *
 * @author Scott Kosinski <https://github.com/kosinss3>
 */
public class MathFun {
    
    private int number1, number2;
    
    MathFun(int n1, int n2){
        number1 = n1;
        number2 = n2;
    }

    public int getNumber1(){
        return number1;
    }
    
    public void setNumber1(int n1){
        this.number1 = n1;
    }

    public int getNumber2(){
        return number2;
    } 
    
    public void setNumber2(int n2){
        this.number2 = n2;
    }
    
    public int multiplyThem(){
        int product = number1 * number2;
        return product;
    }
    
    public int addThem(){
        int sum = number1 + number2;
        return sum;
    }
    
}
