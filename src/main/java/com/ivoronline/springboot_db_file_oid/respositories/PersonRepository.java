package com.ivoronline.springboot_db_file_oid.respositories;

import com.ivoronline.springboot_db_file_oid.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
