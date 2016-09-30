/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fit5042.repository.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 * 
 * @author Richard's Surface
 */
@Entity
public class ServiceUse implements Serializable {

    // ID number of Service Use
    @Id
    @Column(name = "ServiceUse_useID")
    private int useId;
    // Member of public using the service
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Use_By", nullable = false)
    private Users publicUser;
    // Date when the service is used
    @Column(name = "ServiceUse_useDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date useDate;
    // The services that the service use include
    @OneToMany
    private List<Service> serviceList;
    // Government worker linked to the service/transaction
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Governed_By", nullable = false)
    private Users governmentWorker;

    public ServiceUse() {
    }

    public ServiceUse(int useId, Users publicUser, Date useDate, Users governmentWorker){
        this.useId = useId;
        this.publicUser = publicUser;
        this.useDate = useDate;
        this.governmentWorker = governmentWorker;
        this.serviceList = new ArrayList<>();
    }
    
    public int getUseId()
    {
        return useId;
    }

    public Users getPublicUser()
    {
        return publicUser;
    }

    public Date getUseDate()
    {
        return useDate;
    }

    public List<Service> getServiceList()
    {
        return serviceList;
    }

    public Users getGovernmentWorker()
    {
        return governmentWorker;
    }

    public void setUseId(int useId)
    {
        this.useId = useId;
    }

    public void setPublicUser(Users publicUser)
    {
        this.publicUser = publicUser;
    }

    public void setUseDate(Date useDate)
    {
        this.useDate = useDate;
    }

    public void setServiceList(List<Service> serviceList)
    {
        this.serviceList = serviceList;
    }

    public void setGovernmentWorker(Users governmentWorker)
    {
        this.governmentWorker = governmentWorker;
    }
    
}
