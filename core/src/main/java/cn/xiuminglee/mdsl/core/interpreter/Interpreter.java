package cn.xiuminglee.mdsl.core.interpreter;

/**
 * @author xiuming
 * 解释器接口
 *
 * 1、environment设置器，不同的执行环境，环境准备不同，比如Spark、Flink一开始的设置session.
 * 2、SourceInterpreter
 * 3、TransformInterpreter
 * 4、ModelInterpreter
 *      4.1、CreateModel  // Antlr 中根据创建表的语句，添加创建Model的语句
 *      4.2、PredictModel // Antlr 中根据Select和Insert语句，添加预测的语句
 * 5、SinkInterpreter
 */
public interface Interpreter {

    /** Interpreter类型  */
    InterpreterType getType();



}

