package com.thoughtworks.computerinventory.entity;

import java.util.Date;

public class ComputerEntity {

  private int id;
  private String type;
  private String owner;
  private Date createTime;

  public ComputerEntity(int id, String type, String owner, Date createTime) {
    this.id = id;
    this.type = type;
    this.owner = owner;
    this.createTime = createTime;
  }

  public int getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public String getOwner() {
    return owner;
  }

  public Date getCreateTime() {
    return createTime;
  }
}
