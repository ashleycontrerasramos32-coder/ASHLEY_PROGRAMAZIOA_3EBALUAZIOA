package ud6_2zatia;

import java.util.Objects;

public class Item {
	
	private String izena;
	private float prezioa;
	
	public Item(String izena, float prezioa) {
		super();
		this.izena = izena;
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Item [izena=" + izena + ", prezioa=" + prezioa + "]";
	}

	public float getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(float prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(izena, prezioa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(izena, other.izena)
				&& Float.floatToIntBits(prezioa) == Float.floatToIntBits(other.prezioa);
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	

}
