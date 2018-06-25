package com.shadow.simple.factory;

/**
 * 测试类
 * 实现两个数 A 和 B的求和
 *
 * @author Shadow
 * @createDate 23/04/2018
 * @since 1.0.0
 */
public class TestOperation {
  
  public static void main(String[] args) {
    Operation operation = OperationFactory.createOperation("-");
    operation.setA(10);
    operation.setB(20);
    System.out.println("result==" + operation.getResult());
    
  }
}
