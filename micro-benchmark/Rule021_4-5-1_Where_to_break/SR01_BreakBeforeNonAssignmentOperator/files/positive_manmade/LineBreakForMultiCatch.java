package com.blankj.subutil.util.positive;

public class LineBreakForMultiCatch {
  public void handleExceptionsCompliantly() {
    try {
      maybeThrow();
    } catch (IOException
             | SQLException e) {
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
