package streamProjectEx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*
 Stream introduced in java8 
 used to process collection elements
 Stream is sequence of object that supports multiple methods 
 which can be pipe line produced output .
 stream is not a data structure
 Stream is does not change actual data / original data,
 they only provide the result.
 
 */
public class FindAllAdmin {
	
	public static void main(String[] args) {
		User user = new  User("raja", "admin");
		User user1 = new  User("sai", "member");
		User user2 = new  User("anuja", "admin");
		User user3 = new  User("priya", "member");
		ArrayList<User>adminUsers = new ArrayList();
		List<User> userList =Arrays.asList(user,user1,user2,user3);
		//for loop is working as iterator to fetch object/elements  store in list.
		
/*               for(User userObj : userList)
		      {
			                      if(userObj.getRole().equals("member")) {
				                            adminUsers.add(userObj);
		}
		
	}
	*/
		Predicate<User> adminUserCondition = input  ->input.getRole().equalsIgnoreCase("admin");
				                                                                           
		
		List<User>adminUsers1 = userList.stream() // converting the list object to sequence of elements 
				.filter(adminUserCondition)// with filter method we are selecting elements as per the given  predicate.
				.collect(Collectors.toList());  //this method is basically is used to return the result of the operation 
	           
		adminUsers.forEach((userObj) ->System.out.println(userObj));
	                             
		//converting list object  to sequence of elements
		
                        for(User userObj:adminUsers1) {
	                                          System.out.println(userObj);
}

}
}
