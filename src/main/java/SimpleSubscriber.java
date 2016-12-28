import rx.Subscriber;

public class SimpleSubscriber extends Subscriber {
    private final String name;
    public SimpleSubscriber(String name) {
        this.name = name;
    }

    public void onCompleted() {
        System.out.print(name + ": Completed");
    }

    public void onError(Throwable throwable) {
        System.out.println(name + ": Error: " + throwable);
    }

    public void onNext(Object o) {
        System.out.println(name + ": " + o);
    }
}
