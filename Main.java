import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = scanner.nextInt();
        int[] source = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            source[i] = scanner.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Main m = new Main();
        m.subsetFinder(0,source,list,temp);
        System.out.println(list);
    }
    public void subsetFinder(int index,int[] source,List<List<Integer>> list,List<Integer> temp){
        if(index>=source.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(source[index]);
        subsetFinder(index+1,source,list,temp);
        temp.remove(temp.size()-1);
        subsetFinder(index+1,source,list,temp);
    }
}
