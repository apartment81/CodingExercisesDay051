package ro.mirodone;

public class Main {

    public static void main(String[] args) {
        //test code

        StringMerge stringMerge = new StringMerge();

        System.out.println(stringMerge.isMerge("codewars", "code", "wars"));
        System.out.println(stringMerge.isMerge("codewars", "cdw", "oeas"));
        System.out.println(stringMerge.isMerge("bogdan", "bgd", "oan"));
        System.out.println(stringMerge.isMerge("baloon", "bln", "aoo"));


    }
}
