/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.logindemo.logindemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logindemo.logindemo.domain.User;

/**
 *
 * @author jggmr
 */

public interface UserRepository extends JpaRepository<User, String>{

}
