package beans;
/**假定这是一个数据源对象*/
public class OpenDataSource {
	 private String driver;
	 private String url;
	 private String username;
	 private String password;
	 //private Integer coreSize;
	 public OpenDataSource() {
		System.out.println("OpenDataSource()");
	 }
	 public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void init(){
		 System.out.println("init()");
	 }
	 public void getConnection(){
		 System.out.println("getConnection()");
	 }
	 public void close(){
		 System.out.println("close()");
	 }
}
