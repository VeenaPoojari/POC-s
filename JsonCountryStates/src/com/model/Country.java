package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Country generated by MyEclipse - Hibernate Tools
 */

public class Country  implements java.io.Serializable {


    // Fields    

     private Integer countryId;
     private String countryName;
     private Set states = new HashSet(0);


    // Constructors

    /** default constructor */
    public Country() {
    }

	/** minimal constructor */
    public Country(Integer countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }
    
    /** full constructor */
    public Country(Integer countryId, String countryName, Set states) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.states = states;
    }

   
    // Property accessors

    public Integer getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set getStates() {
        return this.states;
    }
    
    public void setStates(Set states) {
        this.states = states;
    }
   








}