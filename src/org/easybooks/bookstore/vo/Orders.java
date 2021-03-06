package org.easybooks.bookstore.vo;

//import java.sql.Timestamp;
import java.util.Date;//改过
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private User user;
	private Date orderdate;//改过
	private Set orderitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(User user, Date orderdate) {//改过
		this.user = user;
		this.orderdate = orderdate;
	}

	/** full constructor */
	public Orders(User user, Date orderdate, Set orderitems) {//改过
		this.user = user;
		this.orderdate = orderdate;
		this.orderitems = orderitems;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getOrderdate() {//改过
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {//改过
		this.orderdate = orderdate;
	}

	public Set getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set orderitems) {
		this.orderitems = orderitems;
	}

}