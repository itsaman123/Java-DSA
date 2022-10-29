package OOPS;

public class throw002 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not elligible to vote");

        }
        else{
            System.out.println("person is elligible to vote");
        }

    }

    public static void main(String[] args) {
        validate(21);
    }
}
