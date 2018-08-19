/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajax;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HARSH ARAPLE
 */
@ManagedBean
@SessionScoped
public class pretty_update {
    private String name;
    private boolean editText;

    @PostConstruct
    public void init()
    {
        name = "Harsh Araple";
    }

    public void updateText()
    {
        editText = true;
    }
    
    public void saveText()
    {
        editText = false;
    }
    
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEditText() {
        return editText;
    }

    public void setEditText(boolean editText) {
        this.editText = editText;
    }

}


