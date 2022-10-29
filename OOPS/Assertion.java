package OOPS;

public class Assertion {
    public static void main(String[] args) {
        int age=21;
        assert age<=18: "cannot vote";
        System.out.println("the voter's age is "+age);
    }
}
