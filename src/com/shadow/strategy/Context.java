package com.shadow.strategy;

/**
 * 上下文
 *
 * @author Shadow
 * @createDate 24/06/2018
 * @since 1.0.0
 */
public class Context {
  
  private Strategy strategy;
  
  public Context(Strategy strategy) {
    this.strategy = strategy;
  }
  
  //上下文接口
  public void contextInterface() {
    strategy.AlgorithmInterface();
  }
}
