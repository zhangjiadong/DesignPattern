package com.shadow.simple.factory;

/**
 * 加法运算操作
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class OperationAdd extends Operation {
  
  @Override
  public double getResult() {
    return a + b;
  }
}
