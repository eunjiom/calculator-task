package step3;

public enum OperatorType {

    ADD('+'){
        // apply 메서드 강제구현
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUB('-'){
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MUL('*'){
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIV('/'){
        @Override
        public double apply(double a, double b) {
            if(b == 0){
                throw new ArithmeticException("0으로 나눌 수 없습니다");
            }
            return a / b;
        }
    };

    private final char symbol;

    OperatorType(char symbol){
        this.symbol = symbol;
    }

    public abstract double apply(double a, double b);

    // 문자 > enum으로 사용 / new 없이 static으로 사용
    public static OperatorType fromchar(char op){
        // 입력 값이 op와 같다면 값을 리턴
        for (OperatorType op2: values()){
            if(op2.symbol == op){
                return op2;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자 입니다.");
    }
}
