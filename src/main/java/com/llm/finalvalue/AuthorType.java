package com.llm.finalvalue;

public enum AuthorType {
	ROLE_ADMIN("管理员"), ROLE_VIP("会员用户"),ROLE_USER("普通用户");
	private String cname;// 中文名称

	private AuthorType(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
