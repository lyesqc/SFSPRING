/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.business;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lyes.BENSAADA
 */

@Scope("request")
@Service
public class UserBo {
    int i ;
    public String makeBusiness(){
        i++;
        return "I am doing business Task "+i;
    }
}
