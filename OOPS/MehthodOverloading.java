package OOPS;

class MehthodOverloading {
    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
        return a*b;
    }
    public static void main(String[] args){
        MehthodOverloading obj=new MehthodOverloading();
        int c=obj.multiply(5,4);
        double d=obj.multiply(5.7676,6.65645);
        System.out.print("product of return Integer: "+c+"\n");
        System.out.print("\nproduct of return double: "+d);


    }

}
