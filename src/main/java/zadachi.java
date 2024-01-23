public class zadachi {
    public static void main(String[] args) {

        System.out.println(operation("1","2","Add"));
        System.out.println(operation("4","5", "subtract"));
        try {
              System.out.println(operation("6","0","divide"));
    }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(operation("4","2","Multiple"));
        }
    public static int operation(String str, String str2,String str3){
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str2);
        int result =0;

        if (str3.equalsIgnoreCase("add")){
            result = a+b;
        }else if (str3.equalsIgnoreCase("subtract")){
            result = a-b;
        } else if (str3.equalsIgnoreCase("divide")) {
            if (b == 0){
                throw new ArithmeticException("Divide by zero not allowed");
            }
            result = a / b;
        } else if (str3.equalsIgnoreCase("multiple")) {
            result = a * b;
        }
        return result;

    }
}




//    operation("1",  "2",  "add" ) ➞ 3
//
//        operation("4",  "5",  "subtract") ➞ -1
//
//        operation("6",  "3",  "divide") ➞ 2