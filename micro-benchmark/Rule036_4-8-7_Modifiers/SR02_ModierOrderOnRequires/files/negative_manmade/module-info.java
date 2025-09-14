module com.example.incorrect {
  requires static transitive com.example.lib; // 错误：static 在 transitive 前
  requires static com.example.util;           // 单个修饰符合法
  requires transitive com.example.core;       // 单个修饰符合法
}
