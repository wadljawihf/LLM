public class InsideBrace {

  int[] arr1 = new int[] {1, 2, 3};           // 无空格
  int[] arr2 = new int[] { 4, 5, 6 };         // 双侧空格

  String[] names = new String[] {"Alice", "Bob"};
  String[] titles = new String[] { "Dr.", "Ms." };

  // 多维数组初始化
  int[][] matrix = new int[][] {
      {1, 2},
      {3, 4}
  };

  int[][] paddedMatrix = new int[][] { { 1, 2 }, { 3, 4 } }; // 双层嵌套也允许空格
}
