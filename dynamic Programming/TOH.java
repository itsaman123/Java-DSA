package dynamicprogramming;

public class TOH {
    public static void towerofHanoi(int n,String src,String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+ src +" to "+dest);
            return;
        }
        towerofHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+ src +" to "+dest);
        towerofHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=2;
        String src="S";
        String helper="H";
        String dest="D";
        towerofHanoi(n,src,helper,dest);

    }
}
