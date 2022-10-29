package OOPS;

//Super keyword with variable;

class parameter{
    int height=12,width=10;
}
class Super1 extends parameter{
    int height=4,width=7;
    public void area(){
        int ar;
        ar=height*width;
        System.out.println("area without super keyword: "+ar);
        ar=super.height*super.width;
        System.out.println("area with super class: "+ar);

    }

}
class Super001 {

    public static void main(String[] args) {
        Super1 obj = new Super1();
        obj.area();
    }
}

