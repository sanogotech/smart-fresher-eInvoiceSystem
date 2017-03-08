package csc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.models.Users;
import csc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Users findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public Users findByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(name);
	}

	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}
	
	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return (List<Users>) userRepository.findAll();
	}

}