public class CommentMultiSpace {
  void spacingExamples() {
    int a = 1;     // aligned with multiple spaces before comment
    int b = 2; // one space before comment (standard)

    // one space after slashes
    //   multiple spaces after slashes (also valid)
    //          even more spaces allowed

    int d = 4;      //     comment with many spaces before
    int e = 5;        // comment with no space after slashes (also allowed)
  }


  void emptyComments() {
    int x = 42; //
    //
    int y = 43; //
  }

}
