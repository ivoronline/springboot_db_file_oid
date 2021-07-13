package com.ivoronline.springboot_db_file_oid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  @Lob
  public byte[]  description; //It is stored as bytea

}
