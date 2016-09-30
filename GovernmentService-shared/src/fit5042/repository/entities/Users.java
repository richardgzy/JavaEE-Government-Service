/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.repository.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Richard's Surface
 */
enum UserType
{
    GOVERNMENT_WORKER,
    PUBLIC
}

/**
 *
 * @author Richard's Surface
 */
@Entity
@NamedQueries({@NamedQuery(name = Users.GET_ALL_QUERY_NAME, query = "SELECT u FROM Users u")})
public class Users implements Serializable
{
    @Id
    @Column(name = "User_Id")
    private int id;
    @Column(name = "User_LName")
    private String lastName;
    @Column(name = "User_FName")
    private String firstName;
    @Column(name = "User_Email")
    private String email;
    @Column(name = "User_Password")
    private String password;
    @Column(name = "User_Type")
    private String type; // two user types
    @Column(name = "User_Address")
    private String address;
    @Column(name = "User_Phone")
    private int phone;
    public static final String GET_ALL_QUERY_NAME = "User.getAll";

    public Users() {
    }

    public Users(int id, String lastName, String firstName, String email, String password, String type, String address, int phone){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.type = type;
        this.address = address;
        this.phone = phone;
    }
    
    public int getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getType()
    {
        return type;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

}
