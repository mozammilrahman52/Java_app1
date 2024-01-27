package mock1;

public class B { // Dublicate Element only.
    public static void main(String[] args) {
        int [] x = {23,45,23,45,7};
        for (int i=0; i<x.length; i++){
            for (int j = i+1; j<x.length; j++){
                if(x[i]==x[j]){
                    System.out.println(x[j]);
                }
            }
        }
        System.out.println("======================");
        DublicateElement();
    }
    public static void DublicateElement(){
        int [] x = {1,1,2,2,3,4};
        int [] y = new int[x.length];
        int j=0;
        int c=0;
        for (int i =0; i<x.length-1; i++){
            if(x[i]!=x[i+1]){
                y[j] = x[i];
                j++;
                c++;
            }
        }
        y[j] = x[x.length-1];
        for (int k=0; k<=c; k++){
            System.out.println(y[k]);
        }
    }
}
