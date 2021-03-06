/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.filter;


/**
 *
 * @author modhu7
 */
public class UserFilter extends AbstractFilter{
  
  protected boolean disjunction;
  protected String organizationName;
  protected String userName;
  

  public String getSeparator() {
    return (isDisjunction())? " OR " : " AND ";
  }

  public boolean isDisjunction() {
    return disjunction;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}
