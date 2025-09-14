module com.example.myapp {
  requires java.sql;
  requires com.external.library;


  exports com.example.api;

  exports com.example.utils;
  opens com.example.internal;



  uses com.example.spi.MyService;




  provides com.example.spi.MyService with com.example.impl.MyServiceImpl;
}
