import java.io.Serializable;

/**
 * WriteObject
 */
public class Address implements Serializable {
    private static final long SerialVersionUID = 1L;
    String street, country;
    transient int mobile;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMobile(int num) {
        mobile = num;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCountry() {
        return this.country;
    }

    public int getMobile() {
        return this.mobile;
    }

    @Override
    public String toString() {
        return new StringBuffer("Street: ").append(this.street).append(" Country: ").append(this.country).append(" Mobile: ").append(this.mobile).toString();
    }
}