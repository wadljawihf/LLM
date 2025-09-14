public class RightIndentation {

  public RightIndentation() {
    int body = 1;
    int body = 1;
    int body = 1;
    int body = 1;

    {
      int x = 1;
    }

    {
      int x = 1;
      int y = 1;
    }

    {
      int x = 1;
      int y = 1;
      int z = 1;
    }


    {
      int x = 1;
      int y = 1;
      int z = 1;
      int w = 1;
    }
  }


  void method() {
    {
      //首部中部
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }
    if (true) {
      int a = 1;
    } else {
      int b = 2;
    }

    if (true) {
      int a = 1;
    } else {
      int b = 2;
    }

    if (true) {
      int a = 1;
    } else {
      int b = 2;
    }

    if (true) {
      int a = 1;
    } else {
      int b = 2;
    }

    for (int i = 0; i < 3; i++) {
      int j = i;
    }

    for (int i = 0; i < 3; i++) {
      int j = i;
    }

    for (int i = 0; i < 3; i++) {
      int j = i;
    }

    for (int i = 0; i < 3; i++) {
      int j = i;
    }

    while (false) {
      int k = 0;
    }

    while (false) {
      int k = 0;
    }

    while (false) {
      int k = 0;
    }

    while (false) {
      int k = 0;
    }

    do {
      int m = 0;
    } while (false);

    do {
      int m = 0;
    } while (false);

    do {
      int m = 0;
    } while (false);

    do {
      int m = 0;
    } while (false);


    {
      //中部
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    switch (3) {
      case 1:
        int v = 1;
        break;
      default:
        int w = 0;
    }

    switch (3) {
      case 1:
        int v = 1;
        break;
      default:
        int w = 0;
    }

    switch (3) {
      case 1:
        int v = 1;
        break;
      default:
        int w = 0;
    }

    switch (3) {
      case 1:
        int v = 1;
        break;
      default:
        int w = 0;
    }


    {
      //尾部
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }

    {
      int scoped = 1;
    }
  }

  void testMethodBody() {
    int a = 1;
    int a = 1;
    int a = 1;
    int a = 1;

    {
      int x = 1;
    }

    {
      int x = 1;
      int y = 1;
    }

    {
      int x = 1;
      int y = 1;
      int z = 1;
    }


    {
      int x = 1;
      int y = 1;
      int z = 1;
      int w = 1;
    }


  }

  class TestClassBody {
    int body = 1;
    int body = 1;
    int body = 1;
    int body = 1;

    {
      int x = 1;
    }

    {
      int x = 1;
      int y = 1;
    }

    {
      int x = 1;
      int y = 1;
      int z = 1;
    }


    {
      int x = 1;
      int y = 1;
      int z = 1;
      int w = 1;
    }
  }

}
