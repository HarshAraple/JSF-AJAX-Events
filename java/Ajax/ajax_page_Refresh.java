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
@ManagedBean
@SessionScoped
public class ajax_page_Refresh {

    private String name;
    private String outputText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }

    public void sayHello() {
        outputText = "Hello " + name;
        System.out.println("Name : " + name);
        System.out.println("outputText : " + outputText);
    }
}
