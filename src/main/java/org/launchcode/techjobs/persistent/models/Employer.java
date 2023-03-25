package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(min = 3, max = 50, message = "Location should be 3-50 Characters long")
    private String location;




    public Employer (String location) {
        this.location = location;
    }

    public Employer () {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
