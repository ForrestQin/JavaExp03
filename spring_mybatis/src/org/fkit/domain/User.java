
package org.fkit.domain;

import java.io.Serializable;

/**
 * 官方网站
 * www.fkjava.org
 * www.facejava.org
 * 学习交流论坛
 * www.crazyit.org
 *
 * @author 肖文吉
 * 
 * CREATE TABLE `tb_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(18) DEFAULT NULL,
  `sid` CHAR(25) DEFAULT NULL,
  `sclass` CHAR(255) DEFAULT NULL,
  PRIMARY KEY  (`id`)
)
 */
public class User implements Serializable{
	// 用户标识
	private Integer id;
	// 用户姓名
	private String name;
	// 用户性别
	private String sid;
	// 用户年龄
	private String sclass;
	
	// 无参数构造器
	public User() {
		super();
	}
	// 有参数构造器

	public Integer getId() {
		return id;
	}

	public User(int id, String name, String sid, String sclass) {
		super();
		this.id = id;
		this.name = name;
		this.sid = sid;
		this.sclass = sclass;
	}
	
	public User(String name, String sid, String sclass) {
		super();
		this.name = name;
		this.sid = sid;
		this.sclass = sclass;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sid=" + sid + ", sclass=" + sclass + "]";
	}

	

}
