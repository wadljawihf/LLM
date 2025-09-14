package com.example.naming;

public class AvoidSingleChar {

  // 合理命名参数
  public void sendMessage(String message, int count) {}

  // private 方法允许单字母参数，不受该规则约束
  private void compute(int x) {}

  // 包访问方法也不属于 public，不受该规则约束
  void internalCall(String s) {}

  // protected 方法允许使用简短参数（不建议但不违规）
  protected void backup(char flag) {}
}
