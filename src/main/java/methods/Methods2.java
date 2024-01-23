package methods;

public class Methods2 {
    public static void main(String[] args) {
        Methods2 object = new Methods2();
        System.out.println(object.getName("Meerim"));
        System.out.println(object.getName("Atai"));
        System.out.println(object.getName("Ulan"));
        System.out.println(object.getName("Aslan"));
        System.out.println(object.getName("Bayaman"));
        System.out.println(object.getName("Bektur"));
    }

    public String getName(String name){
        System.out.println("What is your name?");
        return "My name is " +  name;
    }
}
