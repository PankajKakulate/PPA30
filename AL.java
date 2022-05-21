import java.lang.*;
import java.util.*;

public class AL {

    public static void main(String ar[]) {
        ArrayList<String> obj=new ArrayList<String>();
        ArrayList<String> obj2=new ArrayList<String>();
        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("April");
        obj.add("May");
        obj2.addAll(obj);
        System.out.println("Array list contains: "+obj);
        System.out.println("Size is:    "+obj.size());

        if(obj.contains("April")){ //new Comments
            System.out.println("Elementis there");
        }

        System.out.println(obj.indexOf("March"));
        System.out.println(obj.get(4));
        System.out.println("Addd"+obj2);

    }
}
