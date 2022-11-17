package poly.com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SANPHAM database table.
 * 
 */
@Entity
@Table(name="SANPHAM")
@NamedQuery(name="Sanpham.findAll", query="SELECT s FROM Sanpham s")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="ID")
	private int id;

	@Column(name="CODELINK")
	private String codelink;

	@Column(name="LUOTTUONGTAC")
	private int luottuongtac;

	@Column(name="LUOTXEM")
	private int luotxem;

	@Column(name="MOTASP")
	private String motasp;

	@Column(name="PORTER")
	private String porter;

	@Column(name="TENSP")
	private String tensp;

	@Column(name="TRANGTHAI")
	private boolean trangthai;

	//bi-directional many-to-one association to Lichsu
	@OneToMany(mappedBy="sanpham")
	private List<Lichsu> lichsus;

	public Sanpham() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodelink() {
		return this.codelink;
	}

	public void setCodelink(String codelink) {
		this.codelink = codelink;
	}

	public int getLuottuongtac() {
		return this.luottuongtac;
	}

	public void setLuottuongtac(int luottuongtac) {
		this.luottuongtac = luottuongtac;
	}

	public int getLuotxem() {
		return this.luotxem;
	}

	public void setLuotxem(int luotxem) {
		this.luotxem = luotxem;
	}

	public String getMotasp() {
		return this.motasp;
	}

	public void setMotasp(String motasp) {
		this.motasp = motasp;
	}

	public String getPorter() {
		return this.porter;
	}

	public void setPorter(String porter) {
		this.porter = porter;
	}

	public String getTensp() {
		return this.tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public boolean getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public List<Lichsu> getLichsus() {
		return this.lichsus;
	}

	public void setLichsus(List<Lichsu> lichsus) {
		this.lichsus = lichsus;
	}

	public Lichsu addLichsus(Lichsu lichsus) {
		getLichsus().add(lichsus);
		lichsus.setSanpham(this);

		return lichsus;
	}

	public Lichsu removeLichsus(Lichsu lichsus) {
		getLichsus().remove(lichsus);
		lichsus.setSanpham(null);

		return lichsus;
	}

}