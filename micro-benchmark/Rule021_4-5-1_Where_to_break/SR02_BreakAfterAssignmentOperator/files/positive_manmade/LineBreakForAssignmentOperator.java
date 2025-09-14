package com.blankj.subutil.util.positive;

public class LineBreakForAssignmentOperator {
  void assignmentEqualsPreferred() {
    // 推荐：等号后换行
    int total =
        100 + 50;
  }

  void foreachColonPreferred(List<String> items) {
    // 推荐：冒号后换行
    for (String item :
        items) {
      System.out.println(item);
    }
  }

  void assignmentEqualsAccepted() {
    //允许：等号前换行（虽然不推荐）
    int total
        = 100 + 50;
  }

  void foreachColonAccepted(List<String> items) {
    //允许：冒号前换行（虽然不推荐）
    for (String item
        : items) {
      System.out.println(item);
    }
  }
}
