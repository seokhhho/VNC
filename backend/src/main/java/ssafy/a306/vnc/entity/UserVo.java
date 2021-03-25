package ssafy.a306.vnc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Data
@NoArgsConstructor
@Getter
@Entity(name="User")
@Builder
public class UserVo {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userIdx;

//    @Column(name="userEmail")
    private String userEmail;
//    @Column(name="userName")
    private String userName;
//    @Column(name="loginType")
    private String loginType;
//    @Column(name="privateKey")
    private String privateKey;
    
    
    public UserVo(int userIdx, String userEmail, String userName, String loginType, String privateKey) {
        this.userIdx = userIdx;
        this.userEmail = userEmail;
        this.userName = userName;
        this.loginType = loginType;
        this.privateKey = privateKey;
    }
}