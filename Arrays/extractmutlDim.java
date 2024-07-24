import java.util.*;
class extractmultlDim {

     
    
    public List<Integer> findWordsContaining(String[][] words, char x) {
       
        ArrayList<Integer> obj=new ArrayList<>();
        for(int indexx=0;indexx<words.length;indexx++)
        {
            for(int col=0;col<words[indexx][col].length();col++)
            {
                if(words[indexx][col]=="x")
                {
                    obj.add(col);
                }     
            }
            //if(words[i].contains("e"))
            // obj.add(i);

            
        }
        return obj;
    }
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();

        String s="Hari";
        s.toLowerCase();
        obj[][]={
            {1,2,3},[4,5,6],[7,8,9]
          
        }
       
    }
}
