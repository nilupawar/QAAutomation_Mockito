public class DummyService {

    public void run(){
        System.out.println("run method without any parameter and return value called");
    }

    public void run(int anyValue){
        System.out.println("run method with int parameter called");
    }

    public int run(String anyValue){
        System.out.println("run method with string parmeter and int return is called");
        return 1;
    }
}
