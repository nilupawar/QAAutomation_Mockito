public class MyDummyApplication {
    DummyService dummyService;

    public void ApplicationMethod(){
        dummyService = new DummyService();
        dummyService.run();
    }

    void setDummyService(DummyService dummyService){
        this.dummyService =dummyService;
    }
    int run(String a){
        return dummyService.run(a);
    }
    void run(){
        dummyService.run();
    }
}
