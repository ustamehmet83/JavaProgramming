package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);

    }

}// custom unchecked exception

class NoBreakExceptions extends Exception{// custom checked exception

        }
public class CustomExceptions {


    public static void main(String[] args) {


        //throw new FadyException();


        try {
            throw new NoBreakExceptions();
        } catch (NoBreakExceptions e) {
            e.printStackTrace();
        }

    }




}
