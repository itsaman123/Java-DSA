package OOPS;
class userDefineException extends Exception{

}
class testCustomException2{
    public static void main(String[] args){
        try{
            throw new userDefineException();
        }
        catch(userDefineException e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code...");
    }
}
