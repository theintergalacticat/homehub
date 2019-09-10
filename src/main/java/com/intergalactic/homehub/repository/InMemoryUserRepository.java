package com.intergalactic.homehub.repository;

import com.intergalactic.homehub.model.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserRepository implements UserRepository
{
	@Override public Iterable<User> findAll()
	{
		List<User> userList = new ArrayList<>();
		User user = new User();
		userList.add(user);
		return userList;
	}

	@Override public User save(User user)
	{
		return new User();
	}

	@Override public User findUser(Long id)
	{
		return new User();
	}

	@Override public void deleteUser(Long id)
	{

	}
}
