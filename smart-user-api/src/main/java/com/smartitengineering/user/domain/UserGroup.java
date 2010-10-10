/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.domain;

import com.smartitengineering.domain.AbstractPersistentDTO;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author russel
 */
public class UserGroup extends AbstractPersistentDTO<UserGroup> {

  private String name;
  private Set<User> users;
  private Set<Privilege> privileges;
  private Set<Role> roles;
  
  private Organization organization;
  private Date lastModifiedDate;

  @JsonIgnore
  public Set<Role> getRoles() {
    if(roles==null){
      roles = new HashSet<Role>();
    }
    return roles;
  }

  @JsonIgnore
  public void setRoles(Set<Role> roles) {
    if(roles==null){
      return;
    }
    this.roles = roles;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @JsonIgnore
  public Set<User> getUsers() {
    return users;
  }

  @JsonIgnore
  public void setUsers(Set<User> users) {
    this.users = users;
  }

  @JsonIgnore
  public Set<Privilege> getPrivileges() {
    return privileges;
  }

  @JsonIgnore
  public void setPrivileges(Set<Privilege> privileges) {
    this.privileges = privileges;
  }

  @Override
  @JsonIgnore
  public boolean isValid() {
    if(StringUtils.isEmpty(name)){
      return false;
    }
    return true;
  }

  @JsonIgnore
  public Organization getOrganization() {
    return organization;
  }

  @JsonIgnore
  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  @JsonIgnore
  public Date getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(Date lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
}
