/**
* <p>
* @className:UserQueryCondition.java
* @classDescription:
* <p>
* @createTime：2016年8月18日
* @author：Qingyuan
*/

package cn.qingyuan.server.onion.model;

/**
 * <p>
 * 
 * @className:UserQueryCondition.java
 * @classDescription:
 *                    <p>
 * @createTime:2016年8月18日
 * @author:Qingyuan
 */

public class UserQueryCondition {
	private long uid;
	private Integer gender;
	private String name;
	private String nick;

	public long getUid() {
		return uid;
	}

	public UserQueryCondition setUid(long uid) {
		this.uid = uid;
		return this;
	}

	public Integer getGender() {
		return gender;
	}

	public UserQueryCondition setGender(int gender) {
		this.gender = gender;
		return this;
	}

	public String getName() {
		return name;
	}

	public UserQueryCondition setName(String name) {
		this.name = name;
		return this;
	}

	public String getNick() {
		return nick;
	}

	public UserQueryCondition setNick(String nick) {
		this.nick = nick;
		return this;
	}
}
