package OOPS;

class Animal {
    void add(){
        int a,b=12,c=23;
        a=b+c;
        System.out.println(a);
    }
}
class sub extends Animal{
    void subs(){
        int a=22;
        int b=11;
        int c=a-b;
        System.out.println(c);
    }
}
class calculate{
    public static void main(String[] args) {
        sub obj=new sub();
        obj.add();
        obj.subs();
    }
}
