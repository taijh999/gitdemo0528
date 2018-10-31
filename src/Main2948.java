import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;
 

public class Main2948 {
    public static void main(String[] args) {
    	 Scanner sc;
         try {
             sc = new Scanner(new File("e:/word.txt"));
         } catch (Exception e) {
             sc = new Scanner(System.in);
         }
        TreeMap<String,Integer> trees=new TreeMap<>();
        int sum=0;
        while (sc.hasNext()){
        //for (int i = 0; i < 29; i++) {
            String name=sc.nextLine();
            if (trees.containsKey(name)) {
                trees.put(name, trees.get(name)+1);
            }else{
                trees.put(name, 1);
            }
            sum++;
        }
        for (String key : trees.keySet()) {
            System.out.printf("%s %.4f%n",key,(float)trees.get(key)/sum*100);
        }
    }
 
}