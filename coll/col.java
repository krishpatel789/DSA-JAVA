import java.util.*;
class col{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(500);
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        arr.add(20);
        arr.add(1);
        arr.add(0);
        arr.remove(0); //removes element at specified index
        System.out.println(arr);

        System.out.println(arr);
        arr.add(0,100);
        System.out.println(arr);
        System.out.println(arr.get(0));
        
       System.out.println(arr);
       System.out.println(arr.size());
       arr.add(100);
       System.out.println(arr.indexOf(100));
       System.out.println(arr.contains(20));
       System.out.println(arr.toArray());

    //    int[] arrr=arr.toArray();
    Integer[] arrr=arr.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arrr));







       
    //   int[] arr=new int[5];
    //   arr[0]=5;
    //   arr[1]=6;
    //   arr[2]=5;
    //   arr[3]=5;
    //   arr[4]=100;
    //   System.out.println(Arrays.toString(arr));
    //   System.out.println(arr.indexOf(5);
        // String name="is a good boiii";
        

    }
}