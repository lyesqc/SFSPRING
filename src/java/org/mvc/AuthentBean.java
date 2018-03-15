/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mvc;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.business.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.jsf.FacesContextUtils;

/**
 *
 * @author Lyes.BENSAADA
 */


//@ManagedBean
//@SessionScoped
public class AuthentBean {

    /**
     * Creates a new instance of AuthentBean
     */
    
    //@PostConstruct
    private void init() {
        FacesContextUtils
            .getRequiredWebApplicationContext(FacesContext.getCurrentInstance())
            .getAutowireCapableBeanFactory().autowireBean(this);

        // springBeanName is now available.
    }
    public AuthentBean() {
    }
    //@Autowired
    UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    
    public void setUserBo(UserBo userBo) {
        System.out.println("I am affecting userBo to doing business task");
        this.userBo = userBo;
    }
    public String printMsgFromSpring(){
        System.out.println("I am calling userBo to doing business task");
        return userBo.makeBusiness();
    }
    
}
