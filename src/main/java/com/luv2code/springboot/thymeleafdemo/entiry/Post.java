package com.luv2code.springboot.thymeleafdemo.entiry;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "post")
public class Post {

	// define field

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num")
	private int num;

	@Column(name = "writer")
	private String writer;

	@Column(name = "email")
	private String email;

	@Column(name = "subject")
	private String subject;

	@Column(name = "passwd")
	private String passwd;

	@Column(name = "regDate")
	@CreatedDate
	private LocalDateTime regDate;

	@Column(name = "readcount")
	private int readcount;

	@Column(name = "ref")
	private int ref;

	@Column(name = "re_step")
	private int re_step;

	@Column(name = "re_level")
	private int re_level;

	@Column(name = "content")
	private String content;

	@Column(name = "ip")
	private String ip;

	// define constructor
	public Post() {

	}

	public Post(int num, String writer, String email, String subject, String passwd, LocalDateTime regDate,
			int readcount, int ref, int re_step, int re_level, String content, String ip) {
		this.num = num;
		this.writer = writer;
		this.email = email;
		this.subject = subject;
		this.passwd = passwd;
		this.regDate = regDate;
		this.readcount = readcount;
		this.ref = ref;
		this.re_step = re_step;
		this.re_level = re_level;
		this.content = content;
		this.ip = ip;
	}

	public Post(String writer, String email, String subject, String passwd, LocalDateTime regDate, int readcount,
			int ref, int re_step, int re_level, String content, String ip) {
		this.writer = writer;
		this.email = email;
		this.subject = subject;
		this.passwd = passwd;
		this.regDate = regDate;
		this.readcount = readcount;
		this.ref = ref;
		this.re_step = re_step;
		this.re_level = re_level;
		this.content = content;
		this.ip = ip;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public LocalDateTime getReg_date() {
		return regDate;
	}

	public void setReg_date(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

	public int getRe_level() {
		return re_level;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Post [num=" + num + ", writer=" + writer + ", email=" + email + ", subject=" + subject + ", passwd="
				+ passwd + ", regDate=" + regDate + ", readcount=" + readcount + ", ref=" + ref + ", re_step="
				+ re_step + ", re_level=" + re_level + ", content=" + content + ", ip=" + ip + "]";
	}

}
