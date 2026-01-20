package step3;

import java.util.ArrayList;

public class ArithmeticCalculator {

    // 제네릭 더블타입으로 변경
    private final ArrayList<Double> results = new ArrayList<>();

    // 더블도 되고 int도 됨
    public <T extends Number, U extends Number> double calculator(T a, U b, OperatorType op) {

        double double1 = a.doubleValue();
        double double2 = b.doubleValue();
        double result = op.apply(double1, double2);


        results.add(result);
        return result;

    }

    // getter
    public ArrayList<Double> getResult() {
        return results;
    }

    public void removeResult() {
        results.remove(0);
        }
    }


