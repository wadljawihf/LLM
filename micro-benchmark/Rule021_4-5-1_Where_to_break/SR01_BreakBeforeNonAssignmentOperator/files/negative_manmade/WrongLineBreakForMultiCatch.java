package com.blankj.subutil.util.negative;

public class WrongLineBreakForMultiCatch {
  public void handleExceptionsViolating() {
    try {
      maybeThrow();
    } catch (IOException |
             SQLException e) {
      System.out.println("Handled: " + e.getMessage());
    }
  }

  private void maybeThrow() throws IOException, SQLException {
    if (Math.random() > 0.5) {
      throw new IOException("IO error");
    } else {
      throw new SQLException("SQL error");
    }
  }
}
