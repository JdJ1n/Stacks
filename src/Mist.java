import java.util.ArrayList;
import java.util.List;

public class Mist {
    public static int mistFonction1(int m,int n){
        if(m==1&&n==1) return 1;
        if(m==0||n==0) return 0;
        return mistFonction1(m-1,n)+mistFonction1(m,n-1);
    }
    public static List<List<String>>[] mistFonction2(String target, List<String> pieces){
        List<List<String>>[] table = new ArrayList[target.length()+1];
        return table;
    }
}
