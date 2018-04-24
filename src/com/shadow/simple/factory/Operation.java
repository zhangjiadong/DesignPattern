package com.shadow.simple.factory;

/**
 * 基本运算操作
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class Operation {
  protected double a = 0;
  protected double b = 0;
  
  public double getResult() {
    return 0.0;
  }
  
  public double getA() {
    return a;
  }
  
  public void setA(double a) {
    this.a = a;
  }
  
  public double getB() {
    return b;
  }
  
  public void setB(double b) {
    this.b = b;
  }
}
