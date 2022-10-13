package com.capstone.AadharRestApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.capstone.AadharRestApi.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
