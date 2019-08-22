package com.thoughtworks.computerinventory.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "computer")
public class ComputerEntity {

  @Id
  private int id;
  private String type;
  private String owner;
  private Date createTime;

  public ComputerEntity() {
  }

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

  public void setId(int id) {
    this.id = id;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
