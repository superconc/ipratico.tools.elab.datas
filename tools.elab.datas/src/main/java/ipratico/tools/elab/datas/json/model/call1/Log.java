package ipratico.tools.elab.datas.json.model.call1;

public class Log {
	private String modifiedDate;
    private String createdBy;
    private String modifiedBy;
    private String createdDate;
    private String shared;
    private String application;
    private String appVersion;
    private String responsibleDevice;
    
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getShared() {
		return shared;
	}
	public void setShared(String shared) {
		this.shared = shared;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getResponsibleDevice() {
		return responsibleDevice;
	}
	public void setResponsibleDevice(String responsibleDevice) {
		this.responsibleDevice = responsibleDevice;
	}
	@Override
	public String toString() {
		return "Log [modifiedDate=" + modifiedDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", createdDate=" + createdDate + ", shared=" + shared + ", application=" + application
				+ ", appVersion=" + appVersion + ", responsibleDevice=" + responsibleDevice + "]";
	}
	
}
