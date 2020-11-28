package uni.fmi.masters.services;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uni.fmi.masters.bean.UserBean;
import uni.fmi.masters.controller.LoginController;
import uni.fmi.masters.repo.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;

	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public UserBean findUserByUsernameAndPassword(String username, String password) {
		// validation
		return userRepo.findUserByUsernameAndPassword(username, password);
	}

	public UserBean findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	public Collection<UserBean> findAll() {
		return userRepo.findAll();
	}

	@PostConstruct
	public void generateTestData() {
		if (userRepo.count() == 0) {
			UserBean user1 = new UserBean("Ivan", LoginController.hashPassword("password"), "test@test.com");
			UserBean user2 = new UserBean("Petar", LoginController.hashPassword("password"), "test1@test.com");
			UserBean user3 = new UserBean("Gosho", LoginController.hashPassword("password"), "test2@test.com");
			userRepo.save(user1);
			userRepo.save(user2);
			userRepo.save(user3);
		}
	}

}
