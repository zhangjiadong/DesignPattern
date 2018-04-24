package com.shadow.simple.factory;

/**
 * 乘法基本运算
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class OperationMul extends Operation {
  
  @Override
  public double getResult() {
    return a * b;
  }
}
