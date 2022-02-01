import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Fiat"));
        carList.add(new Car("Renault"));
        carList.add(new Car("Hyundai"));
        carList.add(new Car("Chevrolet"));

        System.out.println(carList.contains(new Car("Fiat")));
        System.out.println(new Car("Fiat").hashCode());

        //para criar uma pilha:
        Stack<Car> stackCar = new Stack<>();

        stackCar.push(new Car("Fiat"));
        stackCar.push(new Car("Hyundai"));
        stackCar.push(new Car("Renault"));

        System.out.println(stackCar.peek());
    }
}
