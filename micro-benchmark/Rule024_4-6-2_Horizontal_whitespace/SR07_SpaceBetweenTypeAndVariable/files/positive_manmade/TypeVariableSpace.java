package org.antlr.mojo.antlr4.positive;

public class TypeVariableSpace {
  // 基本类型
  int count;
  boolean flag;
  double value;

  // 引用类型
  String name;
  List<String> items;
  Map<String, Integer> indexMap;

  // 数组类型
  int[] numbers;
  String[][] table;

  // 泛型嵌套
  Map<String, List<Integer>> complexMap;
}
