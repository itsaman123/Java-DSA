package OOPS;
class this03{
    this03(){
        System.out.println("hello m");
    }
    this03(int x){
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        this03 o=new this03();

    }

}