package com.blankj.subutil.util.negative;

public class NameNotAttachToParenthesis {
  // 构造函数名与 ( 之间有空格
  public NameAttachToParenthesisViolatingSpace () {
  }

  // 构造函数名与 ( 之间换行
  public NameAttachToParenthesisViolatingNewline
      () {
  }

  // 方法名与 ( 之间有空格
  public void doSomethingSpace () {
    System.out.println("Bad space in method");
  }

  // 方法名与 ( 之间换行
  public void doSomethingNewline
      () {
    System.out.println("Bad newline in method");
  }



  // record 类名与 ( 之间有空格
  record BadRecordSpace (String name, int age) {}

  // record 类名与 ( 之间换行
  record BadRecordNewline
      (String name, int age) {}
}
