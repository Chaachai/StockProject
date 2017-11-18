/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String billDate;
    private double totalPrice;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "bill")
    private List<BillRow> billRows;

    public Bill() {
    }

    public Bill(String id) {
        this.id = id;
    }

    public Bill(String id, String billDate, double totalPrice) {
        this.id = id;
        this.billDate = billDate;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        if (client == null) {
            client = new Client();
        }
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<BillRow> getBillRows() {
        if (billRows == null) {
            billRows = new ArrayList();
        }
        return billRows;
    }

    public void setBillRows(List<BillRow> billRows) {
        this.billRows = billRows;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", billDate=" + billDate + ", totalPrice=" + totalPrice + '}';
    }

}
