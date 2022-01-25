package in.beautify.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
public class UserroleLoginEntity {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private AppuserLoginEntity appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Role_Id", nullable = false)
    private ApproleLoginEntity appRole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AppuserLoginEntity getAppUser() {
		return appUser;
	}

	public void setAppUser(AppuserLoginEntity appUser) {
		this.appUser = appUser;
	}

	public ApproleLoginEntity getAppRole() {
		return appRole;
	}

	public void setAppRole(ApproleLoginEntity appRole) {
		this.appRole = appRole;
	}

   
    
}
