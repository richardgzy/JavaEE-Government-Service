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
@Entity
@NamedQueries({@NamedQuery(name = Service.GET_ALL_QUERY_NAME, query = "SELECT s FROM Service s")})
public class Service implements Serializable{
    @Id
    @Column(name = "Service_No")
    private int no;
    @Column(name = "Service_Name")
    private String name;
    // TODO: what kind of type are not clearly clarified yet
    @Column(name = "Service_Type")
    private String type;
    @Column(name = "Service_Thumbnail")
    private String thumbnail;
    @Column(name = "Service_Description")
    private String description;
    public static final String GET_ALL_QUERY_NAME = "Service.getAll";
    
    public Service() {
    }
    
    public Service(int no, String name, String type, String thumbnail, String description){
        this.no = no;
        this.name = name;
        this.type = type;
        this.thumbnail = thumbnail;
        this.description = description;
    }
    
    public int getNo()
    {
        return no;
    }

    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public String getDescription()
    {
        return description;
    }

    public void setNo(int no)
    {
        this.no = no;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setThumbnail(String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    
}
