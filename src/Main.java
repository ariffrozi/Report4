public class Main {
    public static void main(String[] args){
        try{
            String str = "3．14";
            double d = Double.parseDouble(str);
        }catch (NumberFormatException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
