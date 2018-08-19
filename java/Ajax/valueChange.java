/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajax;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author HARSH ARAPLE
 */
@ManagedBean
@SessionScoped
public class valueChange {

    private Map<String, String> countries;
    private Map<String, String> cities;

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }

    @PostConstruct
    public void init() {
        countries = new LinkedHashMap<String,String>();
        cities = new LinkedHashMap<String,String>();

        countries.put("India", "India");
        countries.put("Pakistan", "Pakistan");
        //cities.put("India", "Surat");
    }
    
    public void valuChange(ValueChangeEvent e)
    {
          System.out.println("Old Value : " + e.getOldValue());
          System.out.println("New Value : " + e.getNewValue());
          
          if("India".equals(e.getNewValue()))
          {
              cities.clear();
              cities.put("Surat", "Surat");
              cities.put("Ahemdabad","Ahemdabad");
              cities.put("Baroda","Baroda");
                      
          }else if("Pakistan".equals(e.getNewValue()))
          {
              cities.clear();
              cities.put("Karachi", "Karachi");
              cities.put("Multan","Multan");
              cities.put("Lahore","Lahore");
          }
          
    }

}
