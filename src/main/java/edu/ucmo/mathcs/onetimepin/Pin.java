package edu.ucmo.mathcs.onetimepin;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "otp_pins")
public class Pin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long oid;
	
	private String account;
	
	@Column(unique = true)
	private String pin;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTimestamp;
	
	private String createIp;
	
	private String createUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date expireTimestamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date claimTimestamp;
	
	private String claimUser;
	
	private String claimIp;
	
	public Long getOid() {
		return oid;
	}
	
	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public Date getCreateTimestamp() {
		return createTimestamp;
	}
	
	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	
	public String getCreateIp() {
		return createIp;
	}
	
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public Date getExpireTimestamp() {
		return expireTimestamp;
	}
	
	public void setExpireTimestamp(Date expireTimestamp) {
		this.expireTimestamp = expireTimestamp;
	}
	
	public Date getClaimTimestamp() {
		return claimTimestamp;
	}
	
	public void setClaimTimestamp(Date claimTimestamp) {
		this.claimTimestamp = claimTimestamp;
	}
	
	public String getClaimUser() {
		return claimUser;
	}
	
	public void setClaimUser(String claimUser) {
		this.claimUser = claimUser;
	}
	
	public String getClaimIp() {
		return claimIp;
	}
	
	public void setClaimIp(String claimIp) {
		this.claimIp = claimIp;
	}
	
}