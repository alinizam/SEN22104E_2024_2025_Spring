/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example06;

/**
 *
 * @author FSMVU
 */
public class Test {
    public static void main(String[] args) {
        int numbers[]={1,2,6,8,11};
        IFilter evenFilter=new IFilter() {
            @Override
            public boolean apply(int i) {
                return (i%2==0);
            }
        };
                
        applyFilterToArray(numbers,evenFilter);
        
        
           IFilter biggerFilter=new IFilter() {
            @Override
            public boolean apply(int i) {
                return (i>5);
            }
        };
        applyFilterToArray(numbers,biggerFilter);  
        
        //Lambda syntax
        applyFilterToArray(numbers,(num)->(num%2==1)); 
        
        
        applyFilterToArray(numbers,(num)->{
                //make something
                return (num>5);
            }); 
           
    }
    static void applyFilterToArray(int numbers[],IFilter filter){
        for (int number : numbers) {
            if (filter.apply(number)){
                System.out.println(number);
            }
        }
    }
}
