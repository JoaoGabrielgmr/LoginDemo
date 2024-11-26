/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.logindemo.logindemo.infra;

import org.springframework.stereotype.Service;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.logindemo.logindemo.domain.User;

/**
 *
 * @author jggmr
 */

@Service
public class TokenService {

    public String generateToken(User user){
        try{
            Algorithm algorithm = Algorithm.HMAC256();
        } catch (JWTCreationException e){
            throw new RuntimeException("Error while authenticating");
        }
    }
}
