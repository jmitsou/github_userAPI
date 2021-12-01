package com.careerdevs.github_userAPI.models;

public class GitUser {

    private Integer id;
    private String login;
    private String url;
    private String repos_url;

    public GitUser(Integer id, String login, String url, String repos_url) {
        this.id = id;
        this.login = login;
        this.url = url;
        this.repos_url = repos_url;
    }

    public GitUser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }
}
