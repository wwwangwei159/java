package sy.model;

public class User {
    private Integer userid;

    private String resourceId;

    private String loginid;

    private Integer sourcecompany;

    private String name;

    private String userTitle;

    private Integer jobcodeid;

    private Integer costCenterId;

    private Integer globalId;

    private String emailaddress;

    private String resourceTitle;

    private String platform;

    private String url;

    private String parentresource;

    private Integer supportcompany;

    private Integer companyNo;

    private Integer userloc;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public Integer getSourcecompany() {
        return sourcecompany;
    }

    public void setSourcecompany(Integer sourcecompany) {
        this.sourcecompany = sourcecompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle == null ? null : userTitle.trim();
    }

    public Integer getJobcodeid() {
        return jobcodeid;
    }

    public void setJobcodeid(Integer jobcodeid) {
        this.jobcodeid = jobcodeid;
    }

    public Integer getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(Integer costCenterId) {
        this.costCenterId = costCenterId;
    }

    public Integer getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Integer globalId) {
        this.globalId = globalId;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle == null ? null : resourceTitle.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParentresource() {
        return parentresource;
    }

    public void setParentresource(String parentresource) {
        this.parentresource = parentresource == null ? null : parentresource.trim();
    }

    public Integer getSupportcompany() {
        return supportcompany;
    }

    public void setSupportcompany(Integer supportcompany) {
        this.supportcompany = supportcompany;
    }

    public Integer getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Integer companyNo) {
        this.companyNo = companyNo;
    }

    public Integer getUserloc() {
        return userloc;
    }

    public void setUserloc(Integer userloc) {
        this.userloc = userloc;
    }
}