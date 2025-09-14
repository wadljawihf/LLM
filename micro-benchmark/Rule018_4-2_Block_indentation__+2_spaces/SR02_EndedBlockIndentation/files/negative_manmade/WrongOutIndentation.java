public class WrongOutIndentation {

  public WrongOutIndentation() {
    {
      int x = 1;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;
  }
      //+2
    //不变
   //-1
 //-3

  void method() {
    {
      //首部中部
      int scoped = 1;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;

    if (true) {
      int a = 1;
    } else {
      int b = 2;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;

    for (int i = 0; i < 3; i++) {
      int j = i;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;


    while (false) {
      int k = 0;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;

    do {
      int m = 0;
    } while (false);
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;


    {
      //中部
      int scoped = 1;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;


    switch (3) {
      case 1:
        int v = 1;
        break;
      default:
        int w = 0;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;

    {
      //尾部
      int scoped = 1;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;

  }

  void testMethodBody() {
    int a = 1;


    {
      int x = 1;
    }
        int y = 1;
      int y = 1;
     int y = 1;
   int y = 1;


  }
      //+2
    //不变
   //-1
 //-3

  class TestClassBody {
    int body = 1;


    {
      int x = 1;
    }

        int yy = 1;
      int yy = 1;
     int yy = 1;
   int yy = 1;
  }
      //+2
    //不变
   //-1
 //-3

}
