
package movies;
import static java.util.Arrays.sort;

public class SortGeneric {
    static<T>void print(T array[])
    {
        for(T var:array)
        {
            System.out.print(" "+var);
            
        }
    }
    public static void main(String args[])
            
    {
        Character array1[]={'S','W','A','P','A','N'};
        Integer array2[]={21,12,17,14,6,9,40};
        Double array3[]={7.5,6.3,2.8,3.9,4.2,5.1,9.7};
        System.out.println("Character Array before Sorting");
        print(array1);
        System.out.println("\nCharacter Array after Sortong");
        sort(array1);
        print(array1);
        
System.out.println("Integer Arary before Sorting");
        print(array2);
        System.out.println("\nInteger Array after Sorting");
        sort(array2);
        print(array2);
        
        System.out.println("Double Array before Sorting");
        print(array3);
        System.out.println("\nDouble Array after Sorting");
        sort(array3);
        print(array3);
    }
}