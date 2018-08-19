/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HARSH ARAPLE
 */
@SessionScoped
@ManagedBean
public class ajax_event {
 String g;
    public void ajaxClick() {
        System.out.println("Ajax Click");
    }

    public void ajaxChange() {
        System.out.println("Ajax Change");
    }

    public void ajaxBlur() {
        System.out.println("Ajax Blur");
    }

    public void ajaxFocus() {
        System.out.println("Ajax Focus");
    }

    public void ajaxKeydown() {
        System.out.println("Ajax Key Down");
    }

    public void ajaxKeyup() {
        System.out.println("Ajax key up");
    }

    public void ajaxKeypress() {
        System.out.println("Ajax key press");
    }

    public void ajaxMouseup() {
        System.out.println("Ajax mouseup");
    }

    public void ajaxMousedown() {
        System.out.println("Ajax mousedown");
    }

}
