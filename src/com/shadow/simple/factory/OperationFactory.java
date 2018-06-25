package com.shadow.simple.factory;

/**
 * 运算工厂
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class OperationFactory {
  
  public static Operation createOperation(final String operation) {
    Operation oper = null;
    switch (operation) {
      case "+": {
        oper = new OperationAdd();
        break;
      }
      case "-": {
        oper = new OperationSub();
        break;
      }
      case "*": {
        oper = new OperationMul();
        break;
      }
      case "/": {
        oper = new OperationDiv();
        break;
      }
    }
    return oper;
  }
}
