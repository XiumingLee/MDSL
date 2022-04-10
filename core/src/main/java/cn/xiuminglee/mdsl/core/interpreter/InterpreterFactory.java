package cn.xiuminglee.mdsl.core.interpreter;

import java.util.List;
import java.util.Objects;

/**
 * @author xiuming
 * 解释器工程类
 */
public class InterpreterFactory {

    static List<Interpreter> interpreters;


    /**
     * 获取执行器
     *
     * @param type 类型
     * @return {@link Interpreter}
     */
    public static synchronized Interpreter get(InterpreterType type) {
        if (interpreters == null || interpreters.size() == 0) {
            return null;
        }
        for (Interpreter interpreter : interpreters) {
            if (interpreter.getType().equals(type)) {
                return interpreter;
            }
        }
        return null;
    }



    public static void  setInterpreters(List<Interpreter> interpreterList) {
        interpreters = interpreterList;
    }
}
