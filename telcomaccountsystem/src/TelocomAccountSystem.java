
public class TelocomAccountSystem {
	
	public static void main(String[] args){
		//实例化一个电信用户类TelcomUser
		TelcomUser telcomUser = new TelcomUser("1380013800");	//生成通话记录
		telcomUser.generateCommunicateRecord();
		//打印通话详单
		telcomUser.printDetails();
	}

}
