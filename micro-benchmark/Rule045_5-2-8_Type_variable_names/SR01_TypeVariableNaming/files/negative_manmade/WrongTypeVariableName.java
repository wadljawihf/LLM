public class WrongTypeVariableName {

  // 小写字母用作类型参数
  class Box<t> {
    t value;
  }

  // 多个大写字母，不符合单字母或类名+T的命名法
  class Map<KEY, VALUE> {
    KEY key;
    VALUE value;
  }

  // 大写字母加多个数字
  class Pair<K11, V222> {
    K11 key;
    V222 value;
  }

  // 类名风格但无 T 结尾
  class Response<ResponseY> {
    ResponseY body;
  }

  class FooBar<FooBarTZ> {
    FooBarTZ content;
  }

  // 使用无意义的命名
  class StrangeType<Xyz123> {
    Xyz123 unknown;
  }

  // 泛型方法使用小写或错误命名
  class Utils {
    public static <element> void printAll(List<element> list) {
      for (element e : list) {
        System.out.println(e);
      }
    }
  }
}



