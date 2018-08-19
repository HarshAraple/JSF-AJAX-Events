/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajax;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HARSH ARAPLE
 */
@ManagedBean(name = "loading")
@SessionScoped
public class lodingScreen {

    private String res;

    public void sendAction() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.err.println("Wrong");
        }

        res = "Success Operation :" + new Date();
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
}
