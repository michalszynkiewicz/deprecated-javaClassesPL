/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.uksw.j2eecourse;

/**
 *
 * @author Aleksander Nowinski <a.nowinski@icm.edu.pl>
 */
public class LoginValidator {
    public static final String LOGIN_REGEX = "[a-zA-Z0-9]{4,12}";
            
    boolean loginValid(String login) {
        if(login==null || login.isEmpty()) {
            return false;
        }
        return login.matches(LOGIN_REGEX);
    }
}
