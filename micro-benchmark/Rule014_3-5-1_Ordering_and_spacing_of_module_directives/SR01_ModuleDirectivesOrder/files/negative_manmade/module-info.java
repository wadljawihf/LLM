module com.example.myapp {
  provides com.example.spi.MyService with com.example.impl.MyServiceImpl;

  exports com.example.api;
  exports com.example.utils;

  requires java.sql;
  requires com.external.library;

  opens com.example.internal;

  uses com.example.spi.MyService;


}
