public class TypeVariableName {

  // 单个大写字母
  class Box<T> {
    T value;
  }

  // 大写字母加数字
  class Pair<K1, V2> {
    K1 key;
    V2 value;
  }


  // 类名风格 + T 后缀
  class Response<ResponseT> {
    ResponseT body;
  }

  class FooBar<FooBarT> {
    FooBarT content;
  }

  // 泛型方法使用符合规范的类型参数
  class Utils {
    public static <E> void printAll(List<E> list) {
      for (E e : list) {
        System.out.println(e);
      }
    }
  }
}



