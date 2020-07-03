package top.glkj.pojo;

import javax.persistence.*;

public class User {
    @Column(name = "Id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String username;

    private String password;

    private String usex;

    private String hobby;

    /**
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return usex
     */
    public String getUsex() {
        return usex;
    }

    /**
     * @param usex
     */
    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    /**
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
}