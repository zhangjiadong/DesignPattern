package com.shadow.simple.factory;

/**
 * 运算工厂
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class OperationFactory {
  
  public static Operation creareOperation(String operation) {
    Operation oper = null;
    if ("+".equals(operation)) {
      oper = new OperationAdd();
    }
    if ("-".equals(operation)) {
      oper = new OperationSub();
    }
    if ("*".equals(operation)) {
      oper = new OperationMul();
    }
    if ("/".equals(operation)) {
      oper = new OperationDiv();
    }
    return oper;
  }
}
