package in.beautify.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_user")
public class AppuserLoginEntity {

    @Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Long userid;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "enabled",  nullable = false)
    private boolean enabled;

    public Long getUserId() {
        return userid;
    }

    public void setUserId(Long userId) {
        this.userid = userId;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	public AppuserLoginEntity(Long userid, String username, String password, boolean enabled) {
		
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
    
    
    
    
    

}
	
	
	
	


