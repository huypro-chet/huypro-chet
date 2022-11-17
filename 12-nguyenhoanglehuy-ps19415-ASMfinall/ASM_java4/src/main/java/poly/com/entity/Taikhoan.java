package poly.com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TAIKHOAN database table.
 * 
 */
@Entity
@Table(name="TAIKHOAN")
@NamedQuery(name="Taikhoan.findAll", query="SELECT t FROM Taikhoan t")
public class Taikhoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="ID")
	private int id; 

	@Column(name="DAXOA")
	private boolean daxoa;

	@Column(name="EMAIL")
	private String email;

	@Column(name="MATKHAU")
	private String matkhau;

	@Column(name="TAIKHOAN")
	private String taikhoan;

	@Column(name="TRANGTHAI")
	private boolean trangthai;

	@Column(name="VAITRO")
	private boolean vaitro;

	//bi-directional many-to-one association to Lichsu
	@OneToMany(mappedBy="taikhoan")
	private List<Lichsu> lichsus;

	public Taikhoan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDaxoa() {
		return this.daxoa;
	}

	public void setDaxoa(boolean daxoa) {
		this.daxoa = daxoa;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return this.matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTaikhoan() {
		return this.taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public boolean getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public boolean getVaitro() {
		return this.vaitro;
	}

	public void setVaitro(boolean vaitro) {
		this.vaitro = vaitro;
	}

	public List<Lichsu> getLichsus() {
		return this.lichsus;
	}

	public void setLichsus(List<Lichsu> lichsus) {
		this.lichsus = lichsus;
	}

	public Lichsu addLichsus(Lichsu lichsus) {
		getLichsus().add(lichsus);
		lichsus.setTaikhoan(this);

		return lichsus;
	}

	public Lichsu removeLichsus(Lichsu lichsus) {
		getLichsus().remove(lichsus);
		lichsus.setTaikhoan(null);

		return lichsus;
	}

}