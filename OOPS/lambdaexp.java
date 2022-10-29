package OOPS;
@FunctionalInterface
interface lambdaexp {
    public void draw();
}
class A1{
    public static void main(String[] args) {
        int width=12;
        lambdaexp d=()->{
            System.out.println("draw "+width);
        };
        d.draw();
    }

}
