package com.deepak.order.model;

/**
 * Deepak Singhvi
 */
public class User {
  private String emailId;
  private String userFirstName;
  private String userLastName;

  public User() {

  }
  public User(String userId, String firstName, String lastName) {
    this.emailId = userId;
    this.userFirstName = firstName;
    this.userLastName = lastName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    return emailId.equals(user.emailId);

  }

  @Override
  public int hashCode() {
    return emailId.hashCode();
  }

  @Override
  public String toString() {
    return "com.deepak.order.model.User{" +
        "emailId='" + emailId + '\'' +
        ", userFirstName='" + userFirstName + '\'' +
        ", userLastName='" + userLastName + '\'' +
        '}';
  }
}
