package cn.fh.security.credential;

import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of Credential interface. This object represents the identification of
 * the current user, therefore it should live in the session scope.
 * 
 * @author whf
 *
 */
public class DefaultCredential implements Credential {
	protected List<String> roleList = new ArrayList<String>();
	protected String username;
	protected String nickName;
	protected Integer credits;
	/**
	 * The primary key of this member entity
	 */
	protected Integer id;

	@Override
	public Integer getCredits() {
		return this.credits;
	}

	
	public DefaultCredential(Integer id, String username, String nickName, Integer credits) {
		this.id = id;
		this.username = username;
		this.nickName = nickName;
		this.credits = credits;
	}

	public DefaultCredential(Integer id, String username) {
		this.id = id;
		this.username = username;
	}
	

	@Override
	public void setUsername(String name) {
		this.username = name;
	}


	@Override
	public void setNickName(String name) {
		this.nickName = name;
	}


	@Override
	public void setCredits(Integer point) {
		this.credits = point;
	}


	@Override
	public Integer getId() {
		return this.id;
	}
	

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public String getNickName() {
		return this.nickName;
	}
	
	@Override
	public final void addRole(String roleName) {
		this.roleList.add(roleName);
	}
	
	@Override
	public final void addRoles(String[] roleNames) {
		for (String role : roleNames) {
			this.roleList.add(role);
		}
	}

    @Override
    public final void addRoles(List<String> roleList) {
        this.roleList.addAll(roleList);
    }

	@Override
	public final List<String> getRoleList() {
		return this.roleList;
	}

	@Override
	public final boolean hasRole(String roleName) {
		return this.roleList.contains(roleName);
	}

}
