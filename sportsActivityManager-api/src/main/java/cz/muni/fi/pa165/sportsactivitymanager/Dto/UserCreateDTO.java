package cz.muni.fi.pa165.sportsactivitymanager.Dto;

import cz.muni.fi.pa165.sportsactivitymanager.Enums.Sex;
import java.util.Objects;

/**
 *
 * @author Maemi
 */
public class UserCreateDTO {
    
    private String name;
    private Integer age;
    private Double weight;
    private Sex SEX;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Sex getSEX() {
        return SEX;
    }

    public void setSEX(Sex SEX) {
        this.SEX = SEX;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserCreateDTO other = (UserCreateDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    
    
    
}
