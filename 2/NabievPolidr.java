import java.util.Scanner;

public class NabievPolidr {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String slovo=s.nextLine();
        int d=slovo.length();
        String slrev="";
        for(int i=d-1;i>=0;i-- ){
            slrev=slrev+slovo.charAt(i);
        }
        if(slovo.equals(slrev)){
            System.out.println(slovo+"  polindrom");
        }
        else {
            System.out.println(slovo+" ne polindrom");
        }
    }
}
