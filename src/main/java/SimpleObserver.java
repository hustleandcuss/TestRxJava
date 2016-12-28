import rx.Observer;

public class SimpleObserver implements Observer<String> {

    public void onCompleted() {
        System.out.println("completed...");
    }

    public void onError(Throwable throwable) {
        System.out.println("error...");
    }

    public void onNext(String s) {
        System.out.println(s);
    }

   // public void count(int i) {
   //     System.out.println(i);
   // }
}
