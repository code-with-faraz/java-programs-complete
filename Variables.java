// Program to demonstrate the use of instance and static variables in Java
public class Variables {
    int instanceVar = 20;
    static int staticVar = 30;

    public static void main(String[] args){
        Variables obj = new Variables();
        
        System.out.println(obj.instanceVar);
        System.out.println(staticVar);

    }    
}
