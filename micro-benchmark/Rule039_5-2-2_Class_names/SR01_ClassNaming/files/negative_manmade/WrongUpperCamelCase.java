public class WrongUpperCamelCase {

  class dataloader {}       // 全小写

  class httpRequesthandler {} // 第二个词首字母未大写

  class Data_LoaderUtils {} // 不应使用下划线连接普通词

  // 从 Müller’s algorithm 转化而来, 但含有 非 ASCII 字符 ü
  class MüllersAlgorithm {}

  // 从 Müller’s algorithm 转化而来, 但含有 撇号’
  class Muller’sAlgorithm {}

  // 特殊前后缀
  class mUserCount {}    // 前缀 m

  class userName_{}  // 后缀 _

  class s_value {}       // 前缀 s_

  class kCount {}        // 前缀 k


}
