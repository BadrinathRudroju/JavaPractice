package CoreJava;

public class CustomException extends Exception{
    CustomException(String name){
        super(name);
    }
}

 class Main{
    public static void main(String[] args) throws CustomException {
        String name = "Badrinath";
        if(name.equals("Badrinath")){
            try{
                throw new CustomException("Name is Badrinath");
            }catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
