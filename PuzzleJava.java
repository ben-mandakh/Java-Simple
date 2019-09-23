import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{
    public ArrayList<Integer>printSumAndReturnGreaterThanTen(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> greaters = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i]>10){
                greaters.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(greaters);
        return greaters;
    }

    public ArrayList<String>printNamesShuffle(){
        String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> longNames = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i].length()>5){
                longNames.add(arr[i]);
                Collections.shuffle(longNames);
            }
            names.add(arr[i]);
            Collections.shuffle(names);
        } 
        System.out.println(names);
        System.out.println(longNames);
        return longNames;
    }
    //////////////////////////////////////////////////////////////////////////////

        public ArrayList<String>printAlphabet(){
        String[] arr = {"a","b","c","d","e","f","g","h","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> all = new ArrayList<String>();
        
        for(int i=0; i<arr.length; i++){
            all.add(arr[i]);
            Collections.shuffle(all);
        } 
        if(all.get(0) == "a" || all.get(0) == "e" || all.get(0) == "o" || all.get(0) == "u" || all.get(0) == "i"){
            System.out.println("This is a vowel");
        }
        System.out.println(all.get(0));
        System.out.println(all);
        System.out.println(all.get(arr.length-1));
        return all;
    }
      public ArrayList<Integer>print55To100(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> numTen = new ArrayList<Integer>();
        for(int i=55; i<101; i++){
            arr[i] = numTen.nextInt();
            numTen.add(arr[i]);
        }
        System.out.println(numTen);
        return numTen;
    }
}
/////////////////////////DIDN'T FINISH, BUT GOT THE LOGIC OF JAVA//////////////////////
