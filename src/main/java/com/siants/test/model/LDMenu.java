package com.siants.test.model;

public class LDMenu {
    private String nodecode;

    private String parentnodecode;

    private String nodelevel;

    private String nodename;

    private String nodepinyin;

    private String childflag;

    private String nodekey;

    private String runscript;

    private String nodedescription;

    private String nodesign;

    private Integer nodeorder;

    public String getNodecode() {
        return nodecode;
    }

    public void setNodecode(String nodecode) {
        this.nodecode = nodecode == null ? null : nodecode.trim();
    }

    public String getParentnodecode() {
        return parentnodecode;
    }

    public void setParentnodecode(String parentnodecode) {
        this.parentnodecode = parentnodecode == null ? null : parentnodecode.trim();
    }

    public String getNodelevel() {
        return nodelevel;
    }

    public void setNodelevel(String nodelevel) {
        this.nodelevel = nodelevel == null ? null : nodelevel.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getNodepinyin() {
        return nodepinyin;
    }

    public void setNodepinyin(String nodepinyin) {
        this.nodepinyin = nodepinyin == null ? null : nodepinyin.trim();
    }

    public String getChildflag() {
        return childflag;
    }

    public void setChildflag(String childflag) {
        this.childflag = childflag == null ? null : childflag.trim();
    }

    public String getNodekey() {
        return nodekey;
    }

    public void setNodekey(String nodekey) {
        this.nodekey = nodekey == null ? null : nodekey.trim();
    }

    public String getRunscript() {
        return runscript;
    }

    public void setRunscript(String runscript) {
        this.runscript = runscript == null ? null : runscript.trim();
    }

    public String getNodedescription() {
        return nodedescription;
    }

    public void setNodedescription(String nodedescription) {
        this.nodedescription = nodedescription == null ? null : nodedescription.trim();
    }

    public String getNodesign() {
        return nodesign;
    }

    public void setNodesign(String nodesign) {
        this.nodesign = nodesign == null ? null : nodesign.trim();
    }

    public Integer getNodeorder() {
        return nodeorder;
    }

    public void setNodeorder(Integer nodeorder) {
        this.nodeorder = nodeorder;
    }
}