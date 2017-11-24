/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class Livraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Client client;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateLivraison;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateReception;
    private double prixLivraison;

    public Livraison() {
    }

    public Livraison(Long id) {
        this.id = id;
    }

    public Livraison(Long id, Date dateLivraison, Date dateReception, double prixLivraison) {
        this.id = id;
        this.dateLivraison = dateLivraison;
        this.dateReception = dateReception;
        this.prixLivraison = prixLivraison;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public double getPrixLivraison() {
        return prixLivraison;
    }

    public void setPrixLivraison(double prixLivraison) {
        this.prixLivraison = prixLivraison;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", dateLivraison=" + dateLivraison + ", dateReception=" + dateReception + ", prixLivraison=" + prixLivraison + '}';
    }

}
