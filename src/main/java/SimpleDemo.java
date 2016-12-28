import java.util.Arrays;
import java.util.List;
import rx.Observable;

public class SimpleDemo {
    public static void main(String[] args) {
        List<String> shapeList = Arrays.asList("rectangle", "square", "triangle");
        Observable<String> observableString = Observable.from(shapeList);
        observableString.subscribe(new SimpleObserver());

        Observable<Integer> values = Observable.range(0, 3);
        values
            .count()
            .subscribe(new SimpleSubscriber("count"));
    }
}
