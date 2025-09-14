package org.apache.flink.table.runtime.arrow.sources.positive;

class TestJsni {
  // < 100 characters
  native void shortCall() /*-{
    $wnd.shortRef();
}-*/;

  // = 100 characters
  native void mediumCall() /*-{
    $wnd.abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghddddddddij();
}-*/;

  // > 100 characters (Allowed)
  native void longCall() /*-{
    $wnd.this.is.a.really.really.really.really.long.jsni.method.reference.that.exceeds.one.hundred.characters();
}-*/;
}
