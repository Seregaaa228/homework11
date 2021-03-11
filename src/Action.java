import java.util.HashMap;
import java.util.Map;

public enum Action implements IntegerOperation {
        ADD(Integer::sum),
        MINUS((x, y) ->  x - y),
        MULTIPLY((x, y) -> x * y),
        DIVIDE((x, y) -> x / y);

        IntegerOperation operationStrategy;

        Action(IntegerOperation operationStrategy) {
            this.operationStrategy = operationStrategy;
        }

   static Map<String, Action> operations =
            new HashMap<>() {{
                put("PLUS", Action.ADD);
                put("MINUS", Action.MINUS);
                put("TIMES", Action.MULTIPLY);
                put("DIVISION", Action.DIVIDE);
            }};

    @Override
    public int compute(int x, int y) {
        return operationStrategy.compute(x, y);
    }
    public static void calculate(int x, String action, int y){
        System.out.println(operations.get(action).compute(x,y));
    }
}
