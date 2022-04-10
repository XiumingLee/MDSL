package cn.xiuminglee.mdsl.core.interpreter;

/**
 * @author xiuming
 * 解释器类型
 */
public enum InterpreterType {
    /** spark解释器 */
    SPARK("spark")
    ;

    private String value;

    InterpreterType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
