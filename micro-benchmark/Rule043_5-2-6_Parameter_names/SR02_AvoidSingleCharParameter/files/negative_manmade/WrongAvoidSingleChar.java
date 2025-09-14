package org.jkiss.dbeaver.ext.altibase.model.negative;

public class WrongAvoidSingleChar {

  // 单字符参数名
  public void setX(int x) {}

  // 多个单字符参数名
  public void map(char k, char v) {}

  // 单字母布尔参数
  boolean check(char f) {
    return f == 'Y';
  }
}
