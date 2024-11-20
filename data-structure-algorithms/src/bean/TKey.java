package bean;

public class TKey {
	private String value;
	
	public TKey() {
	}
	
	public TKey(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null && getClass() != o.getClass()) return false;
		TKey that = (TKey) o;
		return value.equals(that.value);
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
