package Strategy.demo3;

public enum Calculator {

    ADD("+", "加法"){
        public int exec(int a, int b){
            return a + b;
        }
    },
    SUB("-","减法"){
        public int exec(int a, int b){
            return a - b;
        }
    };

    private String operator;
    private String desc;

    Calculator(String operator, String desc){
        this.operator = operator;
        this.desc = desc;
    }

    public abstract int exec(int a, int b);

    public String getOperator() {
        return operator;
    }

    public String getDesc() {
        return desc;
    }
}
