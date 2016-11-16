/**
 * Created by opilane on 16.11.2016.
 */
public class Chapter_9 {
    public static void main(String[] args){
 //character from string
        String fruit="banaan";
        char letter=fruit.charAt(2);
        System.out.println(letter);
//Tähestik out print
        System.out.println("Rooma tähestik");
        for(char a='A';a<='Z';a++){
            System.out.print(a);
        }
        System.out.println();
        String stuff=fruit.replace("a","z");
        System.out.println(stuff);

        for(char c:fruit.toCharArray()){
            System.out.println(c);
        }
    }
}
