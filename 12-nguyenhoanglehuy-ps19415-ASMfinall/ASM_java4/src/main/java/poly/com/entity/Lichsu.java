package poly.com.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Date;



/**
 * The persistent class for the LICHSU database table.
 * 
 */
@Entity
@Table(name="LICHSU")
@NamedQuery(name="Lichsu.findAll", query="SELECT l FROM Lichsu l")
public class Lichsu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="ID")
	private int id;

	private boolean isliked;

	private Date likedate;

	private Date viewdate;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne
	@JoinColumn(name="TENSPID")
	private Sanpham sanpham;

	//bi-directional many-to-one association to Taikhoan
	@ManyToOne
	@JoinColumn(name="TAIKHOANID")
	private Taikhoan taikhoan;

	public Lichsu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsliked() {
		return this.isliked;
	}

	public void setIsliked(boolean isliked) {
		this.isliked = isliked;
	}

	public Date getLikedate() {
		return this.likedate;
	}

	public void setLikedate(Date likedate) {
		this.likedate = likedate;
	}

	public Date getViewdate() {
		return this.viewdate;
	}

	public void setViewdate(Date viewdate) {
		this.viewdate = viewdate;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public Taikhoan getTaikhoan() {
		return this.taikhoan;
	}

	public void setTaikhoan(Taikhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

}