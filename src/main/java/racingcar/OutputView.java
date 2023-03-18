package racingcar;

import java.util.List;

public class OutputView {
    public void printExecutionResults(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void printPreface() {
        System.out.println();
        System.out.println("실행 결과");
    }
}
