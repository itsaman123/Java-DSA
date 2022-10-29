package OOPS;

class VarArgs {
    static int add(int ...arr){
        int result=0;
        for(int a:arr){
            result=result+a;

        }return result;

    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(4,4,2,5,8,5,3,7));
    }

}
