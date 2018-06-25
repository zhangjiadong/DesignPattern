package com.shadow.strategy;

/**
 * 策略模式测试
 *
 * @author Shadow
 * @createDate 24/06/2018
 * @since 1.0.0
 */
public class TestStrategy {
  
  public static void main(String[] args) {
    Context context;
    //A
    context = new Context(new ConcreteStrategyA());
    context.contextInterface();
    //B
    context = new Context(new ConcreteStrategyB());
    context.contextInterface();
    //C
    context = new Context(new ConcreteStrategyC());
    context.contextInterface();
  }
}
