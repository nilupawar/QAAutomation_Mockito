import sun.reflect.generics.scope.DummyScope;

public class MyDummyApplication {
    DummyService dummyService;

    public void ApplicationMethod(){
        dummyService = new DummyService();
        dummyService.run();
    }

    public void setDummyService(DummyService dummyService){
        this.dummyService =dummyService;
    }
    public int run(String a){
        return dummyService.run(a);
    }
}
