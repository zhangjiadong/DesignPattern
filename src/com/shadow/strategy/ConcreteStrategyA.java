package com.shadow.strategy;

/**
 * 具体算法A
 *
 * @author Shadow
 * @createDate 24/06/2018
 * @since 1.0.0
 */
public class ConcreteStrategyA extends Strategy {
  
  @Override
  public void AlgorithmInterface() {
    System.out.println("具体算法A........");
  }
}
